package cal;

import p215.InfinityException;

public class cal {
    public static double div(int a, int b) throws NumberFormatException, ArithmeticException {
        double result = 0.0;
        try {
            result = a / b;
            return result;
        } catch (NumberFormatException | ArithmeticException e) {
            throw e;
        }
    }

    public static double div(double a, double b) throws InfinityException {
        double result = 0.0;
        if (b == 0.0) {
            throw new InfinityException("B0001");
        }
        result = a / b;
        return result;
    }
}
