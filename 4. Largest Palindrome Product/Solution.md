### This approach has a time complexity of `O(n^2)`


### 1. Python

``` python
def is_palindrome(n):
    return str(n) == str(n)[::-1]

def largest_palindrome():
    for num in range(999*999, 100*100, -1):
        if is_palindrome(num):
            for i in range(999, 99, -1):
                if num % i == 0 and 100 <= num // i <= 999:
                    return num
```

### 2. TypeScript

``` typescript
function isPalindrome(n: number): boolean {
    return n.toString() == n.toString().split('').reverse().join('')
}

function largestPalindrome(): number | null {
    for (let num = 999 * 999; num >= 100 * 100; num--) {
        if (isPalindrome(num)) {
            for (let i = 999; i >= 99; i--) {
                if (num % i === 0 && 100 <= num / i && num / i <= 999) {
                    return num;
                }
            }
        }
    }
    return null;
}
```

### 3. GO

``` go
import (
	"strconv"
)

func isPalindrome(n int) bool {
	strN := strconv.Itoa(n)
	reversed := ""
	for i := len(strN) - 1; i >= 0; i-- {
		reversed += string(strN[i])
	}
	return strN == reversed
}

func largestPalindrome() int {
	for num := 999 * 999; num >= 100*100; num-- {
		if isPalindrome(num) {
			for i := 999; i >= 100; i-- {
				if num%i == 0 && 100 <= num/i && num/i <= 999 {
					return num
				}
			}
		}
	}
	return -1
}
```

### 4. Java

``` java
public class solution {

    public static boolean isPalindrome(int n) {
        String strN = Integer.toString(n);
        return strN.equals(new StringBuilder(strN).reverse().toString());
    }

    public static int largestPalindrome() {
        for (int num = 999 * 999; num >= 100 * 100; num--) {
            if (isPalindrome(num)) {
                for (int i = 999; i >= 100; i--) {
                    if (num % i == 0 && 100 <= num / i && num / i <= 999) {
                        return num;
                    }
                }
            }
        }
        return -1;
    }
}
```