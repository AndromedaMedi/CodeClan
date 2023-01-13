def return_10():
    return 10

def add(num_1, num_2):
    return num_1 + num_2

def subtract(num_1, num_2):
    return num_1 - num_2

def multiply(num_1, num_2):
    return num_1 * num_2

def divide(num_1, num_2):
    return num_1 / num_2

def length_of_string(string_length):
    return len(string_length)


def join_string(string_1, string_2):
    return string_1 + string_2

def add_string_as_number(string_1, string_2):
    return int(string_1) + int(string_2)

def number_to_full_month_name(month_num):
    month_name = {1: "January", 2: "February", 3: "March", 4: "April", 5: "May", 6: "June", 7: "July", 8: "August", 9: "September", 10: "October", 11: "November", 12: "December"}
    return month_name[month_num]

def number_to_short_month_name(month_short_num):
    month_name_short = {1: "Jan", 2: "Feb", 3: "Mar", 4: "Apr", 5: "May", 6: "Jun", 7: "Jul", 8: "Aug", 9: "Sep", 10: "Oct", 11: "Nov", 12: "Dec"}
    return month_name_short[month_short_num]

def cube_volume(num):
    return num**3

def string_reversed(str):
    return str.reverse()

def fahrenheit_to_celsius(temp):
    result = (temp - 32) * (5/9)
    return round(result, 2)

def manipulate(num):
    num += 10
    print(num)
    num /= 2
    print(num)


    