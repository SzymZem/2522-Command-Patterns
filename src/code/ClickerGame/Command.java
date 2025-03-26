package ClickerGame;

/**
 * Command interface for encapsulating actions.
 * Every command must implement execute and undo.
 *
 * @author Szymon Zemojtel
 * @version 1
 */
public interface Command
{
    /**
     * Executes the command.
     */
    void execute();

    /**
     * Undoes the command action.
     */
    default void undo()
    {
        throw new IllegalArgumentException("Undo not implemented.");
    }
}
