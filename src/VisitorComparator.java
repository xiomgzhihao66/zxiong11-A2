import java.util.Comparator;

/**
 * Comparator for sorting visitors based on age, and in case of equal age, by name.
 * <p>
 * This comparator is used to sort a collection of visitors in ascending order
 * of age, and if two visitors have the same age, their names will be compared
 * in lexicographical order.
 * </p>
 *
 * Author: zxiong11
 */
public class VisitorComparator implements Comparator<Visitor> {

    /**
     * Compares two Visitor objects first by age, and if their ages are equal,
     * compares them by name.
     *
     * @param v1 The first visitor to be compared
     * @param v2 The second visitor to be compared
     * @return A negative integer, zero, or a positive integer as the first visitor
     *         is less than, equal to, or greater than the second visitor
     */
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // First compare by age
        int ageComparison = Integer.compare(v1.getAge(), v2.getAge());

        // If ages are different, return the result of the age comparison
        if (ageComparison != 0) {
            return ageComparison;
        }

        // If ages are the same, compare by name
        return v1.getName().compareTo(v2.getName());
    }
}
