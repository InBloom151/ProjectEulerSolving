function nPrime(n: number): number {
    const upperBound: number = Math.ceil(n * (Math.log(n) + Math.log(Math.log(n))));

    const sieve: boolean[] = [false, false, ...Array(upperBound - 1).fill(true)];

    for (let i = 2; i <= Math.sqrt(upperBound); i++) {
        if (sieve[i]) {
            for (let j = i * i; j <= upperBound; j += i) {
                sieve[j] = false;
            }
        }
    }

    let count: number = 0;
    for (let num = 0; num < sieve.length; num++) {
        if (sieve[num]) {
            count++;
            if (count === n) {
                return num;
            }
        }
    }

    return -1;
}

console.log(nPrime(10001));