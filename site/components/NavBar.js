export const NavBar = () => {
    return `<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
      <a class="navbar-brand" href="../home/index.html"
        ><img src="../../assets/imgs/Logo/logo2.png" alt=""
      /></a>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarNav"
        aria-controls="navbarNav"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div
        class="collapse navbar-collapse justify-content-end"
        id="navbarNav"
      >
        <ul class="navbar-nav">
          <li class="nav-item">
            <a
              class="nav-link active"
              aria-current="page"
              href="../home/index.html"
              >HOME</a
            >
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../destino/destino.html">DESTINO</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../promocoes/promocoes.html">PROMOÇÕES</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../contato/contato.html">CONTATO</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../cadastro/cadastro.html">CADASTRO</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>`
}