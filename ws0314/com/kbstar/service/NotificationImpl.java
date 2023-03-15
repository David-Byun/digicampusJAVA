package com.kbstar.service;

import com.kbstar.frame.Notification;

public class NotificationImpl implements Notification {
    @Override
    public void sendEmail(String email, String msg) throws Exception {
        System.out.printf("%s에게 %s 전송....by Email\n",email,msg);
    }

    @Override
    public void sendSMS(String contact, String msg) throws Exception {
        System.out.printf("%s에게 %s 전송....by SMS\n", contact,msg);
    }
}
