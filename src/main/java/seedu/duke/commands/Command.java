package seedu.duke.commands;

import seedu.duke.DukeException;
import seedu.duke.template.Template;

import java.util.logging.Logger;

public abstract class Command {
    protected static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    /** Boolean whether the command is to exit. **/
    protected boolean isExit;
    protected Template template;

    protected Command(Template template) {
        this.template = template;
    }

    protected Command() {
        this(null);
    }

    /**
     * Executes appropriate methods based on the given command.
     */
    public abstract void execute() throws DukeException;


    /**
     * Returns boolean isExit.
     *
     * @return boolean isExit whether the command is to exit.
     */
    public boolean isExit() {
        return isExit;
    }
}
