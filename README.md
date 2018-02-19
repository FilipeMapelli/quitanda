

Para executar:

Ter banco MYSQL
->executar CREATE DATABASE quitanda;

*Se necessário, em application.properties alterar o usuário e senha de seu banco.

-> Executar a classe QuitandaBarnabeApplication

Com o SpringBoot iniciado, usar o POSTMAN ou outro software, para simular requisições, 
os endpoints que estão prontos(sem tratamentos de erros) são:

POST e GET(findAll) -> localhost:8080/produtos
GET, PUT e DELETE passando id na url -> localhost:8080/produtos/{id}


Modelo de JSON para o produto:

{
	"nome" : "Banana",
	"descricao" : "Nanica",
	"calorias" : 2500,
	"pesoMedio" : 2,
	"tipoProduto": {
		"nome" : "Fruta"
	}
}




