import java.util.Scanner;

public class EX1_EX3 {

    public static double encontrarMaiorNota(double[][] notas) {
        double maior = notas[0][0];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > maior) {
                    maior = notas[i][j];
                }
            }
        }
        return maior;
    }

    public static double encontrarMenorNotaDoAluno(double[][] notas, int indiceAluno) {
        double menor = notas[indiceAluno][0];

        for (int j = 1; j < notas[indiceAluno].length; j++) {
            if (notas[indiceAluno][j] < menor) {
                menor = notas[indiceAluno][j];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notas = {
                {7.5, 8.0, 6.5},
                {9.0, 8.5, 9.2},
                {5.0, 6.0, 5.5},
                {8.0, 7.0, 8.5}
        };

        double maiorNota = encontrarMaiorNota(notas);
        System.out.printf("Maior nota da turma: %.2f%n%n", maiorNota);

        System.out.print("Digite o número do aluno (1 a 4): ");
        int numeroAluno = scanner.nextInt();

        if (numeroAluno >= 1 && numeroAluno <= notas.length) {
            int indiceAluno = numeroAluno - 1;
            double menorNota = encontrarMenorNotaDoAluno(notas, indiceAluno);
            System.out.printf("Menor nota do Aluno %d: %.2f%n", numeroAluno, menorNota);
        } else {
            System.out.println("Número de aluno inválido.");
        }

    }
}