package patterns.behavioral.command.example2;

// Un invocador sólo conoce la interfaz de comandos ('ICommand')
// Desconoce los comandos.
class Invoker {

    void execute(ICommand cmd) {
        cmd.action();
    }

}
