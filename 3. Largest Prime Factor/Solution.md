### This approach has a time complexity of `O(sqrt(n))`


### 1. Python

``` python
def largest_prime_factor(n):
    i = 2
    while i * i <= n:
        while n % i == 0:
            n //= i
        i += 1
    return n
```

### 2. TypeScript

``` typescript
function largestPrimeFactor(n: number): number {
    let i: number = 2;
    while (i * i <= n) {
        while (n % i === 0) {
            n /= i;
        }
        i++;
    }
    return n;
}
```

### 3. GO

``` go
func largestPrimeFactor(n int64) int64 {
	var i int64 = 2
	for i*i <= n {
		for n%i == 0 {
			n /= i
		}
		i++
	}
	return n
}
```

### 4. Java

``` java
public class solution {

    public static long largestPrimeFactor(long n) {
        long i = 2;
        while (i * i <= n) {
            while (n % i == 0) {
                n /= i;
            }
            i++;
        }
        return n;
    }
}

```