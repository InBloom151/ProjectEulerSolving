function largestPrimeFactor(n: number): number {
    let i: number = 2;
    while (i * i <= n) {
        while (n % i === 0) {
            n /= i;
        }
        i++;
    }
    return n;
}

const number: number = 600851475143;
const largestPrime: number = largestPrimeFactor(number);
console.log(largestPrime);