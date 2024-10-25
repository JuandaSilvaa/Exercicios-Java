package slide2;

public class Fatorial {
    public static void main(String[] args) {
        Integer numero;
        
        for (int i = 1; i <= 10; i++) {
            numero = i;
            int fatorial = 1;

            for (int j = 1; j <= numero; j++) {
                fatorial *= j;
            }

            System.out.println("Fatorial de " + numero + " é: " + fatorial);
        }
    }
}