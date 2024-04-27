### This approach has a time complexity of `O(n*log(log(n)))`

At the beginning, we estimate the upper bound for the nth prime number using Rosser's theorem. This allows us to make an approximate assumption about the maximum number that could be the nth prime number.
We create a list (sieve), where index i represents the number i, and the value in the list indicates whether the number is prime or composite. Initially, all numbers are marked as prime, except for 0 and 1.
We iterate through numbers from 2 to the square root of the estimated upper bound. If the current number is prime (its value in the sieve is True), then we mark all its multiples as composite. We do not check numbers that are already marked as composite.
Search for the nth prime number: Then, we iterate through all the numbers in the sieve and count the prime numbers. Once we reach the nth prime number, we return that number.
This optimized version of the algorithm reduces memory usage because we only store a boolean list for marking composite numbers, and it avoids unnecessary iterations by marking composite numbers only up to the square root of the estimated upper bound.


### 1. Python

``` python
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
```

### 2. TypeScript

``` typescript
function nPrime(n: number): number {
    const upperBound: number = Math.ceil(n * (Math.log(n) + Math.log(Math.log(n))));

    const sieve: boolean[] = [false, false, ...Array(upperBound - 1).fill(true)];

    for (let i = 2; i <= Math.sqrt(upperBound); i++) {
        if (sieve[i]) {
            for (let j = i * i; j <= upperBound; j += i) {
                sieve[j] = false;
            }
        }
    }

    let count: number = 0;
    for (let num = 0; num < sieve.length; num++) {
        if (sieve[num]) {
            count++;
            if (count === n) {
                return num;
            }
        }
    }

    return -1;
}
```

### 3. GO

``` go
package main

import (
	"math"
)

func main() {
	nPrime(10001)
}

func nPrime(n int) int {
	upperBound := int(math.Ceil(float64(n) * (math.Log(float64(n)) + math.Log(math.Log(float64(n))))))

	sieve := make([]bool, upperBound+1)
	for i := range sieve {
		sieve[i] = true
	}
	sieve[0], sieve[1] = false, false

	for i := 2; i <= upperBound; i++ {
		if sieve[i] {
			for j := i * i; j <= upperBound; j += i {
				sieve[j] = false
			}
		}
	}

	count := 0

	for num := 0; num < len(sieve); num++ {
		if sieve[num] {
			count++
			if count == n {
				return num
			}
		}
	}

	return -1
}
```

### 4. Java

``` java
import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        nPrime(10001);
    }

    public static int nPrime(int n) {
        int upperBound = (int) Math.ceil(n * (Math.log(n) + Math.log(Math.log(n))));
        boolean[] sieve = new boolean[upperBound + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for (int i = 2; i <= Math.sqrt(upperBound); i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= upperBound; j += i) {
                    sieve[j] = false;
                }
            }
        }

        int count = 0;
        for (int num = 0; num < sieve.length; num++) {
            if (sieve[num]) {
                count++;
                if (count == n) {
                    return num;
                }
            }
        }

        return -1;
    }
}
```