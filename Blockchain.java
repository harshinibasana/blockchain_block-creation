package edu.okcu;
import java.util.ArrayList;
import java.util.List;
public class Blockchain {
private List<Block> chain;
public Blockchain() {
chain = new ArrayList<>();
        // Add genesis block
        chain.add(new Block(0, new Transaction[]{}, "0"));
    }

    public void addBlock(Block block) {
        chain.add(block);
    }

    public void printChain() {
        for (Block block : chain) {
            System.out.println(block);
        }
    }

    public String getLatestHash() {
        return chain.get(chain.size() - 1).calculateHash();
    }
}
