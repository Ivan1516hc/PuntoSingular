nombre=""
edad=0
calificacion=0.0

def __init__ (self,nombre):
    self.nombre=nombre

def __init__ (self, nombre, edad, calificacion):
    self.nombre=nombre
    self.edad=edad
    self.calificacion=calificacion

def MostrarDatos():
    print("Nombre: ",nombre)
    print("Edad: ",edad)
    print("Calificacion: ",calificacion)
    print("-----------------------------")

def MayoriaEdad():
    if edad>=18:
        print("Es mayor de edad")
    else: print("Es menor de edad")

def Promedio():
    if calificacion<8:
        print("Reprobado")
    else:
        if calificacion>=8 and calificacion<10:
            print("Aprobado")
        else:
            if calificacion==10:
                print("Excelente")
            else: print("Calificacion invalida")
