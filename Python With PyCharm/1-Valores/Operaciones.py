n1=0
n2=0
n3=0
def Inicializacion():
    global n1,n2,n3
    try:
        n1=float(input("Ingresa el primer valor: "))
        n2=float(input("Ingresa el segundo valor: "))
        n3=float(input("Ingresa el tercer valor: "))
    except:
        if not type(n1) is float or not type(n2) is float or not type(n3) is float:
            raise TypeError("Solo se pueden ingresar datos numericos")

def CalcularMayor():
    if n1>=n2 and n1>=n3:
        print("El numero mayor es: ",n1)
    else:
        if n2>=n1 and n2>=n3:
            print("El numero mayor es: ",n2)
        else:
            if n3>=n1 and n3>=n2:
                print("El numero mayor es: ",n3)

def CalcularMenor():
    if n1<=n2 and n1<=n3:
        print("El numero menor es: ",n1)
    else:
        if n2<=n1 and n2<=n3:
            print("El numero menor es: ",n2)
        else:
            if n3<=n1 and n3<=n2:
                print("El numero menor es: ",n3)