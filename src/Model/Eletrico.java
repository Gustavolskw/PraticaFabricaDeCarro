package Model;

import java.util.ArrayList;

public class Eletrico extends Carros{
    protected int qtdBaterias;

    public int getQtdBaterias() {
        return qtdBaterias;
    }

    public void setQtdBaterias(int qtdBaterias) {
        this.qtdBaterias = qtdBaterias;
    }
    public void criarCarro(String marcha, int qtdPortas, String cor, String modelo, Object escolha){
        setMarcha(marcha);
        setQtdPortas(qtdPortas);
        setCor(cor);
        setModelo(modelo);
        setQtdBaterias((Integer) escolha);


    }
}
