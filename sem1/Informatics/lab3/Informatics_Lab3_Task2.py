# Author = Orlov Egor
# Group = P3118
# Date = 09.11.2025

#Тесты
#Петров П.П. P0000
#Анищенко А.А. P33113
#Примеров Е.В. P0000
#Иванов И.И. P0000
#Lfaklak C C P000
#Тыр-Тыр К.Б. P0000
#Икра И.И P0000
#Ыдффы С. P3100
#Афку А.А. P000
#Камень-Булыжник С.С. P0000
import re

gr = input("Введите вашу группу:")
n = input("Введите данные студентов:\n(q! для выхода)\n")
data = [n]
while n!='q!':
    n = input()
    data.append(n)
data=data[:-1]
remover=[]
for stud in range(len(data)):
    pattern = r'([А-Я][а-я]+)(\-[А-Я][а-я]+)?\s([А-Я]\.){2}\s[A-Z][0-9]+'
    if re.match(pattern,data[stud]) is not None:
        groupPattern = r'([A-Z]\d+)$'
        studGroup = re.search(groupPattern,data[stud]).group(1)
        if studGroup == gr:
            upCase = r'[^А-Я]+'
            subString = re.sub(upCase, '', data[stud])
            if subString[-1] == subString[-2]: remover.append(stud)
    else:
        print(f'Данные {data[stud]} введены некорректно')
        remover.append(stud)
luckyGuys=[]
for stud in range(len(data)):
    if stud not in remover: luckyGuys.append(data[stud])
print("Счастливчики:") if len(luckyGuys)>0 else print("Деняк не будет")
for stud in luckyGuys: print(stud)