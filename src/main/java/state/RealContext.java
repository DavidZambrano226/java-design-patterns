package state;

import state.states.AbstractState;
import state.states.imp.ExistUserState;

public class RealContext {
    private AbstractState abstractState;

    public RealContext() {
        this.abstractState = new ExistUserState();
    }

    public void setAbstractState(AbstractState abstractState) {
        this.abstractState = abstractState;
    }

    public void execute() throws Exception {
        this.abstractState.execute();
    }
}
