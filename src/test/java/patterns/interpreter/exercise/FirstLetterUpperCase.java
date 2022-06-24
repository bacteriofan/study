package patterns.interpreter.exercise;

public class FirstLetterUpperCase implements Expression {

    private NoRepeatedWords noRepeatedWords = new NoRepeatedWords();

    @Override
    public String interpret(String context) {
        context = context.substring(0, 1).toUpperCase() + context.substring(1);
        return noRepeatedWords.interpret(context);
    }
}
