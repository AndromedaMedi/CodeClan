task_list = ["Make dinner", "Wash dishes", "Do laundry"]
print(task_list)
task_list.remove("Do laundry")
print(task_list)
print("No of elements in list are:", len(task_list))


my_task = ("Make dinner", "Tomorrow", 2, False)
print(my_task)
print(my_task[2])
print("No of objects in the tuple:", len(my_task))
index = my_task.index(False)
print(index)

# got stuck here initially
avengers = {
    "Iron Man": {
        "name": "Tony Stark", 
        "moves": {
            "punch": 10, 
            "kick": 100
        }
    },
    "Hulk": { 
        "name": "Bruce Banner", 
        "moves": {
            "smash": 1000, 
            "roll": 500
        }
    }
} 

print(avengers["Hulk"]["moves"]["smash"])
