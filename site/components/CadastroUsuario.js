export const CadastroUsuario = () => {
    return `<div>
        <h2>Cadastre-se e aproveite o melhor da REConecta Turismo</h2>
        <form>
            <fieldset>
                <label for="nome">Nome Completo</label><input type="text" name="nome">
                <label for="email">E-mail</label><input type="email" name="email">
                <label for="email">Crie uma senha</label><input type="password" name="senha">
            </fieldset>
        </form>
        <div class="divButton">
            <button class="btn btn-light" type="submit">Cadastre-se</button>
            <p>Já possui uma conta?</p>
            <a href="#" id="cadastro">Fazer login</a>
        </div>
    </div>`
}