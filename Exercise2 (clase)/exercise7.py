"""
# coding: utf-8
 @autor: Juan Antonio Nuñez Castaño
 @fecha: 22 Oct 2021
 @nombre: Boletin  - Ejercicio  
 @enunciado: Design a program that asks how many numbers the user wants to write. After the
user enters all numbers, the program should say the medium of the numbers. If the
user inputs a wrong number, the program should ask for it again. The messages are
the following:
“How many numbers do you want input?” to ask for the number of numbers.
“Enter one number greater than 0:” to ask for a number.
“The number is not valid, it should be greater than 0” to inform that the number is not
valid.
“The medium is XX.XX” to show the result.
 
 """


#Vamoa a pedir al usuario la cantidad de valores que va a introducir

cantidad=int(input("Cuantos numeros quieres introducir"))
#Necesitamos un acumulador para que vaya almacenando la suma total de los numeros 
#que introduce el usuario para posteriormenterealizar la media

acumulador=0
#Vamos a usar el contador para que con su incremento cumpa la condicion de no sobrepasar 
#la cantidad de numeros que el usuario va a introducir por teclados
cont=0
while cont < cantidad:
    num=int(input("Introduzca un numero"))
    acumulador+=num
    cont+=1
    if num==0:
        print("Numero no valido, por favor introduzca un numero mayor que 0")
        
print("La media es ", acumulador/cantidad)

