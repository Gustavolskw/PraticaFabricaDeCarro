package Model;

import java.util.ArrayList;

public class Fabrica {
    private int tipoDeCarro;
    private  int quantidadeProduzida;
    private String cor;
    private int modelo;
    protected ArrayList<Eletrico> listaDecarrosEletricos = new ArrayList<Eletrico>();
    protected ArrayList<Combustao> listaDecarrosCombustao = new ArrayList<Combustao>();



    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getModelo() {
        return modelo;
    }

    public int getTipoDeCarro() {
        return tipoDeCarro;
    }

    public void setTipoDeCarro(int tipoDeCarro) {
        this.tipoDeCarro = tipoDeCarro;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Combustao> getListaDecarrosCombustao() {
        return listaDecarrosCombustao;
    }

    public void setListaDecarrosCombustao(ArrayList<Combustao> listaDecarrosCombustao) {
        this.listaDecarrosCombustao = listaDecarrosCombustao;
    }

    public ArrayList<Eletrico> getListaDecarrosEletricos() {
        return listaDecarrosEletricos;
    }

    public void setListaDecarrosEletricos(ArrayList<Eletrico> listaDecarrosEletricos) {
        this.listaDecarrosEletricos = listaDecarrosEletricos;
    }
}
