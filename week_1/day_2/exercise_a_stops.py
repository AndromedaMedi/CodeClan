stops = [ "Croy", "Cumbernauld", "Falkirk High", "Linlithgow", "Livingston", "Haymarket" ]

# I ended up printing after every change to make sure I was doing it right

stops.append("Edinburgh Waverley")
print(stops)

stops.insert(0, "Glasgow Queen St")
print(stops)

stops.insert(4, "Polmont")
print(stops)

index = stops.index("Linlithgow")
print(index)

stops.remove("Livingston")
print(stops)

stops.pop(2)
print(stops)

print(len(stops))

sorted_stops = sorted(stops)
print(sorted_stops)

new_sorted_stops = sorted(stops, reverse = True)
print(new_sorted_stops)

for stop in new_sorted_stops:
    print(stop)
    