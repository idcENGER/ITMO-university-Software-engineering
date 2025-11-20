#Author Orlov Egor
#Group P3118
#Data 10.11.2025


import re
from pyexpat.errors import messages

test = "Футбольный клуб «Реал Мадрид» является 15-кратным обладателем главного футбольного европейского трофея – Лиги Чемпионов. Данный турнир организован Союзом европейских футбольных ассоциаций (УЕФА). Идея о континентальном футбольном турнире пришла к журналисту Габриэлю Ано в 1955 году."

'''message = input("Введите текст:")'''
message = test
pat_num = int(input("Введите номер слова:"))
message = message.split()
pat = message[pat_num-1][:-3]
pat_word = message[pat_num-1]
print(pat,pat_word)
for word in message:
    if len(word)==len(pat):
        if re.match(pat,word[:-3],re.I):
            word = pat_word
    else:
        if re.match(pat, word[:-2], re.I):
            word = pat_word
print(message)