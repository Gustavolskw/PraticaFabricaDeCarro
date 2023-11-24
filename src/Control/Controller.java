package Control;

import Model.Carros;
import Model.Fabrica;
import View.EntradaSaida;

import javax.swing.*;

public class Controller {
    private Carros carros = null;
    private Fabrica fabrica= null;
    public void exibeMenu() {
        int opcao = EntradaSaida.solicitaOpcao();

        switch (opcao) {

            case 0:
                JOptionPane.showMessageDialog(null, "Construir um Novo Carro", "Construir Carro", JOptionPane.INFORMATION_MESSAGE);
                this.fabrica = new Fabrica();
                String cor = EntradaSaida.solicitaCor();
                String modelo = EntradaSaida.solicitaModelo();



        }
    }
}
