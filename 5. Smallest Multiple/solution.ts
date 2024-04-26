function findSmallestMultiple(maxDivisor: number): number {
    let smallestMultiple = 1;

    for (let i = 2; i <= maxDivisor; i++) {
        const gcd = calculateGCD(smallestMultiple, i);
        
        smallestMultiple = (smallestMultiple * i) / gcd;
    }

    return smallestMultiple;
}

function calculateGCD(a: number, b: number): number {
    while (b !== 0) {
        const temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

const result = findSmallestMultiple(20);
console.log(result);