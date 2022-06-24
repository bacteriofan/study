package patterns.command.commandExersice;

public class OrderHandler {

  public void invoke(CommandInterface commandInterface) {
    commandInterface.execute();
  }
}
