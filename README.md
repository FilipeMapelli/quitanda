

<b>Para executar:</b>

Ter banco MYSQL
->executar CREATE DATABASE quitanda;

*Se necessário, em application.properties alterar o usuário e senha de seu banco.

-> Executar a classe QuitandaBarnabeApplication

Com o SpringBoot iniciado, usar o POSTMAN ou outro software, para simular requisições, 
os endpoints que estão prontos(sem tratamentos de erros) são:

Criação de produtos e inserção no estoque:

* Se passar o tipoProduto sem id, ou com id nulo, este será persistido. 

<b>POST /estoque</b>

modelo JSON:
<p>{</p>
  <p>&emsp;"produto": {</p>
  <p>&emsp;&emsp;"calorias": 130,</p>
   <p> &emsp;&emsp;"descricao": "Rei",</p>
   <p> &emsp;&emsp;"nome": "Melão",</p>
  <p>  &emsp;&emsp;"pesoMedio": 5,</p>
   <p> &emsp;&emsp;"tipoProduto": {</p>
  <p>  &emsp;&emsp;&emsp;"id": 4,</p>
   <p>   &emsp;&emsp;&emsp;"nome" : "Fruta"</p>
   <p> &emsp;&emsp;}</p>
  <p>&emsp;},</p>
 <p> &emsp;"quantidadeTotal": 15</p>
}</p>




