### This approach has a time complexity of `O(n)`


### 1. Python

``` python
import math

def smallest_multiple(n: int) -> int:
    result = 1
    for i in range(2, n + 1):
        result = result * i // math.gcd(result, i)
    return result
```

### 2. TypeScript

``` typescript
function findSmallestMultiple(maxDivisor: number): number {
    let smallestMultiple = 1;

    for (let i = 2; i <= maxDivisor; i++) {
        const gcd = calculateGCD(smallestMultiple, i);
        
        smallestMultiple = (smallestMultiple * i) / gcd;
    }

    return smallestMultiple;
}

function calculateGCD(a: number, b: number): number {
    while (b !== 0) {
        const temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
```

### 3. GO

``` go
func findSmallestMultiple(maxDivisor int) int {
	smallestMultiple := 1

	for i := 2; i <= maxDivisor; i++ {
		gcd := calculateGCD(smallestMultiple, i)

		smallestMultiple = (smallestMultiple * i) / gcd
	}

	return smallestMultiple
}

func calculateGCD(a, b int) int {
	for b != 0 {
		temp := b
		b = a % b
		a = temp
	}
	return a
}
```

### 4. Java

``` java
public class solution {
    public static long findSmallestMultiple(int maxDivisor) {
        long smallestMultiple = 1;

        for (int i = 2; i <= maxDivisor; i++) {
            long gcd = calculateGCD(smallestMultiple, i);

            smallestMultiple = (smallestMultiple * i) / gcd;
        }

        return smallestMultiple;
    }

    public static long calculateGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```