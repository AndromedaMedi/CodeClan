united_kingdom = [
  {
    "name": "Scotland",
    "population": 5295000,
    "capital": "Edinburgh"
  },
  {
    "name": "Wales",
    "population": 3063000,
    "capital": "Swansea"
  },
  {
    "name": "England",
    "population": 53010000,
    "capital": "London"
  }
]

# 1. Change the capital of Wales from `"Swansea"` to `"Cardiff"`.
united_kingdom.append[united_kingdom]

# 2. Create a dictionary for Northern Ireland and add it to the `united_kingdom` list (The capital is Belfast, and the population is 1,811,000).
united_kingdom_updated.append({"name": "Northern Ireland", "population": 1811000,"capital": "Belfast"})
print(united_kingdom_updated)

# 3. Use a loop to print the names of all the countries in the UK.
for united_kingdom_updated in united_kingdom_updated:
        print(f'{united_kingdom_updated["name"]}')

total_population = 0

# 4. Use a loop to find the total population of the UK.
for united_kingdom_updated in united_kingdom_updated:
    total_population += united_kingdom_updated["population"]

print(f'{total_population}')
