package main

import (
	"fmt"
)

func main() {
	result := findSmallestMultiple(20)
	fmt.Println(result)
}

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
