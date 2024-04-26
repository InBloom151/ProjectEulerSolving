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

console.log(largestPalindrome())