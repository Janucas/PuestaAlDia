import math;
from pickle import FALSE
# Design a method called factorial that receives a positive integer and returns the factorial. If the number is negative the method should return -1.

def factorial (num):
    if num<0:
        resultado= -1
    elif num == 0 or num == 1:
        return 1
    else:
        resultado=1
        for i in range (1,num+1):
            resultado=resultado*i
    return resultado


# Design a method called leapYear that returns 1 if the number that receives the method is a leap year. In other case, the method returns -1.
#  A year is a leap year if it is multiple of 4 but the year is not multiple of 100 and not multiple of 400.

def leapYear(num): 
    if num==0:
        result=-1
    elif num%4 ==0 and num%100!=0 and num%400!=0:
        result=1
    else:
        result=-1
    return(result)


# Design a method called daysInMonth that returns the integer number of days in the month and year that received as arguments.
#  You can use the method leapYear. If the arguments are not valid the method should return -1
    
def daysInMonth(month,year): 
    if month < 1 or month > 12 or year <= 0:
        days= -1
    elif month == 2 and leapYear(year) == 1:
        days=29
    elif month == 2 and leapYear(year) == -1:
        days=28
    elif month == 4 or month == 6 or month == 9 or month == 11:
        days=30
    else: 
        days=31
    return(days)


#Design a method called dayOfWeek that receives three integer parameters: day, month and year. The method should return a number between 0 and 6 that is
# the day in the week for that date. You have to know the next algorithm:
#
#    a = (14 - month) / 12 
#    y = year – a 
#    m = month + 12 * a – 2 
#    d = (day + y + y/4 - y/100 + y/400 + (31*m)/12) mod 7
#
#    If the variable d is zero was Sunday, 1 Monday……………... 6 Saturday. 

def dayOfWeek(dia,mes,anno):
    a= (14 - mes) // 12
    y= anno - a
    m=mes + 12 * a - 2
    d= (dia + y + y//4 - y//100 + y//400 + (31*m)//12) % 7
    return d


# Design a method called myPower that receives one integer and one integer positive numbers as parameters and the method calculates the power of the 
# first parameter raised the second number. You only can use the multiplication. If the parameters are not right (the second parameter is negative) the
#  method should return -1. Remember that any number raised 0 is 1.

def myPower(num,num2):
    if num2<0:
        result=-1
    elif num2==0:
        result=1
    else:
        result=1
        for i in range (num2):
            result*=num
    return(result)


# Design a method called numberOfNumbers that receives one integer positive number as parameter. The method should return the number of digits of the
#  number that received by parameter. If the parameter is not valid the method should return -1.

def numberOfNumbers(num):
    result=1
    if num<=0:
        result= -1
    else:
        while num//10>1:
            result=result+1
            num=num//10
    return(result)


# Design a method called isPrime that receives one integer positive number 
# greater than 0 as parameter. The method should return 1 if the number is 
# prime or 0 if the number is not prime. If the parameter is not valid the 
# method should return -1.
        
def isPrime(num):
    divisores=0
    if num<= 0:
        result= -1
    else:
        for i in range(2, num):
            if num % i == 0:
                divisores+=1
        if divisores < 1:
            result=1
        else:
            result=0
    return(result)


# Design a method called secondOrder that receives three integer positive number as parameters. This parameters are the coefficients
# of the an equation of a second order (ax2+bx+c=0) and the method returns the numbers of the solutions. If the parameters are not valid 
# the method should return -1

def secondOrder(a,b,c):
    if a == 0:
        result= -1
    else:
        superior=b * b - 4 * a * c
        if superior < 0:
            result=0
        elif superior == 0:
            result=1
        else:
            result=2
    return result 


# Design a method called numberDivisorPrime that receives a positive number as a parameter. The method should return the number
# of prime divisors of the parameter. If the parameter is not valid the method should return -1.

def numberDivisorPrime(num):
    result=0
    if num < 0:
        result= -1
    else:
        for i in range (2,num-1):
            if (isPrime(i)==1) and num%i==0:
                result+=1
    return result


# Design a method called friend that receives two positive number as parameters. The method should return 
# true if the number are friends and false in other case. Two numbers are friends if the addition of all the divisors less
#  the same number of the one number is equal to the second number and in the other case too. If the parameters are not valid
#   the method should return false.

def friend(a,b):
    contadorDivisores=0
    if a < 0 or b < 0:
        return False
    else:
        for i in range(1,a):
            if a % i==0:
                contadorDivisores+=i
        if contadorDivisores == b:
            return True
        else:
            return False
        
    