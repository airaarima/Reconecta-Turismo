package principal;

public class Destinos {
    private double valor;
    private String pais;
    private String cidade;
    private boolean promocao;

    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPais() {
        return this.pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return this.cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean isPromocao() {
        return this.promocao;
    }
    public boolean getPromocao() {
        return this.promocao;
    }
    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

}
