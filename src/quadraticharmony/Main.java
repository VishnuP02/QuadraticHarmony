package quadraticharmony;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The Main class demonstrates sorting Quadratic and Note objects
 * using the Comparable interface and the Describable interface for descriptions.
 */
public class Main {
    public static void main(String[] args) {
        // Create and sort Quadratic objects
        ArrayList<Quadratic> quadratics = new ArrayList<>();
        quadratics.add(new Quadratic(3, 2, 1)); // Quadratic: 3x^2 + 2x + 1
        quadratics.add(new Quadratic(1, 4, 5)); // Quadratic: 1x^2 + 4x + 5
        quadratics.add(new Quadratic(2, 3, 1)); // Quadratic: 2x^2 + 3x + 1
        Collections.sort(quadratics); // Sort quadratics by coefficient 'a'

        // Print descriptions using the Describable interface
        System.out.println("Quadratics:");
        for (Quadratic q : quadratics) {
            System.out.println(q.getDescription());
        }

        // Create and sort Note objects
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note(440.0, 1.5)); // Note: 440 Hz, 1.5 seconds
        notes.add(new Note(329.6, 2.0)); // Note: 329.6 Hz, 2.0 seconds
        notes.add(new Note(523.2, 1.0)); // Note: 523.2 Hz, 1.0 seconds
        Collections.sort(notes); // Sort notes by length, then frequency

        // Print descriptions using the Describable interface
        System.out.println("\nNotes:");
        for (Note n : notes) {
            System.out.println(n.getDescription());
        }
    }
}