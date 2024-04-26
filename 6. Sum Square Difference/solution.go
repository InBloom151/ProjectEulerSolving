package main

import (
	"fmt"
	"math"
)

func main() {
	n := 100
	difference := squareOfSum(n) - sumOfSquares(n)

	fmt.Println(difference)
}

func sumOfSquares(n int) int {
	result := (n * (n + 1) * (2*n + 1)) / 6
	return int(math.Floor(float64(result)))
}

func squareOfSum(n int) int {
	result := int(math.Floor(float64(n*(n+1)) / 2))
	return result * result
}
