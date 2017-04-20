package twu.biblioteca.commands;

import twu.biblioteca.environment.Library;

public class QuitCommand extends Command{

    public QuitCommand() {
        super("/quit  -  Close Biblioteca system.");
    }

    @Override
    public String execute(Library library, String arguments) {
        System.exit(0);
        return "Goodbye!";
    }
}