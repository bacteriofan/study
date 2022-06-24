package patterns.interpreter.exercise;

public class Main {

  public static void main(String[] args) {

    String context = "this is a a sentence";

    FirstLetterUpperCase firstLetterUpperCase = new FirstLetterUpperCase();
    final String interpret = firstLetterUpperCase.interpret(context);

    System.out.println(interpret);
  }

}
