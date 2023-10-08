package principal;

import java.time.LocalDate;

public class Passagens {
    private Usuarios usuario;
    private Destinos destino;
    private String localPartida;
    private LocalDate dataPartida;
    private LocalDate dataRetorno;
    private int quantidadePassagens;
    private String nomeAcompanhante;
    private String CPFAcompanhante;
    private String RGAcompanhante;
    private LocalDate dataNascimento;

    public Passagens(){

    }
    public Passagens(String local_partida, LocalDate data_partida, LocalDate data_retorno, int quantidade_passagens){
        localPartida=local_partida;
        dataPartida=data_partida;
        dataRetorno=data_retorno;
        quantidadePassagens=quantidade_passagens;
    }
    public Usuarios getUsuario() {
        return this.usuario;
    }
    public void setUsuario(Usuarios usuario){
        this.usuario=usuario;
    }

    public Destinos getDestino() {
        return this.destino;
    }
    public void setDestino(Destinos destino) {
        this.destino = destino;
    }

    public String getLocalPartida() {
        return this.localPartida;
    }
    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public LocalDate getDataPartida() {
        return this.dataPartida;
    }
    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalDate getDataRetorno() {
        return this.dataRetorno;
    }
    public void setDataRetorno(LocalDate dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public int getQuantidadePassagens() {
        return this.quantidadePassagens;
    }
    public void setQuantidadePassagens(int quantidadePassagens) {
        this.quantidadePassagens = quantidadePassagens;
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
