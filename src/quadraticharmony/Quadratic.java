package quadraticharmony;

/**
 * Represents a quadratic equation in the form ax^2 + bx + c.
 * Implements Comparable for sorting by coefficient 'a' and Describable for providing descriptions.
 */
public class Quadratic implements Comparable<Quadratic>, Describable {
    private int a, b, c; // Coefficients of the quadratic equation

    /**
     * Constructor to initialize the coefficients of the quadratic equation.
     * @param a Coefficient of x^2
     * @param b Coefficient of x
     * @param c Constant term
     */
    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Compares this Quadratic object with another based on coefficient 'a'.
     * @param other The other Quadratic object to compare with.
     * @return A negative integer, zero, or a positive integer if this
     *         object's 'a' is less than, equal to, or greater than the other's 'a'.
     */
    @Override
    public int compareTo(Quadratic other) {
        return Integer.compare(this.a, other.a);
    }

    /**
     * Returns a description of the quadratic equation.
     * @return A string describing the quadratic equation.
     */
    @Override
    public String getDescription() {
        return "This is a quadratic equation: " + a + "x^2 + " + b + "x + " + c;
    }

    /**
     * Returns a string representation of the quadratic equation.
     * @return A string in the form "ax^2 + bx + c".
     */
    @Override
    public String toString() {
        return "Quadratic: " + a + "x^2 + " + b + "x + " + c;
    }
}