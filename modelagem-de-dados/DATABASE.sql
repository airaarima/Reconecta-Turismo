create database reconectaturismo;
use reconectaturismo;

CREATE TABLE usuarios (
	id_usuario INT PRIMARY KEY auto_increment,
	nome_completo VARCHAR(30),
	CPF VARCHAR(11) UNIQUE,
	RG VARCHAR(10) UNIQUE,
	data_nascimento DATE,
	email VARCHAR(50),
    senha varchar(6),
	rua VARCHAR(20),
	numero VARCHAR(6),
	bairro VARCHAR(20),
	cidade VARCHAR(20),
	UF CHAR(2)
);

CREATE TABLE destinos (
	id_destino INT PRIMARY KEY auto_increment,
	valor DECIMAL,
	pais VARCHAR(15),
	cidade VARCHAR(20),
	promocao BIT NOT NULL
);

CREATE TABLE passagens (
	id_usuario INT,
	id_destino INT,
	local_partida VARCHAR(30),
	data_partida DATE,
	data_retorno DATE,
	quantidade_passagens INT,
	valor_total DECIMAL,
	tipo_viagem ENUM('somente ida', 'ida e volta'),
	nome_acompanhante VARCHAR(30),
	CPF_acompanhante VARCHAR(11) UNIQUE,
	RG_acompanhante VARCHAR(10) UNIQUE,
	data_nascimento DATE,
	foreign key (id_usuario) references usuarios(id_usuario),
	foreign key (id_destino) references destinos(id_destino)
);

CREATE TABLE fale_conosco (
	id_faleConosco INT PRIMARY KEY auto_increment,
	nome_completo VARCHAR(30),
	CPF VARCHAR(11),
	email VARCHAR(30),
	assunto_contato VARCHAR(30),
	mensagem TEXT(250)
);