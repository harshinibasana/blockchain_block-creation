package edu.okcu;
import java.util.Arrays;

//created a class Block 
public class Block {
    private int nonce;
    private Transaction[] transactions;
    private String previousHash;
    private String hash;

    public Block(int nonce, Transaction[] transactions, String previousHash) {
        this.nonce = nonce;
        this.transactions = transactions;
        this.previousHash = previousHash;
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String data = previousHash + nonce + Arrays.toString(transactions);
        return Integer.toString(data.hashCode());
    }

    @Override
    public String toString() {
        return "\n Block:" +
                "\n    nonce= " + nonce +
                "\n   transactions=" + Arrays.toString(transactions) +
                "\n   previousHash='" + previousHash + '\'' +
                "\n   hash='" + hash + '\'' ;
    }
}
