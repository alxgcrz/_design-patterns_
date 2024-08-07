package patterns.behavioral.command.example2;

class Redo implements ICommand {

    private Receiver receiver;

    Redo(Receiver recv) {
        receiver = recv;
    }

    @Override
    public void action() {
        //Call redo in receiver
        receiver.performRedo();
    }

}
