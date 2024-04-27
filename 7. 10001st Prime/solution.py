from math import sqrt, log

def n_prime(n):
    upper_bound = int(n * (log(n) + log(log(n))))

    sieve = [False, False] + [True] * (upper_bound - 1)

    for i in range(2, int(sqrt(upper_bound)) + 1):
        if sieve[i]:
            for j in range(i * i, upper_bound + 1, i):
                sieve[j] = False

    count = 0
    for num, is_prime in enumerate(sieve):
        if is_prime:
            count += 1
            if count == n:
                return num

print(n_prime(10001))