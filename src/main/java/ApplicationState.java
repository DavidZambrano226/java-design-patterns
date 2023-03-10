import state.Context;
import state.states.State;
import state.states.impl.RedState;

public class ApplicationState {
    public static void main(String[] args) {
        State redState = new RedState();
        Context context = new Context(redState);
        context.request();
        context.request();
        context.request();
    }
}
