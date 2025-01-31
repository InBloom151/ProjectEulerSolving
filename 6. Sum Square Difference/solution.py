def sum_of_squares(n: int) -> int:
    return (n * (n + 1) * (2 * n + 1)) // 6

def square_of_sum(n: int) -> int:
    return ((n * (n + 1)) // 2) ** 2

n = 100
difference = square_of_sum(n) - sum_of_squares(n)

print(difference)