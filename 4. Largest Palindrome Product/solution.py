def is_palindrome(n):
    return str(n) == str(n)[::-1]

def largest_palindrome():
    for num in range(999*999, 100*100, -1):
        if is_palindrome(num):
            for i in range(999, 99, -1):
                if num % i == 0 and 100 <= num // i <= 999:
                    return num

print(largest_palindrome())