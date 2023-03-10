package state.states.imp;

import state.NotificationDao;
import state.states.AbstractState;

public class ExistUserState extends AbstractState {

    @Override
    public void execute() throws Exception {
        boolean existUser = false;
        System.out.println("Consuming external service");
        if (existUser){
            System.out.println("Next state should execute ....");
        } else {
            NotificationDao notificationDao = new NotificationDao();
            notificationDao.setText("Hello");
            notificationDao.setBody("I am a body");
            super.sendNotification(notificationDao);
            System.out.println("Executing backend error state");
            context.setAbstractState(new BackendErrorState(this, "asddd"));
        }

    }

}
