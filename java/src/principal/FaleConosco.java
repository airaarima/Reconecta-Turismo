package principal;

public class FaleConosco {
    private String nome;
    private String CPF;
    private String email;
    private String assunto;
    private String mensagem;

    public FaleConosco(){

    }
    public FaleConosco(String nome, String CPF, String email, String assunto, String mensagem) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.assunto = assunto;
        this.mensagem = mensagem;
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

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssunto() {
        return this.assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return this.mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
