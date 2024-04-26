### This approach has a time complexity of `O(1)`


### 1. Python

``` python
def sum_of_squares(n: int) -> int:
    return (n * (n + 1) * (2 * n + 1)) // 6

def square_of_sum(n: int) -> int:
    return ((n * (n + 1)) // 2) ** 2

n = 100
difference = square_of_sum(n) - sum_of_squares(n)
```

### 2. TypeScript

``` typescript
function sumOfSquares(n: number): number {
    return Math.floor((n * (n + 1) * (2 * n + 1)) / 6);
}

function squareOfSum(n: number): number {
    return Math.floor((n * (n + 1)) / 2) ** 2;
}

const n = 100
const difference = squareOfSum(n) - sumOfSquares(n)
```

### 3. GO

``` go
import (
	"math"
)

func main() {
	n := 100
	difference := squareOfSum(n) - sumOfSquares(n)
}

func sumOfSquares(n int) int {
	result := (n * (n + 1) * (2*n + 1)) / 6
	return int(math.Floor(float64(result)))
}

func squareOfSum(n int) int {
	result := int(math.Floor(float64(n*(n+1)) / 2))
	return result * result
}
```

### 4. Java

``` java
public class solution {
    public static void main(String[] args) {
        int n = 100;
        int difference = squareOfSum(n) - sumOfSquares(n);

        System.out.println(difference);
    }

    public static int sumOfSquares(int n) {
        int result = (n * (n + 1) * (2 * n + 1)) / 6;
        return result;
    }

    public static int squareOfSum(int n) {
        int result = ((n * (n + 1)) / 2);
        return result * result;
    }
}
```