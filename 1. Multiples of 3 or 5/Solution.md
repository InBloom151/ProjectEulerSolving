### This approach has a time complexity of `O(1)`


### 1. Python

``` python
def sum_of_multiples(limit, divisor):
    n = (limit - 1) // divisor
    return divisor * n * (n + 1)

def sum_multiples_3_or_5(limit):
    sum_multiples_3 = sum_of_multiples(limit, 3)
    sum_multiples_5 = sum_of_multiples(limit, 5)
    sum_multiples_15 = sum_of_multiples(limit, 15)
    return sum_multiples_3 + sum_multiples_5 - sum_multiples_15
```

### 2. TypeScript

``` typescript
function sumMultiples(limit: number): number {
    const sumDivisibleBy = (divisor: number) => {
        const n = Math.floor((limit - 1) / divisor);
        return divisor * (n * (n + 1)) / 2;
    };

    const sum = sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15);
    return sum;
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
    public static int sumMultiples(int limit) {
        return sumDivisibleBy(3, limit) + sumDivisibleBy(5, limit) - sumDivisibleBy(15, limit);
    }

    public static int sumDivisibleBy(int divisor, int limit) {
        int n = (limit - 1) / divisor;
        return divisor * (n * (n + 1)) / 2;
    }
}
```