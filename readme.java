class recurse {

static int raiseToPowerP(int n, int m) {
        if (m == 0) return 1;
        int product = raiseToPowerP(n, m/2);
        if (m % 2 != 0) {
            return n * product * product;
        } else return product * product;
    }

static int fibonacciHelper(int n,  int num1, int num2) {
        if (n == 0) return num1;
        return fibonacciHelper(n-1, num2, num2+num1);
    }
}
