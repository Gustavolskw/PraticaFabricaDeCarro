package View;

import Model.Combustao;

import javax.swing.*;

public class EntradaSaida {
    public static int solicitaOpcao() {
        String[] opcoes = {"Fabricar Carro", "Ver Lista De Modelos", "Comprar Carro"};
        JComboBox<String> menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null, menu, "Selecione a opcao que deseja executar.", JOptionPane.DEFAULT_OPTION);
        return menu.getSelectedIndex();
    }

    public static String solicitaCor(int ordem) {
        return JOptionPane.showInputDialog(null, "Escreva a cor desejada do seu Caro", ordem+"º Carro", -1 );
    }

    public static String solicitaModelo(int ordem) {
return JOptionPane.showInputDialog(null, "Qual o modelo de carro que você deseja ?", ordem+"º Carro", -1 );
    }

    public static int solicitaTipo() {

        String[] opcoes = {"Elétrico", "Combustão"};
        return JOptionPane.showOptionDialog(null, "Escolha Qual o modelo do veiculo", "Modelo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes);
    }

    public static int solicitaquantidadeProduzida(String tipoDeCarro) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de carro(s) do tipo "+tipoDeCarro+" A serem produzidos" ));
    }

    public static String solicitaMarcha(int ordem) {
        String[] opcoes = {"Automático", "Manual"};
        int escolha =  JOptionPane.showOptionDialog(null, "Escolha Qual o tipo de Marcha voce deseja", ordem+"º Carro",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if(escolha == 0){
            return "Automático";
        }else{
            return "Manual";
        }
    }

    public static int solicitaQtdPortas(int ordem) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Qauntidade de portas que você deseja ter no seu carro", ordem+"º Carro", -1 ));
    }

    public static int solicitaQtdBaterias(int ordem) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Qauntidade de Baterias que você deseja ter no seu carro", ordem+"º Carro",-1 ));
    }

    public static String solicitaTipoDeMotor(int ordem) {
        String[] opcoes = {"Diesel", "Gasolina", "Flex"};
        int escolha =  JOptionPane.showOptionDialog(null, "Escolha Qual o tipo de Marcha voce deseja", ordem+"º Carro",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);
        if(escolha == 0){
            return "Diesel";
        }else if(escolha==1){
            return "Gasolina";
        }else{
            return "Flex";
        }
    }
}
