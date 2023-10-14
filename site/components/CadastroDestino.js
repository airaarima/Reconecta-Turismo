export const LoginUsuario = () => {
    return `<div>
        <h2>Cadastro de Destino</h2>
        <form>
            <fieldset>
                <label for="cidade">Cidade</label><input type="text" name="cidade">
                <label for="estado">Estado</label><input type="text" name="estado">
                <label for="pais">País</label><input type="text" name="pais">
                <label for="valor">Valor</label><input type="number" name="valor">
            </fieldset>
        </form>
        <div class="divButton">
            <button class="btn btn-light" type="submit">Cadastrar</button>
        </div>
    </div>`
}