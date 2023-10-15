import {NavBar, LoginUsuario, CadastroUsuario, CadastroPassagem, CadastroDestino} from "../../components/index.js";

const header = document.querySelector("header");
header.innerHTML = NavBar();

const formulario = document.querySelector(".formulario");
formulario.innerHTML = LoginUsuario();

const escolherForm = document.getElementById("escolherForm");

escolherForm.addEventListener("change", () => {
    switch (escolherForm.value) {
        case "login":
            formulario.innerHTML = LoginUsuario();
            break;
        case "cadastroUsuario":
            formulario.innerHTML = CadastroUsuario();
            break;
        case "cadastroDestino":
            formulario.innerHTML = CadastroDestino();
            break;
        case "cadastroPassagem":
            formulario.innerHTML = CadastroPassagem();
            break;
    }
})

