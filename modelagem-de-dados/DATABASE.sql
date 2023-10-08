create database reconectaturismo;
use reconectaturismo;

CREATE TABLE usuarios (
	id_usuario INT PRIMARY KEY auto_increment,
	nome_completo VARCHAR(30),
	CPF VARCHAR(11) UNIQUE,
	RG VARCHAR(10) UNIQUE,
	data_nascimento DATE,
	email VARCHAR(50),
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
	cidade VARCHAR(30)
);

CREATE TABLE passagens (
	id_usuario INT,
	id_destino INT,
	local_partida VARCHAR(30),
	data_partida DATE,
	data_retorno DATE,
	quantidade_passagens INT,
	foreign key (id_usuario) references usuarios(id_usuario),
	foreign key (id_destino) references destinos(id_destino)
);

CREATE TABLE fale_conosco (
	id_faleConosco INT PRIMARY KEY auto_increment,
	nome_completo VARCHAR(30),
	CPF VARCHAR(11),
	email VARCHAR(30),
	assunto_contato VARCHAR(50),
	mensagem TEXT(250)
);