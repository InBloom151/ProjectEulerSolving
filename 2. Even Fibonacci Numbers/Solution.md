### This approach has a time complexity of `O(log n)`


### 1. Python

``` python
def fibonacci_sum(limit):
    fib_sum = 0
    a, b = 1, 2
    while a <= limit:
        if a % 2 == 0:
            fib_sum += a
        a, b = b, a + b
    return fib_sum
```

### 2. TypeScript

``` typescript
function fibonacciSum(limit: number): number {
    let fibSum: number = 0;
    let a: number = 1;
    let b: number = 2;

    while (a <= limit) {
        if (a % 2 === 0) {
            fibSum += a;
        }
        [a, b] = [b, a + b];
    }

    return fibSum;
}
```

### 3. GO

``` go
func sumMultiples(limit int) int {
	sumDivisibleBy := func(divisor, limit int) int {
		n := (limit - 1) / divisor
		return divisor * (n * (n + 1)) / 2
	}

	sum := sumDivisibleBy(3, limit) + sumDivisibleBy(5, limit) - sumDivisibleBy(15, limit)
	return sum
}
```

### 4. Java

``` java
public class solution {
    public static int fibonacciSum(int limit) {
        int fibSum = 0;
        int a = 1;
        int b = 2;

        while (a <= limit) {
            if (a % 2 == 0) {
                fibSum += a;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }

        return fibSum;
    }
}
```