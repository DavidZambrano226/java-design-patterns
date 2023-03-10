package state.states.impl;

import state.Context;
import state.states.State;

public class GoldState extends State {
    @Override
    public void handle(Context context) {
        System.out.println("GoldState wash execute");
        context.setState(new RedState());
    }
}
