/**
 * Custom Exception.
 * @author  mfrankel8
 * @version 1
 */

public class OvertrainedAthleteException extends RuntimeException {

    /**
     * Public contructor
     * @param  message Message to display
     */
    public OvertrainedAthleteException(String message) {
        super(message);
    }

    /**
     * Public contructor
     */
    public OvertrainedAthleteException() {
        super();
    }
}