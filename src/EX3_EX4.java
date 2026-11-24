import java.util.Scanner;

public class EX3 {

    public static int encontrarAlunoDestaque(double[] medias) {
        int indiceDestaque = 0;
        double maiorMedia = medias[0];

        for (int i = 1; i < medias.length; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                indiceDestaque = i;
            }
        }
        return indiceDestaque;
    }

    public static int somarDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    public static int somarDiagonalSecundaria(int[][] matriz) {
        int soma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            soma += matriz[i][n - 1 - i];
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] medias = {7.50, 8.83, 9.20, 7.67};
        int indiceDestaque = encontrarAlunoDestaque(medias);
        System.out.printf("O destaque foi o Aluno %d com média %.2f%n%n",
                (indiceDestaque + 1), medias[indiceDestaque]);

        // Teste do Exercício 6: Matriz quadrada 4x4
        int[][] matriz4x4 = new int[4][4];
        System.out.println("Digite os 16 números inteiros da matriz 4x4:");
        for (int i = 0; i < matriz4x4.length; i++) {
            for (int j = 0; j < matriz4x4[i].length; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz4x4[i][j] = scanner.nextInt();
            }
        }

        int diagPrincipal = somarDiagonalPrincipal(matriz4x4);
        int diagSecundaria = somarDiagonalSecundaria(matriz4x4);

        System.out.println("\nSoma da diagonal principal: " + diagPrincipal);
        System.out.println("Soma da diagonal secundária: " + diagSecundaria);

        scanner.close();
    }
}