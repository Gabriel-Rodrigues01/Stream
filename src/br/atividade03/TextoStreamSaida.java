package br.atividade03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TextoStreamSaida {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Gabriel Rodrigues\\OneDrive\\Área de Trabalho\\workspace\\Stream\\src\\resorce\\arquivo.txt";
        String text = "Este é um exemplo de escrita em arquivo texto";

        try (Writer writer = new FileWriter(filePath)) {
            writer.write(text);

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}