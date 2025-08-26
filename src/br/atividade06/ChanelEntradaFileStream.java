package br.atividade06;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanelEntradaFileStream { public static void main(String[] args) {
    String filePath = "C:\\Users\\Gabriel Rodrigues\\OneDrive\\Área de Trabalho\\workspace\\Stream\\src\\resorce\\arquivo.txt";
    try(FileInputStream fis = new FileInputStream(filePath)) {
        FileChannel fileCannel = fis.getChannel();

        //Criar buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        // ler os dados do canal para o buffer
        int bytesRead = fileCannel.read(buffer);
        while (bytesRead != -1) {
            //Muda o buffer para leitura
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char)buffer.get());
            }
            buffer.clear();
            bytesRead = fileCannel.read(buffer);
        }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
}
}