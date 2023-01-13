document.addEventListener('DOMContentLoaded', () => {
  

  const newItemForm = document.querySelector('#new-item-form')
  newItemForm.addEventListener('submit', handleNewItemFormSubmit);
  

// Handle form
  const createReadingListItem = function(form) {

    const readingListItem = document.createElement('li');
    readingListItem.classList.add('reading-list-item');

    const title = document.createElement('h2');
    title.textContent = form.target.title.value
    readingListItem.appendChild(title);

    const author = document.createElement('h3');
    author.textContent = formtarget.author.value
    readingListItem.appendChild(author);

    const category = document.createElement('p');
    category.textContent = form.target.category.value
    readingListItem.appendChild(category);

    const list = document.querySelector('ul')
    list.appendChild(newListItem)

    return readingListItem
  }



})
