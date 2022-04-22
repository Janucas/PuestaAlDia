"""
# coding: utf-8
 @autor: Juan Antonio Nuñez Castaño
 @fecha: 29 Oct 2021
 @nombre: Examen - Ejercicio 1
 @enunciado: 1.- Realiza un programa que le pida al usuario su edad y que le pregunte si ha pasado el Covid o no,
así como si ha recibido la vacuna de Pfizer, Moderna o Astrazeneca. En función de la respuesta se
debe informar al usuario si debe volver a vacunarse o no teniendo en cuenta las siguientes
condiciones:
• Si ha recibido Astrazeneca, haya pasado el covid o no e independientemente de la edad debe
volver a vacunarse.
• Si ha recibido Moderna y es mayor de 60 años, sólo debe volver a vacunarse si no ha pasado
el covid. En otro caso, lo que han recibido Moderna no deben volver a vacunarse.
• Si ha recibido Pfizer y no ha pasado el covid, debe volver a vacunarse, y si lo ha pasado sólo
se vacunará si es mayor de 70 años.
Si el usuario no introduce los valores correctos, se debe mostrar un mensaje de error y volver a
solicitar los datos hasta que el usuario introduzca los datos de forma correcta.
 
 """
edad=int(input("Introduzca su edad"))
covid=input("Has pasado el covid (S/N)")
vacuna=input("Que tipo de vacuna has recibido, Astrazeneca, Moderna o Pfizer (A,M,P)")
#Creamos el bucle el cual solo va a funcionar si se introducen correctamente los datos que el programa nos pide 
#con el fin de determinar si debes vacunarte o no
while (edad <= 0) or (covid != "S" and covid !="N") or (vacuna != "A" and vacuna != "M" and vacuna != "P"):
#En caso de introducir datos erroneos se vuelven a pedir.
        print("Datos erroneos, por favor vuelva a introducir sus datos")
        edad=int(input("Introduzca su edad"))
        covid=input("Has pasado el covid (S/N)")
        vacuna=input("Que tipo de vacuna has recibido, Astrazeneca, Moderna o Pfizer (A,M,P)")
#Vamos a usar los condicionales de forma que primero vamos a preguntar que vacuna se ha puesto y una vez sepamos que vacuna ha
#le vamos a volver a preguntar por las restricciones concreta de cada una
if vacuna=="A":
    print("Debe vacunarse de nuevo")
elif vacuna=="M":
    if edad > 60 and covid=="N":
        print("Debe volver a vacunarse")
    else:
        print("Tiene todas sus vacunas al dia")
elif vacuna=="P": 
    if covid=="N":
        print("Debe a vacunarse")
    elif vacuna=="P" and covid=="S" and edad >70:
        print("Debe volver a vacunarse")
    else:
        print("Tiene todas sus vacunas al dia")
            
            
        