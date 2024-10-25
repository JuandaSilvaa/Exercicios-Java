package br.com.serratec.exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravacaoBuffered {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("/curso/saida.txt"));
			bw.append("Gravação em arquivo");
			bw.close();
			System.out.println("Arquivo Gerado");
		} catch (IOException e) {
			System.err.println();
			e.printStackTrace();
		}
	}

}
