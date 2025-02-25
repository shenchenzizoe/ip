package Duke.Exceptions;

import Duke.task.Task;

/**
 * Exceptions when user inputs deadline/event command
 * without indicating time restrictions.
 */

public class EmptyTime extends DukeException {
    private String emptyTime;

    /**
   * Constructor for Exception when time of
   * a deadline or event is empty.
   */
    public EmptyTime(Task task) {
        this.emptyTime = new StringBuilder()
            .append("Sorry, The time of a ")
            .append(task.toString()).append(" cannot be empty.")
            .append("\n missing '/by'")
            .append("\n missing '/from' 'to'")
            .append("\n OR missing description")
            .append("\n OR due date(for deadline)")
            .append("\n OR missing start time or end time(for event)").toString();
    }

    @Override
    public String toString() {
        return emptyTime;
    }
}
