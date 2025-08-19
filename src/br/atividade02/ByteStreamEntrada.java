package br.atividade02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteStreamEntrada {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Gabriel Rodrigues\\OneDrive\\Área de Trabalho\\workspace\\Stream\\src\\resorce\\arquivo.bim";
        try (InputStream inputStream = new FileInputStream(filePath)) {

            int byteData;
            while( (byteData = inputStream.read()) != -1){
                System.out.print(byteData + " ");
            }
        }
        catch( IOException e){
            e.printStackTrace();
        }
    }
}