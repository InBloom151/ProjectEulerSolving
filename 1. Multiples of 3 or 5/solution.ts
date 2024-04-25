function sumMultiples(limit: number): number {
    const sumDivisibleBy = (divisor: number) => {
        const n = Math.floor((limit - 1) / divisor);
        return divisor * (n * (n + 1)) / 2;
    };

    const sum = sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15);
    return sum;
}

const limit = 1000;
const result = sumMultiples(limit);
console.log(result);