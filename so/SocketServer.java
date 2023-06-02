package so;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import bc.Block;
import bc.BlockChain;

public class SocketServer {
    private int port;
    private BlockChain blockchain;

    public SocketServer(BlockChain blockchain, int port) {
        this.port = port;
        this.blockchain = blockchain;
    }

    public void iniciarServidor() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Servidor iniciado. Aguardando conexões...");
            this.blockchain.createGenesisBlock();

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Conexão estabelecida com um cliente.");

                InputStream inputStream = clientSocket.getInputStream();
                byte[] certificado = inputStream.readAllBytes();
                System.out.println("Certificado recebido: " + certificado.toString());

                Block block = this.blockchain.createBlock(certificado.toString());
                this.blockchain.addBlock(block);

                OutputStream outputStream = clientSocket.getOutputStream();
                outputStream.write(block.getHash().getBytes());
                outputStream.flush();

                clientSocket.close();
                System.out.println("Conexão encerrada com o cliente.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
