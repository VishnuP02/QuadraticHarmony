package quadraticharmony;

/**
 * Represents a musical note with frequency and length.
 * Implements Comparable for sorting by length, then frequency, and Describable for providing descriptions.
 */
public class Note implements Comparable<Note>, Describable {
    private double frequency; // Frequency of the note in Hz
    private double length;    // Length of the note in seconds

    /**
     * Constructor to initialize the frequency and length of the note.
     * @param frequency The frequency of the note in Hz.
     * @param length The length of the note in seconds.
     */
    public Note(double frequency, double length) {
        this.frequency = frequency;
        this.length = length;
    }

    /**
     * Compares this Note object with another.
     * Sorting is first by length, and then by frequency when lengths are equal.
     * @param other The other Note object to compare with.
     * @return A negative integer, zero, or a positive integer based on the comparison.
     */
    @Override
    public int compareTo(Note other) {
        int lengthComparison = Double.compare(this.length, other.length);
        if (lengthComparison != 0) {
            return lengthComparison; // Sort by length first
        }
        return Double.compare(this.frequency, other.frequency); // Then sort by frequency
    }

    /**
     * Returns a description of the musical note.
     * @return A string describing the note's frequency and length.
     */
    @Override
    public String getDescription() {
        return "This is a musical note with frequency: " + frequency + " Hz, and length: " + length + " seconds.";
    }

    /**
     * Returns a string representation of the note.
     * @return A string in the form "frequency Hz, length seconds".
     */
    @Override
    public String toString() {
        return "Note: " + frequency + " Hz, " + length + " seconds";
    }
}