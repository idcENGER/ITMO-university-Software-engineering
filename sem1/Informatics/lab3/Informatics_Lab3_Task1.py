# Author = Orlov Egor Andreevich
# Group = P3118
# Date = 09.11.2025

import re
while True:
    text_init = input("Введите текст:")
    lineCount = text_init.count('/')
    text = text_init.split('/')
    haiku = ''
    if lineCount == 2:
        for i in range(3):
            pattern = r'[аеёиоуыэюя]'
            check = (re.findall(pattern,text[i],re.I))
            haiku += str((len(check)))
        print("Хайку") if haiku == '575' else print("Не хайку")
    else: print("Не хайку, в хайку должно быть 3 строки")

