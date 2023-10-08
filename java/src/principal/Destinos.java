package principal;

public class Destinos {
    private int id_destino;
    private double valor;
    private String pais;
    private String cidade;

    public Destinos(){
        
    }
    public Destinos(double valor, String pais, String cidade){
        this.valor=valor;
        this.pais=pais;
        this.cidade=cidade;
    }

    public int getId(){
        return this.id_destino;
    }
    public void setId(int id_destino){
        this.id_destino=id_destino;
    }

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
}
