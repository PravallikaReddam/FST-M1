fruits = {
    "grapes" : 50,
    "apple" : 200,
    "banana" :70

}

	
checkFruitAvailablitity = input("What are you looking for? ").lower()

print (checkFruitAvailablitity)
if (checkFruitAvailablitity in fruits ) :
    print(checkFruitAvailablitity, "is available in fruits")
else :
   print(checkFruitAvailablitity, "is not available in fruits")