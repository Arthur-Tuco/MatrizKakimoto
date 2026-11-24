public class EX5_EX6 {

    public static double[] calcularMedias(double[][] notas) {
        double[] medias = new double[notas.length];

        for (int i = 0; i < notas.length; i++) {
            double soma = 0.0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / notas[i].length;
        }
        return medias;
    }

    public static String[] verificarAprovacao(double[] medias, double mediaMinima) {
        String[] situacoes = new String[medias.length];

        for (int i = 0; i < medias.length; i++) {
            if (medias[i] >= mediaMinima) {
                situacoes[i] = "Aprovado";
            } else {
                situacoes[i] = "Reprovado";
            }
        }
        return situacoes;
    }

    public static void imprimirBoletimFinal(double[] medias, String[] situacoes) {
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Aluno %d | Média: %.2f | Situação: %s%n",
                    (i + 1), medias[i], situacoes[i]);
        }
    }

    public static void aplicarBonusNaProva(double[][] notas, int colunaProva, double bonus) {
        for (int i = 0; i < notas.length; i++) {
            double novaNota = notas[i][colunaProva] + bonus;
            if (novaNota > 10.0) {
                novaNota = 10.0;
            }
            notas[i][colunaProva] = novaNota;
        }
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] notas = {
                {7.0, 8.0, 7.5},
                {9.6, 9.0, 9.0},
                {5.0, 6.0, 5.5},
                {8.0, 7.0, 8.0}
        };

        System.out.println("--- Matriz original ---");
        imprimirMatriz(notas);

        aplicarBonusNaProva(notas, 0, 0.5);

        System.out.println("\n--- Matriz após bônus de 0.5 na 1ª avaliação ---");
        imprimirMatriz(notas);

        double[] medias = calcularMedias(notas);
        String[] situacoes = verificarAprovacao(medias, 7.0);

        System.out.println("\n--- Boletim Final ---");
        imprimirBoletimFinal(medias, situacoes);
    }
}