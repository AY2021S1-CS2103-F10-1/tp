package seedu.address.model.student.time;

/**
 * Represents Monday in a week.
 */
public class Monday extends Day {

    public static String DEFAULT_MONDAY_DISMISSAL = "1500";

    /**
     * Sets the dismissal time of the {@code Monday}.
     *
     * @param dismissalTime A valid dismissal time.
     */
    public Monday(String dismissalTime) {
        super(dismissalTime);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
