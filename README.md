

Para executar:

Ter banco MYSQL
->executar CREATE DATABASE quitanda;

*Se necessário, em application.properties alterar o usuário e senha de seu banco.

-> Executar a classe QuitandaBarnabeApplication

Com o SpringBoot iniciado, usar o POSTMAN ou outro software, para simular requisições, 
o endpoint que está pronto (sem tratamentos de erros) é:

POST localhost:8080/produtos
PUT localhost:8080/produtos/{id}
GET localhost:8080/produtos/{id}
DELETE localhost:8080/produtos/{id}

Modelo de JSON para o produto:

{
	"nome" : "Yaman",
	"descricao" : "teste",
	"calorias" : 3000,
	"pesoMedio" : 70,
	"tipoProduto": {
		"nome" : "Vaga Dev"
	}
}




