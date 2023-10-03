package principal;
import java.time.LocalDate;

public class Usuarios {
    private String nome;
    private String CPF;
    private String RG;
    private LocalDate dataNascimento;
    private String email;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String UF;

    public Usuarios(String nome, String CPF, String RG, LocalDate dataNascimento, String email, String rua, String numero, String bairro, String cidade, String UF){
        this.nome=nome;
        this.CPF=CPF;
        this.RG=RG;
        this.dataNascimento=dataNascimento;
        this.email=email;
        this.rua=rua;
        this.numero=numero;
        this.bairro=bairro;
        this.cidade=cidade;
        this.UF=UF;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return this.RG;
    }
    public void setRG(String RG) {
        this.RG = RG;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getRua() {
        return this.rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return this.UF;
    }
    public void setUF(String UF) {
        this.UF = UF;
    }

    
}
