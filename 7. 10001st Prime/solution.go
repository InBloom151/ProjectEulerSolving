package main

import (
	"fmt"
	"math"
)

func main() {
	fmt.Println(nPrime(10001))
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
