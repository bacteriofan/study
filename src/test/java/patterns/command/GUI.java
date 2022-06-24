package patterns.command;

public class GUI {

  private static Documenttxt documenttxt = new Documenttxt();
  private static Documentpdf documentpdf = new Documentpdf();

  public static void main(String[] args) {

    Button saveButton = new Button("Save");
    Button printButton = new Button("Print");

//    saveButton.click(new SaveCommand(documenttxt));
//    printButton.click(new PrintCommand(documenttxt));

    saveButton.click(new SaveCommand(documentpdf));
    printButton.click(new PrintCommand(documentpdf));

  }


}
