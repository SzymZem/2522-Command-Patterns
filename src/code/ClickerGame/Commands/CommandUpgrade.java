package ClickerGame.Commands;

import ClickerGame.Command;
import ClickerGame.GameLogic;

/**
 * Command to upgrade click power.
 *
 * @author Szymon Zemojtel
 * @version 1
 */
public class CommandUpgrade implements Command
{
    private final GameLogic logic;

    /**
     * Constructs an upgrade command.
     *
     * @param logic the game logic
     */
    public CommandUpgrade(final GameLogic logic)
    {
        this.logic = logic;
    }

    /**
     * Executes upgrade logic.
     */
    public void execute()
    {
        logic.upgradeClickPower();
    }

    /**
     * Undoes upgrade logic.
     */
    public void undo()
    {
        logic.undoUpgradeClickPower();
    }
}
