package state.states.imp;

import state.states.AbstractState;

public class BackendErrorState extends AbstractState {
    private String errorDetail;

    public BackendErrorState(AbstractState state, String errorDetail) {
        context.setAbstractState(state);
        this.errorDetail = errorDetail;
    }

    @Override
    public void execute() throws Exception {
        throw new Exception(errorDetail);
    }
}
