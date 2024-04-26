import math

def smallest_multiple(n: int) -> int:
    result = 1
    for i in range(2, n + 1):
        result = result * i // math.gcd(result, i)
    return result

print(smallest_multiple(20))