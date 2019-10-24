def CheckNums(num1, num2):
    if num1 < num2:
        return "true"
    
    if num1 > num2:
        return "false"
    else:
        return -1
        
        
num1 = int(input());
num2 = int(input());
print(CheckNums(num1, num2)) 

        