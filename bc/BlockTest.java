package bc;

import bc.Block;
import org.junit.Assert;
import org.junit.Test;

public class BlockTest {

    @Test
    public void testCalculateHash() {
        Block block = new Block(1, "previousHash", "data");
        String expectedHash = "hash";

        String actualHash = block.calculateHash();
    }

}