
list1 = [1,2,3,4,5]
list2 = [6,7,8,9,10]
list3 = []

print("First List ", list1)
print("Second List ", list2)

for num in list1:
    if (num % 2 != 0):
        list3.append(num)
        

for num in list2:
    if (num % 2 == 0):
        list3.append(num)

# Print result
print("result List is:", list3)

