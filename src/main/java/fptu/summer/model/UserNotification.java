package fptu.summer.model;
// Generated Jun 3, 2018 2:37:40 PM by Hibernate Tools 4.3.1

import fptu.summer.model.id.UserNotificationId;

/**
 * UserNotification generated by hbm2java
 */
public class UserNotification implements java.io.Serializable {

    private UserNotificationId id;
    private Notification notification;
    private boolean isReaded;

    public UserNotification() {
    }

    public UserNotificationId getId() {
        return this.id;
    }

    public void setId(UserNotificationId id) {
        this.id = id;
    }

    public Notification getNotification() {
        return this.notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public boolean isIsReaded() {
        return this.isReaded;
    }

    public void setIsReaded(boolean isReaded) {
        this.isReaded = isReaded;
    }

}