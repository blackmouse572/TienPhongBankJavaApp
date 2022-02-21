package main.java.Model;

public record TransactionInfo(String action, String note ) {

    // TODO: time variable

    public String getAction(){
        return this.action;
    }

    public String getNote(){
        return this.note;
    }

    @Override
    public String toString() {
        // TODO: Print the time
        return "Transfer Information{" +
                "action = " + action + '\'' +
                ", note = " + note + '\'' +
                '}';
    }
}
