package br.com.ada.polotech.livraria.modelos;

public class Jogo extends Produto {
    private String distribuidora, estudio;

    private int quantidadeDeJogos = 0;

    public int getQuantidadeDeJogos() {
        return quantidadeDeJogos;
    }

    public void setQuantidadeDeJogos(int quantidadeDeJogos) {
        this.quantidadeDeJogos = quantidadeDeJogos;
    }

    public Jogo(String nomeDoProduto, Double precoDoProduto, String distribuidora, String estudio) {
        super(nomeDoProduto, precoDoProduto);
        this.distribuidora = distribuidora;
        this.estudio = estudio;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                super.toString() +
                " distribuidora: '" + distribuidora + '\'' +
                ", estudio: '" + estudio + '\'' +
                '}';
    }
}
