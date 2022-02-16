import java.util.Stack;

public record TransferHistory(Stack<TransferInformation> th) {

    public void setInformation(String action, String note) {
        TransferInformation ti = new TransferInformation(action, note);
        // TODO: Set Time
        this.th.push(ti);
    }

    public void display() {
        for (TransferInformation x : this.th) {
            System.out.println(x.toString());
        }
    }
}
