package __test__.bc;

import bc.Block;
import org.junit.Assert;
import org.junit.Test;

public class BlockTest {

    @Test
    public void testCalculateHash() {
        Block block = new Block(1, "previousHash", "data");
        String expectedHash = "hash";

        String actualHash = block.calculateHash();

        try {
            Assert.assertEquals(expectedHash, actualHash);
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }

}