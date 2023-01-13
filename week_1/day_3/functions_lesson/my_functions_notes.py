# def greet(name,time_of_day):          # parameter
#     return "Good " + time_of_day + ", " + name  

# greeting = greet("Ash", "Morning")   # argument 
# print(greeting)

# name_1 = "Ash"
# time_of_day_1 = "Morning"
# greeting = greet(name_1, time_of_day_1)
# print (greeting)

# name_2 = "Ben"
# time_of_day_2 = "Afternoon"
# greeting = greet(name_2, time_of_day_2)
# # print(greeting)


# def greet():
#     words = "Hey"
#     return words

# def greet_two():
#     words = "Hey"
#     return words
# print (greet_two())



chickens = [
  { "name": "Margaret", "age": 2, "eggs": 0 },
  { "name": "Hetty", "age": 1, "eggs": 2 },
  { "name": "Henrietta", "age": 3, "eggs": 1 },
  { "name": "Audrey", "age": 2, "eggs": 0 },
  { "name": "Mabel", "age": 5, "eggs": 1 },
]

def count_eggs(list):

    total_eggs = 0

    for bird in list:
        total_eggs += bird["eggs"]
        bird["eggs"] = 0 # eggs have been collected
    return (f"{total_eggs} eggs collected")
print (count_eggs(chickens))


# unit testing = testing one section of the code rather than the whole code
# testing = it's good to write the tests first (all will fail) and then write your code (as you go they will pass)