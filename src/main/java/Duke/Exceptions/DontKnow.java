package Duke.Exceptions;

/**
 * Exceptions when user inputs unidentifiable command type.
 */

public class DontKnow extends DukeException {
    private String dontKnow;

    /**
   * Constructor for Exception when receive unknown command.
   */
    public DontKnow() {
        this.dontKnow = "OOPS!!! I'm sorry, "
            + "but I don't know what that means :-(";
    }

    @Override
    public String toString() {
        return dontKnow;
    }
}
