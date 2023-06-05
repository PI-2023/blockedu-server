import bc.BlockChain;

import so.SocketServer;

public class Main {
    public static void main(String[] args) {
        BlockChain blockchain = new BlockChain();
        SocketServer server = new SocketServer(blockchain, 7070);

        server.iniciarServidor();
    }
}
