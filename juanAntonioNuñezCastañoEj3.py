"""
# coding: utf-8
 @autor: Juan Antonio Nuñez Castaño
 @fecha: 29 Oct 2021
 @nombre: Examen  - Ejercicio  3
 @enunciado: 3.- Vamos a escribir un programa para codificar una clave que el usuario deberá introducir por
teclado, así, cuando sepamos escribir en ficheros, en vez de guardar la clave guardaremos la
codificación, aunque por ahora lo que haremos es escribirla por pantalla.
La generación de la clave se hará en función de la seguridad que quiera el usuario por lo que lo
primero que debemos hacer es pedirle cuántos números quiere introducir para generar la clave. A
continuación se le deberán preguntar los números y la clave se generará sumando el resto de dividir los números entre 5, siempre y cuando los números sean impares. Aunque se introduzcan números
negativos se debe sumar el resto nunca restar.
Es decir, el programa debe preguntar ¿cuántos números quieres para la clave? Si le digo por
ejemplo 6, debe preguntarme los seis números, si mi respuesta es:
235 → El resto es 0, no tengo que hacer nada
458 → El resto es 3 es impar lo sumo
6 → El resto es 1, es impar lo sum
-679 → El resto es -4, es par, no lo sumo
89 → El resto es 4, es par, no lo sumo
-88 → El resto es 3, es impar, lo sumo
El resultado de la clave es 7
 
 """
#Pedimos al usuario que introduzca cuantos numeros va a tener su clave
cantidad=int(input("Cuantos numeros desea introducir"))
#En el acumulador vamos a almacenar la suma de aquellos restos que sean impares
acumulador=0
#Indicamos la longitud del bucle
for i in range (0,cantidad):
    num=abs(int(input("Introduzca un numero")))     #Pedimos que introduzca el numero N veces
    resto=num%5                                     #Indicamos que debemos usar el resto del numero entre 5
    if resto%2 != 0:#La condicion para que sume o no el resto   
        acumulador+=resto
    else:
        acumulador==acumulador
        
print("El resultado de su clave es ",acumulador) #Mostramos el msj final

#El programa ha sido probado con el ejemplo proporcionado en el enunciado y devuelve los mismos datos