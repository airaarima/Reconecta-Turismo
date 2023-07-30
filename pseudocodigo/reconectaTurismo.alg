Algoritmo "REConecta Turismo"

procedimento menu()
inicio
   escreval("---------------------------------")
   escreval("Bem vindo(a) a REConecta Turismo!")
   escreval("Qual opção deseja? ")
   escreval("1. Cadastrar novo cliente.")
   escreval("2. Cadastrar viagem")
   escreval("3. Verificar cadastro de cliente.")
   escreval("4. Verificar informações da viagem.")
   escreval("5. Sair")
   escreval("---------------------------------")
fimprocedimento

procedimento cadastroCliente()
inicio
   para i de 1 ate 1 faca
      para j de 1 ate 4 faca
         escolha j
         caso 1
            escreval("Qual seu nome completo? ")
            leia(cliente[i,j])
         caso 2
            escreval("Qual seu e-mail: ")
            leia(cliente[i,j])
         caso 3
            escreval("Qual sua data de nascimento? Digite no formato dia/mês/ano: ")
            leia(cliente[i,j])
         caso 4
            escreval("Qual seu telefone? Informe o DDD ")
            leia(cliente[i,j])
         fimescolha
      fimpara
   fimpara
   limpatela()
fimprocedimento

procedimento cadastroViagem()
inicio
   para i de 1 ate 1 faca
      para j de 1 ate 4 faca
         escolha j
         caso 1
            escreval("Qual seu local de partida? ")
            leia(viagem[i,j])
         caso 2
            escreval("Qual dia deseja partir? Digite no formato dia/mês/ano: ")
            leia(viagem[i,j])
         caso 3
            escreval("Qual o local de destino? ")
            leia(viagem[i,j])
         caso 4
            escreval("Qual dia deseja retornar? Digite no formato dia/mês/ano: ")
            leia(viagem[i,j])
         fimescolha
      fimpara
   fimpara
   limpatela()
fimprocedimento

procedimento consultaCliente()
inicio
   se (cliente[1,1]="")entao
      verificaCliente<-verdadeiro
      escreval("Não há clientes registrados ainda!")
   senao
      verificaCliente<-falso
      para i de 1 ate 1 faca
         para j de 1 ate 4 faca
            escreval(cliente[i,j])
         fimpara
      fimpara
   fimse
fimprocedimento

procedimento consultaViagem()
inicio
   se(viagem[1,1]="")entao
      verificaViagem<-verdadeiro
      escreval("Não há viagens registradas ainda!")
   senao
      verificaViagem<-falso
      para i de 1 ate 1 faca
         para j de 1 ate 4 faca
            escreval(viagem[i,j])
         fimpara
      fimpara
   fimse

fimprocedimento

procedimento novoRegistroCliente()
inicio
   escreval("Você já registrou um cliente! Ao realizar o cadastro novamente, você apaga o primeiro registro que fez.")
   escreval("Deseja realizar novo registro? ")
   escreval("1. Sim")
   escreval("2. Não")
   leia(opcaoNovoCliente)
   se (opcaoNovoCliente=1)entao
      cadastroCliente()
   fimse
fimprocedimento

procedimento novoRegistroViagem()
inicio
   escreval("Você já registrou uma viagem! Ao realizar o cadastro novamente, você apaga o primeiro registro que fez.")
   escreval("Deseja realizar novo registro? ")
   escreval("1. Sim")
   escreval("2. Não")
   leia(opcaoNovaViagem)
   se(opcaoNovaViagem=1)entao
      cadastroViagem()
   fimse

fimprocedimento


Var
   cliente:vetor[1..1,1..4]de caractere
   viagem:vetor[1..1,1..4] de caractere
   i, j, opcao, opcaoNovoCliente, opcaoNovaViagem:inteiro
   verificaCliente, verificaViagem: logico

Inicio

   verificaCliente<-verdadeiro
   verificaViagem<-verdadeiro
   repita
      menu()
      leia(opcao)

      escolha opcao
      caso 1
         se (verificaCliente=falso)entao
            novoRegistroCliente()
         senao
            cadastroCliente()
         fimse
      caso 2
         se(verificaViagem=falso)entao
            novoRegistroViagem
         senao
            cadastroViagem()
         fimse
      caso 3
         consultaCliente()
      caso 4
         consultaViagem()
      fimescolha
   ate opcao=5
   escreva("Agradecemos a preferência. Até mais!")
Fimalgoritmo