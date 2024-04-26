package main

import (
	"fmt"
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

func main() {
	fmt.Println(largestPalindrome())
}
