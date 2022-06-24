package patterns.command.commandExersice;

public class PlaceOrderCommand implements CommandInterface {

    private Jacket jacket;

    public PlaceOrderCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void execute() {
        jacket.returnOrder();
    }
}
