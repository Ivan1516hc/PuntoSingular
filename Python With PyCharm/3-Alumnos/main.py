import Operaciones
nombre=str(input("Ingresa el nombre: "))
edad=int(input("Ingresa la edad: "))
calificacion=float(input("Ingresa la calificacion: "))
print("----------------------------------")

Operaciones.edad=edad
Operaciones.nombre=nombre
Operaciones.calificacion=calificacion

Operaciones.MostrarDatos()
Operaciones.MayoriaEdad()
Operaciones.Promedio()