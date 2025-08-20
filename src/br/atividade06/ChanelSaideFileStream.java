package br.atividade06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanelSaideFileStream {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Gabriel Rodrigues\\OneDrive\\Área de Trabalho\\workspace\\Stream\\src\\resorce\\arquivo.txt";
        String text = "Teste 123";

        try(FileOutputStream fos = new FileOutputStream(filePath)){
            FileChannel fc = fos.getChannel();

            //converter String em bytes e gravar no BytBuffer
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(text.getBytes());

            //Mudar para leitura.
            buffer.flip();
            //Escrever os dados do buffer no canel.

            fc.write(buffer);




        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
