import bc.Block;
import bc.Store;

public class Main {

    public static Boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;

        for(int i = 1; i < Store.blockchain.size(); i++){
            currentBlock = Store.blockchain.get(i);
            previousBlock = Store.blockchain.get(i-1);

            if(!currentBlock.hash.equals(currentBlock.calculateHash())){
                System.out.println("Current Hashes not equal");
                return false;
            }

            if(!previousBlock.hash.equals(currentBlock.previousHash)){
                System.out.println("Previous Hashes not equal");
                return false;
            }
        }

        return true;
    }

}
