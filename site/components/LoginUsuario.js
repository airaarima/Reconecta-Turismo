export const LoginUsuario = () => {
    return `<div>
        <h2>Que bom ver você de novo!</h2>
        <form>
            <fieldset>
                <label for="email">E-mail</label><input type="email" name="email">
                <label for="senha">Senha</label><input type="password" name="senha">
            </fieldset>
        </form>
        <div class="senha"><a href="#">Esqueceu sua senha?</a></div>
        <div class="divButton">
            <button class="btn btn-light" type="submit">Fazer login</button>
            <p>Ainda não tem uma conta?</p>
            <a href="#" id="cadastro">Cadastre-se</a>
        </div>
    </div>`
}