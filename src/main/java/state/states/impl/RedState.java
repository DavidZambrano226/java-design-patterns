package state.states.impl;

import state.Context;
import state.states.State;

public class RedState extends State {
    @Override
    public void handle(Context context) {
        System.out.println("RedState wash execute");
        context.setState(new SilverState());

    }
}
