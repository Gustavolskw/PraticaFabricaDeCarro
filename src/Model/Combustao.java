package Model;

import java.util.ArrayList;

public class Combustao extends Carros{
    protected String tipoDeMotor;

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }
    public void criarCarro(String marcha, int qtdPortas, String cor, String modelo, Object escolha){
        setMarcha(marcha);
        setQtdPortas(qtdPortas);
        setCor(cor);
        setModelo(modelo);
        setTipoDeMotor((String) escolha);
    }
}
