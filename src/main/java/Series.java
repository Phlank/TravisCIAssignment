public class Series {

    public static double series(double start, double multiplier, int steps) {
        double result = start;
        double lastValue = start;
        for (int i = 0; i < steps; i++) {
            lastValue = multiplier * lastValue;
            result += lastValue;
        }
        return result;
    }

}
