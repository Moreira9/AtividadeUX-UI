# Avalição Final

Este é um projeto Java onde o professor montou esse codigo para nós montar uma documentção e fazer teste da caixa branca atraves de diagrama

## Descrição

O projeto consiste em duas classes principais:

- `User.java`: Contém métodos para estabelecer conexão com o banco de dados e verificar se um usuário existe.
- `Teste.java`: Classe de teste para verificar o funcionamento dos métodos da classe `User`.

## Como Executar

Precisa criar um banco de dados sql com o seguintes comandos:

Criação do Banco de dados

CREATE DATABASE teste;

Criação da tabela usuarios

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(50) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    nome VARCHAR(100) NOT NULL
);

Inserir dados no seu banco de dados

INSERT INTO usuarios (login, senha, nome) VALUES ('Zhefiroth', '1234', 'Matheus');

Lembrar de confirar corretament a parte da url

"jdbc:mysql://127.0.0.1/Nome_do_seu_Banco_de_Dados?user=Seu_usuario_do_MYSQL&password=Sua_senha"

Tem que baixar o jar no site https://dev.mysql.com/downloads/connector/j/

Colocar na opção Platform Independent e fazer Download do "Platform Independent (Architecture Independent), ZIP Archive"

e pegar o Jar mysql-connector-j-9.1.0 e adicionar ao seu projeto

seguindo esse passos seu projeto estara funcionado



## Autor

Matheus Moreira de Arruda


