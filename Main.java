package edu.okcu;
public class Main {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();

        Transaction t1 = new Transaction("carloan", "Harshini", "Mike", 6800.50);
        Transaction t2 = new Transaction("Gift", "Mike", "Jessi", 555.25);
        Transaction t3 = new Transaction("homeloan", "Jeff", "Mike", 20000.00);
        Transaction t4 = new Transaction("powerbill", "Harshini", "Jim", 20000.00);

        Transaction[] block1Tx = {t1, t2};
        Block block1 = new Block(1, block1Tx, blockchain.getLatestHash());
        blockchain.addBlock(block1);

        Transaction[] block2Tx = {t3};
        Block block2 = new Block(2, block2Tx, blockchain.getLatestHash());
        blockchain.addBlock(block2);

        Transaction[] block3Tx = {t4};
        Block block3 = new Block(3, block3Tx, blockchain.getLatestHash());
        blockchain.addBlock(block3);

        blockchain.printChain();
    }
}
