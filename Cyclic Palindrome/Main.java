def isPalyndrome(s, shift):
    n = len(s)
    if (shift < 0):
        shift = shift + n
    for pos in range(n // 2):
        if s[(pos + shift) % n] != s[((n - pos - 1 + shift) % n)]:
            return False
    return True


def findShift(s):
    for shift in range(len(s)):
        if (isPalyndrome(s, shift) or isPalyndrome(s, -shift)):
            return shift
    return -1


t = int(input())
for i in range(t):
    s = input()
    print(findShift(s))
