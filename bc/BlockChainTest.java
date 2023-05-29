package bc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class BlockChainTest {

    private BlockChain blockchain;

    @BeforeEach
    public void setup() {
        blockchain = new BlockChain();
    }

    @Test
    public void testCreateGenesisBlock() {
        Block genesisBlock = blockchain.createGenesisBlock();
        Assertions.assertEquals(0, genesisBlock.getIndex());
        Assertions.assertEquals("0", genesisBlock.getPreviousHash());
        Assertions.assertEquals("Genesis Block", genesisBlock.getData());
    }

    @Test
    public void testCreateBlock() {
        Block block = blockchain.createBlock("Transaction Data");
        Assertions.assertEquals(1, block.getIndex());
        Assertions.assertEquals(blockchain.getBlocks().get(0).getHash(), block.getPreviousHash());
        Assertions.assertEquals("Transaction Data", block.getData());
    }

    @Test
    public void testAddBlock() {
        Block block = blockchain.createBlock("Transaction Data");
        blockchain.addBlock(block);
        Assertions.assertEquals(2, blockchain.getBlocks().size());
        Assertions.assertEquals(block, blockchain.getBlocks().get(1));
    }
}


