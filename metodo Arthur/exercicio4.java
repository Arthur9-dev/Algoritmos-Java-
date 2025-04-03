 import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args) {
        int opcao;
        do {
            // exibe um menu de opcoes para o usuario escolher uma operacao
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha uma opcao:\n" +
                "1 – Soma\n" +
                "2 – Subtracao\n" +
                "3 – Divisao\n" +
                "4 – Multiplicacao\n" +
                "5 – Resto da Divisao\n" +
                "6 – Dobro\n" +
                "7 – Quadrado\n" +
                "8 – Cubo\n" +
                "9 – Raiz Quadrada\n" +
                "0 – Sair"
            ));

            if (opcao != 0) {
                double num1 = 0, num2 = 0;
                
                // se a operacao escolhida for entre 1 e 5, solicita dois  
                if (opcao >= 1 && opcao <= 5) {
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
                } 
                // se a operacao escolhida for entre 6 e 9, solicita apenas um numero  
                else if (opcao >= 6 && opcao <= 9) {
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero:"));
                }

                // realiza o calculo com base na opcao escolhida
                double resultado = realizarCalculo(opcao, num1, num2);
                // exibe o resultado
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            }
        } while (opcao != 0); // repete ate o usuario escolher sair (opcao 0)
    }

    // funcao que realiza o calculo com base na opcao escolhida  
    static double realizarCalculo(int opcao, double num1, double num2) {
        switch (opcao) {
            case 1:
                return soma(num1, num2);
            case 2:
                return subtracao(num1, num2);
            case 3:
                return divisao(num1, num2);
            case 4:
                return multiplicacao(num1, num2);
            case 5:
                return restoDaDivisao(num1, num2);
            case 6:
                return dobro(num1);
            case 7:
                return quadrado(num1);
            case 8:
                return cubo(num1);
            case 9:
                return raizQuadrada(num1);
            default:
                return 0;
        }
    }

    // funcoes que executam as operacoes  
    static double soma(double num1, double num2) {
        return num1 + num2;
    }

    static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    static double divisao(double num1, double num2) {
        return num1 / num2;
    }

    static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    static double restoDaDivisao(double num1, double num2) {
        return num1 % num2;
    }

    static double dobro(double num1) {
        return num1 * 2;
    }

    static double quadrado(double num1) {
        return num1 * num1;
    }

    static double cubo(double num1) {
        return num1 * num1 * num1;
    }

    static double raizQuadrada(double num1) {
        return Math.sqrt(num1);
    }
}
