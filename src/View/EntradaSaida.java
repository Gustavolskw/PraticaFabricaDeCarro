package View;

import javax.swing.*;

public class EntradaSaida {
    public static int solicitaOpcao(){
        String[] opcoes = {"Fabricar Carro", "Ver Lista De Modelos", "Comprar Carro"};
        JComboBox<String> menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null, menu, "Selecione a opcao que deseja executar.", JOptionPane.DEFAULT_OPTION);
        return menu.getSelectedIndex();
    }
    public static String solicitaCor(){
        return JOptionPane.showInputDialog(null, "Escreva a cor desejada do seu Caro");
    }
    public static String solicitaModelo() {
        String[] opcoes = {"SUV", "Esportivo", "Popular"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha Qual o modelo do veiculo", "Modelo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes);
        if(escolha == 0){
            return "SUV";
        }else if (escolha == 1){
            return "Esportivo";
        }else{
            return "Popular";
        }

    }

}
