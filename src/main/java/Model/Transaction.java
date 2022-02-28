package main.java.Model;

import java.sql.Time;

public record Transaction(String action, String note, User receiver, User sender, Time time) {

    public User getReceiver(){
        return receiver;
    }

    public User getSender(){
        return sender;
    }

    public Time getTime(){
        return time;
    }

    public String getAction(){
        return this.action;
    }

    public String getNote(){
        return this.note;
    }

    @Override
    public String toString() {
        return "Transfer Information{" +
                "action = " + action + '\'' +
                ", note = " + note + '\'' +
                "sender = " + sender + '\'' +
                "receiver = " + receiver + '\'' +
                "time = " + time + '\'' +
                '}';
    }
}
