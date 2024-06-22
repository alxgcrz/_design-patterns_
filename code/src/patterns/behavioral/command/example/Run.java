package patterns.behavioral.command.example;

class Run implements ICommand {

    // Receptor de la acción
    private Character character;

    Run(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.run();
    }

}
