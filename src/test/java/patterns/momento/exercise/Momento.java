package patterns.momento.exercise;

public class Momento {

    int state;

    public Momento() {
    }

    public int getState(){
        return state;
    }

    public void save(int state) {
        this.state = state;
    }
}
