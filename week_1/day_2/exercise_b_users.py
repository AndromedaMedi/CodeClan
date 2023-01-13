users = {
  "Jonathan": {
    "twitter": "jonnyt",
    "lottery_numbers": [6, 12, 49, 33, 45, 20],
    "home_town": "Stirling",
    "pets": [
    {
      "name": "fluffy",
      "species": "cat"
    },
    {
      "name": "fido",
      "species": "dog"
    },
    {
      "name": "spike",
      "species": "dog"
    }
  ]
  },
  "Erik": {
    "twitter": "eriksf",
    "lottery_numbers": [18, 34, 8, 11, 24],
    "home_town": "Linlithgow",
    "pets": [
    {
      "name": "nemo",
      "species": "fish"
    },
    {
      "name": "kevin",
      "species": "fish"
    },
    {
      "name": "spike",
      "species": "dog"
    },
    {
      "name": "rupert",
      "species": "parrot"
    }
  ]
  },
  "Avril": {
    "twitter": "bridgpally",
    "lottery_numbers": [12, 14, 33, 38, 9, 25],
    "home_town": "Dunbar",
    "pets": [
      {
        "name": "monty",
        "species": "snake"
      }
    ]
  }
}

#1
x = users["Jonathan"]["twitter"]
print(x)

#2
y = users["Erik"]["home_town"]
print(y)

#3
z = users["Erik"]["lottery_numbers"]
print(z)

#4
a = users["Avril"]["pets"][0]["species"]
print(a)

#5
# sorted)users["Erik"]["lottery_numbers"]
z.sort()
print(z[0])

#6
# for number in users ["Avril"]["lottery_numbers"]:
#   if number % 2 == 0:
#     even_numbers.append(number)
# print(even_numbers)
b = users["Avril"]["lottery_numbers"]
for num in b:
    if num % 2 == 0:
        print(num, end=" ")

#7
z.append(7)
print(z)

#8
users["Erik"]["home_town"] = "Edinburgh"
print(users["Erik"]["home_town"])

#9
new_pet = {
  "name": "Fluffy",
  "species": "dog"
}
users["Erik"]["pets"].append(new_pet)
print(users["Erik"]["pets"])

#10
