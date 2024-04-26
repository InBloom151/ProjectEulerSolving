function sumOfSquares(n: number): number {
    return Math.floor((n * (n + 1) * (2 * n + 1)) / 6);
}

function squareOfSum(n: number): number {
    return Math.floor((n * (n + 1)) / 2) ** 2;
}

const n = 100
const difference = squareOfSum(n) - sumOfSquares(n)

console.log(difference);