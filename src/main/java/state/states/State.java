package state.states;

import state.Context;

public abstract class State {
    public abstract void handle(Context context);
}
