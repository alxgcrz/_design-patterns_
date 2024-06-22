package patterns.behavioral.command.example2;

class Undo implements ICommand {

    private Receiver receiver;

    Undo(Receiver recv) {
        receiver = recv;
    }

    @Override
    public void action() {
        //Call undo in receiver
        receiver.performUndo();
    }

}
