package slide2;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Pessoas[] pessoas = new Pessoas[4];

        Scanner sc = new Scanner(System.in);

        double somaAltura = 0.0, somaPeso = 0.0, pessoaMaiorAltura = 0.0, pessoaMaiorPeso = 0.0;
        String NomePessoaMaiorAltura = "", NomePessoaMaiorPeso = "";

        for(int i = 0; i < 4; i++) {
            pessoas[i] = new Pessoas();
            System.out.println("Digite o nome " + (i + 1) + ": ");
            pessoas[i].nome = sc.next();

            System.out.println("Digite o peso " + (i + 1) + ": ");
            pessoas[i].peso = sc.nextDouble();

            System.out.println("Digite a altura " + (i + 1) + ": ");
            pessoas[i].altura = sc.nextDouble();

        }
        sc.close();

        for (int j = 0; j < pessoas.length; j++) {
            somaPeso += pessoas[j].peso; 
            somaAltura += pessoas[j].altura;

            if (pessoaMaiorPeso == 0.0 || pessoas[j].peso > pessoaMaiorPeso) {
                pessoaMaiorPeso = pessoas[j].peso;
                NomePessoaMaiorPeso = pessoas[j].nome;
            }

            if (pessoaMaiorAltura == 0.0 || pessoas[j].altura > pessoaMaiorAltura) {
                pessoaMaiorAltura = pessoas[j].altura;
                NomePessoaMaiorAltura = pessoas[j].nome;
            }
        }





        System.out.println(NomePessoaMaiorPeso + " é a pessoa com maior peso, pesando: " + pessoaMaiorPeso + "kg");
        System.out.println(NomePessoaMaiorAltura + " é a pessoa com maior altura, medindo: " + pessoaMaiorAltura + "m");
        System.out.println("A media da altura é: " + somaAltura/4);
        System.out.println("A media do peso é: " + somaPeso/4);



    }

}