package bc;

import java.util.Date;

public class Block {
    public int index;
    public String previousHash;
    public String hash;
    private String data;
    private long timestamp;

    public Block(int index, String previousHash, String data) {
        this.index = index;
        this.previousHash = previousHash;
        this.data = data;
        this.timestamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash(){
        String calculatedhash = Crypt.sha256(previousHash + Long.toString(timestamp) + Integer.toString(index) + data);
        return calculatedhash;
    }

    public int getIndex() {
        return index;
    }

    public String getHash(){
        return hash;
    }

    public String getPreviousHash(){
        return previousHash;
    }

    public String getData(){
        return data;
    }
    public String toString() {
        return "Block{" +
                "index=" + index +
                ", previousHash='" + previousHash + '\'' +
                ", hash='" + hash + '\'' +
                ", data='" + data + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}