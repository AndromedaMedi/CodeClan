# WRITE YOUR FUNCTIONS HERE

def get_pet_shop_name(name):
    return name["name"]

def get_total_cash(sum):
    return sum["admin"]["total_cash"]

def add_or_remove_cash(cash, number):
    cash["admin"]["total_cash"] += number

def get_pets_sold(pets):
    return pets["admin"]["pets_sold"]

def increase_pets_sold(pets, number):
    pets["admin"]["pets_sold"] += number

def get_stock_count(pets):
    return len(pets["pets"])


def get_pets_by_breed(pets, breed):
    pet_breeds = []
    for pet in pets["pets"]:
        if pet["breed"] == breed:
            pet_breeds.append(pets["pets"])
    return pet_breeds

def find_pet_by_name(pets, name):
    for pet in pets["pets"]:
        if pet["name"] == name:
           return pet

def remove_pet_by_name(pets, name):
    for pet in pets["pets"]:
        if pet["name"] == name:
            pets["pets"].remove(pet)

def add_pet_to_stock(pets, new_pet):
    pets["pets"].append(new_pet)

def get_customer_cash(customers):
    return customers["cash"]

def remove_customer_cash(customer, cash):
    customer["cash"] -= cash

def get_customer_pet_count(customer_pet_count):
    return len(customer_pet_count["pets"])

def add_pet_to_customer(customer, new_pet):
    customer["pets"].append(new_pet)

def customer_can_afford_pet(customer, new_pet):
    if customer["cash"] >= new_pet["price"]:
        return True
    else:
        return False

def sell_pet_to_customer(pets, pet, customer):
    if pet in pets["pets"] and customer_can_afford_pet(customer, pet):
        increase_pets_sold(pets, 1)
        remove_customer_cash(customer, pet["price"])
        add_or_remove_cash(pets, pet["price"])
        add_pet_to_customer(customer, pet)



