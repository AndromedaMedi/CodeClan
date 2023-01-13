# WRITE YOUR FUNCTIONS HERE      

def get_pet_shop_name(name):
    return name["name"]

def get_total_cash(sum):
    return sum["admin"]["total_cash"]

def add_or_remove_cash(cash, number):
    cash["admin"]["total_cash"] -= number

def add_or_remove_cash(cash, number):
    cash["admin"]["total_cash"] += number 

def get_pets_sold(sold):
    return sold["admin"]["pets_sold"]

def increase_pets_sold(sold, sale):
    sold["admin"]["pets_sold"] += sale

def get_stock_count(pets):
    return len(pets["pets"])

def get_pets_by_breed(pets, breed):
    pet_breeds = []
    for pet in pets["pets"]:
        if pet["breed"] == breed:
            pet_breeds.append(breed)
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

def get_customer_cash(customer):
    return customer["cash"]

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
        add_pet_to_customer(customer, pet)
        add_or_remove_cash(pets, pet['price'])

# def sell_pet_to_customer(pets, pet, customer):
#    if pet != None and customer_can_afford_pet(customer, pet):
#         remove_pet_by_name(pets, pet["name"])
#         add_pet_to_customer(customer, pet)
#         remove_customer_cash(customer, pet["price"])
#         add_or_remove_cash(pets, pet['price'])
#         increase_pets_sold(pets, 1)

