package patterns.command;

public class PrintCommand implements Command {

  private Document document;

  public PrintCommand(Document documenttxt) {
    this.document = documenttxt;
  }

  public void execute() {
    document.print();
  }

}
