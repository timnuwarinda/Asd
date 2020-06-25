package bank.command;

public abstract class Command {
    abstract void execute();
    abstract void unExecute();
}
