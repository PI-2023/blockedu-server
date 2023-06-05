package so;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

import bc.BlockChain;

public class SocketServer {
    private int port;
    private BlockChain blockchain;

    public SocketServer(BlockChain blockchain, int port) {
        this.port = port;
        this.blockchain = blockchain;
    }

    public void iniciarServidor() {
        ServerSocket serverSocket = null;

        try {
            System.out.println("\033[H\033[2J" + "Iniciando servidor...");
            serverSocket = new ServerSocket(port);
            System.out.println("Servidor iniciado. Aguardando conexões...");

            Socket client;
            this.blockchain.createGenesisBlock();

            while ((client = serverSocket.accept()) != null) {
                System.out.println("Conexão estabelecida com cliente");
                new GerenciadorDeClientesSocket(client, blockchain);
            }
        } catch (IOException e) {
            try {
                if (serverSocket != null)
                    serverSocket.close();
                e.printStackTrace();
            } catch (IOException e1) {
                System.err.println("A porta não está disponível ou o Servidor foi fechado!");
            }
        }
    }
}
