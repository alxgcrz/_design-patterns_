package patterns.behavioral.command.example;

// Invocador
class Engine {

    // Execute
    void execute(ICommand command) {
        command.execute();
    }

}
