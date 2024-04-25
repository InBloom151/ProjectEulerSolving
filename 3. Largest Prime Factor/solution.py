def largest_prime_factor(n):
    i = 2
    while i * i <= n:
        while n % i == 0:
            n //= i
        i += 1
    return n

number = 600851475143
largest_prime = largest_prime_factor(number)
print(largest_prime)