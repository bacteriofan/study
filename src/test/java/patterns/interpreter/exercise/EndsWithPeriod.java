package patterns.interpreter.exercise;

public class EndsWithPeriod implements Expression {

    @Override
    public String interpret(String context) {
        return HelperMethods.endsWithPeriod(context);
    }
}
