import re

def binary(init):
    pattern= r'^[01]+'
    return bool(re.fullmatch(pattern,init))
def Fibonacci(m: str) -> list:
    n,c=1,0
    arr=[1,1]
    if m=='1': return ['1']
    for i in range(len(m)-2):
        c, n = n, n + c
        arr.append(n + c)
    return arr[::-1]

def F_Zeckendorf(initial: str) -> str:
    if initial=='0': return '0'
    arr= Fibonacci(initial) #создание последовательности фибоначчи
    summary=0
    for i in range(len(initial)):
        summary+= int(arr[i]) * int(initial[i]) #умножение разряда числа в СС фиб на соответствующее число в числах Фибоначчи
    return str(summary)
while True:
    init=input("Введите исходное число:")
    print(F_Zeckendorf(init)) if binary(init) else print("Некорректная запись числа")




#1 91348(10) = 148267(9)
#2 43440(5) = 2777(10)
#3 77E51(15) = 44144401(5)
#4 54.77(10) = 110110.11000(2)
#5 34.77(16) = 110100.01110(2)
#6 47.17(8) = 100111.00111(2)
#7 0,100001(2) = 0,84(16)
#8 0,110101(2) = 0.82812(10)
#9 16,92(16) = 22.57031(10)
#10 430121(Ф) = 3251(10)
#11 159(10) = 100001000100(Fibonacci)
#12 {^4}{^1}{^4}{^2}1(9C)=-27314(10)
#13 2656(10) = 340220(Ф)
