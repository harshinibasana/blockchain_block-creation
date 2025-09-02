package edu.okcu;
public class Transaction {
    private String Name;
    private String FromUserId;
    private String ToUserId;
    private double  Amount;
    public Transaction(String name, String fromUserId, String toUserId, double amount) {
        this.Name = name;
        this.FromUserId = fromUserId;
        this.ToUserId = toUserId;
        this.Amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "name='" + Name + '\'' +
                ", from='" + FromUserId + '\'' +
                ", to='" + ToUserId + '\'' +
                ", amount=" + Amount +
                '}';
    }
}
