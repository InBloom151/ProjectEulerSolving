package main

import "fmt"

func fibonacciSum(limit int) int {
	fibSum := 0
	a, b := 1, 2

	for a <= limit {
		if a%2 == 0 {
			fibSum += a
		}
		a, b = b, a+b
	}

	return fibSum
}

func main() {
	limit := 4000000
	result := fibonacciSum(limit)
	fmt.Println(result)
}
