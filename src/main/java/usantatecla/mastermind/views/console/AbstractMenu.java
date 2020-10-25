package usantatecla.mastermind.views.console;

import usantatecla.utils.ClosedInterval;
import usantatecla.utils.Command;
import usantatecla.utils.Console;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractMenu {

    private static final String TITLE_OPTION = "----- Choose one option -----";
    private final List<Command> commands;

    public AbstractMenu() {
        this.commands = new ArrayList<>();
    }

    public void execute() {
        List<Command> activeCommands = new ArrayList<>();
        for (int i = 0; i < this.commands.size(); i++) {
            if (this.commands.get(i).isActive()) {
                activeCommands.add(this.commands.get(i));
            }
        }
        int option;
        Console console = Console.instance();
        boolean error;
        do {
            error = false;
            console.writeln();
            console.writeln(TITLE_OPTION);
            for (int i = 0; i < activeCommands.size(); i++) {
                console.writeln((i + 1) + ") " + activeCommands.get(i).getName());
            }
            option = console.readInt("") - 1;
            if (!new ClosedInterval(0, commands.size() - 1).isIncluded(option)) {
                error = true;
            }
        } while (error);
        activeCommands.get(option).execute();
    }

    protected void addCommand(Command command) {
        this.commands.add(command);
    }

}
