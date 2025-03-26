package ClickerGame;

/**
 * Invoker that triggers commands.
 * Stores and invokes command actions.
 *
 * @author Szymon Zemojtel
 * @version 1
 */
final class ButtonInvoker
{
    private Command command;

    /*
     * Sets the command to execute or undo.
     *
     * @param command the command to assign
     */
    void setCommand(final Command command)
    {
        this.command = command;
    }

    /*
     * Executes the assigned command if not null.
     */
    void invoke()
    {
        if(command != null)
        {
            command.execute();
        }
    }

    /*
     * Undoes the assigned command if not null.
     */
    void undo()
    {
        if(command != null)
        {
            command.undo();
        }
    }
}
