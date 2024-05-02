package DoisMaio;

import java.util.Scanner;

public class IntercalacaoVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];
        int j = 0;

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 1; i <= 10; i++) {
            vet1[i - 1] = sc.nextInt();
            vet3[j++] = vet1[i - 1];
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 1; i <= 10; i++) {
            vet2[i - 1] = sc.nextInt();
            vet3[j++] = vet2[i - 1];
        }

        System.out.println("Vetor intercalado:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vet3[i] + " ");
        }

        sc.close();
    }
}
