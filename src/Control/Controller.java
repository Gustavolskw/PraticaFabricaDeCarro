package Control;

import Model.Carros;
import Model.Combustao;
import Model.Eletrico;
import Model.Fabrica;
import View.EntradaSaida;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Controller {
    private Fabrica fabrica =null;
    public void exibeMenu() {
        int opcao = EntradaSaida.solicitaOpcao();

        switch (opcao) {

            case 0:
                JOptionPane.showMessageDialog(null, "Construir um Novo Carro", "Construir Carro", JOptionPane.INFORMATION_MESSAGE);
                this.fabrica = new Fabrica();
                int tipoDeCarro = EntradaSaida.solicitaTipo();
                ArrayList<Eletrico> listaDecarrosEletricos = new ArrayList<Eletrico>();
                ArrayList<Combustao> listaDecarrosCombustao = new ArrayList<Combustao>();
                if( tipoDeCarro == 0){
                    fabrica.setQuantidadeProduzida(EntradaSaida.solicitaquantidadeProduzida("Elétrico"));
                    for(int i = 0; i< this.fabrica.getQuantidadeProduzida(); i++){
                        Eletrico eletrico = new Eletrico();
                        eletrico.setMarcha(EntradaSaida.solicitaMarcha((i+1)));
                        eletrico.setQtdPortas(EntradaSaida.solicitaQtdPortas((i+1)));
                        eletrico.setCor(EntradaSaida.solicitaCor((i+1)));
                        eletrico.setModelo(EntradaSaida.solicitaModelo((i+1)));
                        eletrico.setQtdBaterias(EntradaSaida.solicitaQtdBaterias((i+1)));
                        listaDecarrosEletricos.add(eletrico);

                    }

                }else {
                    fabrica.setQuantidadeProduzida(EntradaSaida.solicitaquantidadeProduzida("Combustão"));
                    for (int i = 0; i < this.fabrica.getQuantidadeProduzida(); i++) {
                        Combustao combustao = new Combustao();
                        combustao.setMarcha(EntradaSaida.solicitaMarcha((i + 1)));
                        combustao.setQtdPortas(EntradaSaida.solicitaQtdPortas((i + 1)));
                        combustao.setCor(EntradaSaida.solicitaCor((i + 1)));
                        combustao.setModelo(EntradaSaida.solicitaModelo((i + 1)));
                        combustao.setTipoDeMotor(EntradaSaida.solicitaTipoDeMotor((i + 1)));
                        listaDecarrosCombustao.add(combustao);
                    }
                }
                this.fabrica.setListaDecarrosEletricos(listaDecarrosEletricos);
                for (Eletrico eletricos : fabrica.getListaDecarrosEletricos()){
                    System.out.println("Marcha: "+ eletricos.getMarcha());
                    System.out.println("Quantidade de portas; "+ eletricos.getQtdPortas());
                    System.out.println("Cor: "+ eletricos.getCor());
                    System.out.println("Modelo: "+ eletricos.getModelo());
                    System.out.println("Quantidade de baterias: "+ eletricos.getQtdBaterias());
                }
                this.fabrica.setListaDecarrosCombustao(listaDecarrosCombustao);
                for (Combustao combustaos : fabrica.getListaDecarrosCombustao()){
                    System.out.println("Marcha: "+ combustaos.getMarcha());
                    System.out.println("Quantidade de portas; "+ combustaos.getQtdPortas());
                    System.out.println("Cor: "+ combustaos.getCor());
                    System.out.println("Modelo: "+ combustaos.getModelo());
                    System.out.println("Quantidade de baterias: "+ combustaos.getTipoDeMotor());
                }


        }
    }


}
