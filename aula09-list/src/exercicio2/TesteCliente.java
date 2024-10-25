package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        
		do {
			System.out.print("Digite o ID do cliente: ");
            int id = scanner.nextInt();
            if (id < 0) {
				break;
			}
          
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.next();

            System.out.print("Digite a idade do cliente: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o telefone do cliente: ");
            int telefone = scanner.nextInt();

            clientes.add(new Cliente(id, nome, idade, telefone));
		} while (true);

        System.out.println("\nDados dos clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        scanner.close();
    }
}
