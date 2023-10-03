package principal;

import java.time.LocalDate;

public class Passagens {
    Usuarios usuario;
    Destinos destino;
    private String localPartida;
    private LocalDate dataPartida;
    private LocalDate dataRetorno;
    private int quantidadePassagens;
    private double valorTotal;
    private String tipoViagem;
    private String nomeAcompanhante;
    private String CPFAcompanhante;
    private String RGAcompanhante;
    private LocalDate dataNascimento;

    public String getLocalPartida() {
        return this.localPartida;
    }

    public LocalDate getDataPartida() {
        return this.dataPartida;
    }

    public LocalDate getDataRetorno() {
        return this.dataRetorno;
    }

    public int getQuantidadePassagens() {
        return this.quantidadePassagens;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public String getTipoViagem() {
        return this.tipoViagem;
    }

    
    public String getNomeAcompanhante() {
        return this.nomeAcompanhante;
    }
    public void setNomeAcompanhante(String nomeAcompanhante) {
        this.nomeAcompanhante = nomeAcompanhante;
    }

    public String getCPFAcompanhante() {
        return this.CPFAcompanhante;
    }
    public void setCPFAcompanhante(String CPFAcompanhante) {
        this.CPFAcompanhante = CPFAcompanhante;
    }

    public String getRGAcompanhante() {
        return this.RGAcompanhante;
    }
    public void setRGAcompanhante(String RGAcompanhante) {
        this.RGAcompanhante = RGAcompanhante;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
