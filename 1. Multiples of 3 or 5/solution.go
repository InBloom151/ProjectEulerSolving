package main

import "fmt"

func sumMultiples(limit int) int {
	sumDivisibleBy := func(divisor, limit int) int {
		n := (limit - 1) / divisor
		return divisor * (n * (n + 1)) / 2
	}

	sum := sumDivisibleBy(3, limit) + sumDivisibleBy(5, limit) - sumDivisibleBy(15, limit)
	return sum
}

func main() {
	limit := 1000
	result := sumMultiples(limit)
	fmt.Println(result)
}
