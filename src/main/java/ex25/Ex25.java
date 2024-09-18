package ex25;

import javax.swing.JOptionPane;

public class Ex25 {
    public static void main(String[] args) {
        int qtde = 20;
        int[] vetor = new int[qtde];

        // Preenchendo o vetor com valores fornecidos pelo usuário
        for (int i = 0; i < qtde; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + i + ":"));
        }

        // Calculando a soma dos valores no vetor
        int soma = 0;
        for (int i = 0; i < qtde; i++) {
            soma += vetor[i];
        }

        // Calculando a média
        double media = (double) soma / qtde;

        // Exibindo os resultados
        JOptionPane.showMessageDialog(null, "A soma é: " + soma + "\nA média é: " + media);
    }
}
