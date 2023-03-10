from app import app
from flask import render_template, request, redirect
from models.book import Book
from models.books import books, texts, add_new_book, remove_book


@app.route("/")
def index():
    return render_template("index.html")

@app.route("/books")
def show_books():
    return render_template("books.html", books=books)

@app.route("/books/<int:index>")
def show_book_details(index):
    selected_book = books[index]
    selected_text = texts[index]
    return render_template("book.html", book=selected_book, text=selected_text)

@app.route("/delete-book/<int:index>", methods=["POST"])
def detete_book(index):
    selected_book = books[index]
    remove_book(selected_book)
    return redirect("/books")

@app.route("/books/new")
def new_book():
    return render_template("new_book.html")

@app.route("/books", methods=["POST"])
def save_new_book():
    title = request.form["title"]
    author = request.form["author"]
    genre = request.form["genre"]
    checked_out = False if "checkout" in request.form else True
    new_book = Book(title=title, author=author, genre=genre, checked_out=checked_out)
    add_new_book(new_book)

    return redirect("/books")


# @app.route("/delete-book/<int:index>", methods=["POST"])
# def delete_book(index):
#     books.pop(index)
#     return redirect("/books")
