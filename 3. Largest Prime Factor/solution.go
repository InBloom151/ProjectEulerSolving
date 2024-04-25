package main

import (
	"fmt"
)

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

func main() {
	number := int64(600851475143)
	largestPrime := largestPrimeFactor(number)
	fmt.Println(largestPrime)
}
