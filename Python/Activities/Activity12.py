



def sum(num):
    if num:
        return num + sum(num-1)
    else:
        return 0

result = sum(10)
print("Sum of the 0 to 10 digits are  :  ", result)