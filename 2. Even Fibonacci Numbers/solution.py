def fibonacci_sum(limit):
    fib_sum = 0
    a, b = 1, 2
    while a <= limit:
        if a % 2 == 0:
            fib_sum += a
        a, b = b, a + b
    return fib_sum

limit = 4000000
result = fibonacci_sum(limit)
print(result)