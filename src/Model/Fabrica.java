package Model;

import View.EntradaSaida;

import java.util.ArrayList;

public class Fabrica {
    private String tipoDeCarro;
    private  int quantidadeProduzida;
    protected ArrayList<Carros> listaDecarrosEletricos = new ArrayList<Carros>();
    protected ArrayList<Carros> listaDecarrosCombustao = new ArrayList<Carros>();
    protected ArrayList<Carros> listaTotal = new ArrayList<Carros>();

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }


    public ArrayList<Carros> getListaTotal() {
        return listaTotal;
    }

    public void setListaTotal(ArrayList<Carros> listaTotal) {
        this.listaTotal = listaTotal;
    }

    public String getTipoDeCarro() {
        return tipoDeCarro;
    }

    public void setTipoDeCarro(String tipoDeCarro) {
        this.tipoDeCarro = tipoDeCarro;
    }


    public ArrayList<Carros> getListaDecarrosEletricos() {
        return listaDecarrosEletricos;
    }

    public void setListaDecarrosEletricos(ArrayList<Carros> listaDecarrosEletricos) {
        this.listaDecarrosEletricos = listaDecarrosEletricos;
    }

    public ArrayList<Carros> getListaDecarrosCombustao() {
        return listaDecarrosCombustao;
    }

    public void setListaDecarrosCombustao(ArrayList<Carros> listaDecarrosCombustao) {
        this.listaDecarrosCombustao = listaDecarrosCombustao;
    }


    public void criarListasDeCarros(  ArrayList<Carros> listaDecarrosEletricos, ArrayList<Carros> listaDecarrosCombustao ){
    setListaDecarrosEletricos(listaDecarrosEletricos);
    setListaDecarrosCombustao(listaDecarrosCombustao);

    }
    public String gerarlistas() {
        String informacoes = "<<<Lista de Carros>>>\n";

        for(Carros eletricos : this.listaDecarrosEletricos){
            informacoes+="Tipo De Carro - "+eletricos.getTipoDeCarro()+" | Modelo -"+eletricos.getModelo()+ " | Cor - "+eletricos.getCor()+ " | Marcha - "+
                    eletricos.getMarcha()+ " | Quantidade de Portas - "+eletricos.getQtdPortas()+ " | Quantidade de baterias - "+ eletricos.getQtdBaterias()+"\n";
        }
        for(Carros combustao : this.listaDecarrosCombustao){
            informacoes+="Tipo De Carro - "+combustao.getTipoDeCarro()+" | Modelo -"+combustao.getModelo()+ " | Cor - "+combustao.getCor()+ " | Marcha - "+
                    combustao.getMarcha()+ " | Quantidade de Portas - "+combustao.getQtdPortas()+ " | Tipo De Motor - "+ combustao.getTipoDeMotor()+"\n";
        }
        return informacoes;
    }
    public Eletrico fabricarCarroEletrc(int i, String tipoDeCarro){
        Eletrico eletrico = new Eletrico();
        eletrico.setTipoDeCarro(tipoDeCarro);
        eletrico.setMarcha(EntradaSaida.solicitaMarcha((i+1)));
        eletrico.setQtdPortas(EntradaSaida.solicitaQtdPortas((i+1)));
        eletrico.setCor(EntradaSaida.solicitaCor((i+1)));
        eletrico.setModelo(EntradaSaida.solicitaModelo((i+1)));
        eletrico.setQtdBaterias(EntradaSaida.solicitaQtdBaterias((i+1)));
        return eletrico;
    }
    public Combustao fabricaCarroCombst(int i, String tipoDeCarro){
        Combustao combustao = new Combustao();
        combustao.setTipoDeCarro(tipoDeCarro);
        combustao.setMarcha(EntradaSaida.solicitaMarcha((i + 1)));
        combustao.setQtdPortas(EntradaSaida.solicitaQtdPortas((i + 1)));
        combustao.setCor(EntradaSaida.solicitaCor((i + 1)));
        combustao.setModelo(EntradaSaida.solicitaModelo((i + 1)));
        combustao.setTipoDeMotor(EntradaSaida.solicitaTipoDeMotor((i + 1)));
        return combustao;
    }

}
