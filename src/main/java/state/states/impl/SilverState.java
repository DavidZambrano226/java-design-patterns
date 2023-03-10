package state.states.impl;

import state.Context;
import state.states.State;

public class SilverState extends State {
    @Override
    public void handle(Context context) {
        System.out.println("SilverState wash execute");
        context.setState(new GoldState());
    }
}
