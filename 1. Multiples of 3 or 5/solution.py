def sum_of_multiples(limit, divisor):
    n = (limit - 1) // divisor
    return divisor * n * (n + 1) // 2

def sum_multiples_3_or_5(limit):
    sum_multiples_3 = sum_of_multiples(limit, 3)
    sum_multiples_5 = sum_of_multiples(limit, 5)
    sum_multiples_15 = sum_of_multiples(limit, 15)
    return sum_multiples_3 + sum_multiples_5 - sum_multiples_15

result = sum_multiples_3_or_5(1000)
print(result)