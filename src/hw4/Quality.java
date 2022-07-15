package hw4;

public enum Quality {
    NORMAL (1.2),
    SLIGHTLYSPOILED (0.95),
    HALFSPOILED (0.55),
    ALMOSTALLDISAPPEARED (0.25),
    SPOILEDINTHETRASH (0.1);

    private double coefficient;

    Quality(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }
}
