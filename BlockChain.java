import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    private List<Block> blocks;

    public Blockchain() {
        this.blocks = new ArrayList<>();
        Block genesisBlock = createGenesisBlock();
        blocks.add(genesisBlock);
    }

    public Block createGenesisBlock() {
        return new Block(0, "0", "Nome do Block");
    }

    public Block createBlock(String data) {
        int index = blocks.size();
        String previousHash = blocks.get(index - 1).getHash();
        return new Block(index, previousHash, data);
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

    // Falta os metodos Getters, não sei se tem Setters.

}