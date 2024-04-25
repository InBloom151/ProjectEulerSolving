function fibonacciSum(limit: number): number {
    let fibSum: number = 0;
    let a: number = 1;
    let b: number = 2;

    while (a <= limit) {
        if (a % 2 === 0) {
            fibSum += a;
        }
        [a, b] = [b, a + b];
    }

    return fibSum;
}

const limit: number = 4000000;
const result: number = fibonacciSum(limit);
console.log(result)