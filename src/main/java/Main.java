class M {
    public static int s(int n) {
        if (n == 1) {
            return 1;
        }
        return n + s(n - 1);
    }

    public static double f(double n) {
        if (n == 1) {
            return 1;
        }
        return n * f(n - 1);
    }

    public static int p(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 != 0) {
            return n * p(n - 1);
        }
        return p(n - 1);
    }

    public static int d(int n) {
        if (n / 10 == 0) {
            return 1;
        }
        return 1 + d(n / 10);
    }

    public static int div(int a, int b) {
        if (a < b) {
            return 0;
        }
        return 1 + div(a - b, b);
    }

    public static int r(int a, int b) {
        if (a < b) {
            return a;
        }
        return r(a - b, b);
    }

    public static boolean isDiv(int x, int y) {
        if (x == 0) {
            return true;
        }
        if (x < y) {
            return false;
        }
        return isDiv(x - y, y);
    }

    public static boolean isPrime(int n, int p) {
        if (p == 1) {
            return true;
        }
        if (n % p == 0) {
            return false;
        }
        return isPrime(n, p - 1);
    }

    public static boolean altParity(int n, int a) {
        if (a == 3) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        int parity = (n % 10) % 2;
        if (a == 0 && parity == 0) {
            a = 1;
        } else if (a == 0) {
            a = 2;
        } else if (a == 1 && parity != 0) {
            a = 3;
        } else if (a == 2 && parity == 0) {
            a = 3;
        }
        return altParity(n / 10, a);
    }
}
