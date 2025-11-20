import re


def check(string):
    pattern = r'^[01]+'
    return len(string) == 7 and bool(re.fullmatch(pattern, string))


def HammingCode(msg):
    s1 = 1 if (int(msg[0]) + int(msg[2]) + int(msg[4]) + int(msg[6])) % 2 == 1 else 0
    s2 = 1 if (int(msg[1]) + int(msg[2]) + int(msg[5]) + int(msg[6])) % 2 == 1 else 0
    s3 = 1 if (int(msg[3]) + int(msg[4]) + int(msg[5]) + int(msg[6])) % 2 == 1 else 0
    s = s1 * 2 ** 0 + s2 * 2 ** 1 + s3 * 2 ** 2
    msg=list(msg)
    msg[s] = '1' if msg[s] == '0' else '0'
    msg[0],msg[1],msg[3] = '','',''
    msg = ''.join(msg)
    print(msg)
    return 'ошибка в ' + str(s) + '-ом бите' if s != 0 else "Ошибок нет"


while True:
    msg = input("Введите сообщение из 7 битов:")
    print(HammingCode(msg)) if check(msg) else print("Неверный формат записи")

#40 73 105 25 56
#40 - 1101010 - ошибка в первом бите
#73 - 0010101 - ошибка в первом бите
#105 - 0111111 - ошибка в первом бите
#25 - 1011001 - ошибка в первом бите
