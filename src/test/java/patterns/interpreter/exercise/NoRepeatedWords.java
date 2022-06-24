package patterns.interpreter.exercise;

public class NoRepeatedWords implements Expression {

    private EndsWithPeriod endsWithPeriod = new EndsWithPeriod();

    @Override
    public String interpret(String context) {
        String con = HelperMethods.noRepeatedWords(context);
        return endsWithPeriod.interpret(con);
    }
}
