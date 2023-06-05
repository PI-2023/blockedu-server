package bc;

import java.util.ArrayList;

public class Store {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args){
        blockchain.add(new Block(0, "0", "Genesis block"));
        blockchain.add(new Block(1, blockchain.get(blockchain.size()-1).hash, "Second block"));
        blockchain.add(new Block(2, blockchain.get(blockchain.size()-1).hash, "Third block"));
        blockchain.add(new Block(3, blockchain.get(blockchain.size()-1).hash, "Fourth block"));
        blockchain.add(new Block(4, blockchain.get(blockchain.size()-1).hash, "Fifth block"));
        System.out.println(blockchain);
    }
}
