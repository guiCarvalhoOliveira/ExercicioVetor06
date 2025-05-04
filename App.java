import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }
        System.out.print("Digite o número que deseja remover: ");
        int numeroRemover = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == numeroRemover) {
                for (int j = i; j < 9; j++) {
                    vetor[j] = vetor[j + 1];
                }
                vetor[9] = 0; 
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("\nVetor após remoção:");
            for (int i = 0; i < 10; i++) {
                System.out.print(vetor[i] + " ");
            }
        } else {
            System.out.println("\nNúmero não encontrado no vetor.");
        }
        sc.close();
    }
}
