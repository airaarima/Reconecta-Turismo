export const CadastroPassagem = () => {
    return `<div>
        <h2>Cadastro de Passagem</h2>
        <form> 
            <fieldset>
                <label for="usuario">Usuario</label><input type="text" name="usuario">
                <label for="destino">Destino</label><input type="text" name="destino">
                <label for="quantidade">Quantidade de Passagens</label><input type="number" name="quantidade">
                <label for="dataPartida">Data Partida</label><input type="date" name="dataRetorno">
                <label for="dataPartida">Data Retorno</label><input type="date" name="dataRetorno">
            </fieldset>
        </form>
        <div class="divButton">
            <button class="btn btn-light" type="submit">Comprar passagem</button>
        </div>
    </div>`
}