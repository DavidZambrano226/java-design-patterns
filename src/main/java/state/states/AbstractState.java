package state.states;

import state.NotificationDao;
import state.RealContext;

public abstract class AbstractState {
    protected RealContext context;
    protected NotificationDao notificationDao;

    public RealContext getContext() {
        return context;
    }

    public void setContext(RealContext context) {
        this.context = context;
    }

    public NotificationDao getNotificationDao() {
        return notificationDao;
    }

    public void setNotificationDao(NotificationDao notificationDao) {
        this.notificationDao = notificationDao;
    }

    public void sendNotification(NotificationDao notificationDao) {
        System.out.println("Sending push notification with the next config");
        System.out.println("Text " + notificationDao.getText());
        System.out.println("Body " + notificationDao.getBody());
    }
    public abstract void execute() throws Exception;
}
