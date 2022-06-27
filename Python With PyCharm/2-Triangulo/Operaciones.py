l1=0
l2=0
l3=0
def Inicializacion():
    global l1,l2,l3
    l1=float(input("Ingresa el primer lado: "))
    l2=float(input("Ingresa el segundo lado: "))
    l3=float(input("Ingresa el tercer lado: "))
    if not type(l1) is float or not type(l2) is float or not type(l3) is float:
        raise TypeError("Solo se pueden ingresar datos numericos")

def Mayor():
    if l1>=l2 and l1>=l3:
        print("El lado mayor es: ",l1)
    else:
        if l2>=l1 and l2>=l3:
            print("El numero mayor es: ",l2)
        else:
            if l3>=l1 and l3>=l2:
                print("El numero mayor es: ",l3)

def Equilatero():
    if l1==l2 and l1==l3:
        print("El Triangulo es equilatero")
    else:
        print("Este Triangulo no es equilatero")