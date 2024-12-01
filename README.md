## 1 Vulnerabilidade a SQL Injection:


Problema: No método verificarUsuario, os parâmetros login e senha são concatenados diretamente na instrução SQL.
Risco: Usuários mal-intencionados podem injetar código SQL malicioso, comprometendo a segurança do banco de dados.

## 2 Tratamento Inadequado de Exceções:

Problema: Os blocos catch estão vazios, o que significa que as exceções são suprimidas silenciosamente.
Risco: Dificulta a detecção e correção de erros durante a execução do programa.

## 3 Recursos não Fechados:

Problema: Objetos como Connection, Statement e ResultSet não são fechados após o uso.
Risco: Pode causar vazamento de recursos, levando a exceções e mau desempenho.

## 4 Credenciais de Banco de Dados Expostas:

Problema: As credenciais estão hardcoded no código (user=root&password=1234).

## 5 Uso Desnecessário de Class.forName e newInstance():

Problema: Desde o JDBC 4.0, não é necessário registrar o driver manualmente.

## 6 Possibilidade de NullPointerException:

Problema: Se a conexão conn não for estabelecida, conn.createStatement() resultará em erro.

##  7 Falta de Separação de Responsabilidades:

Problema: A classe User está responsável por conexão com o banco e lógica de negócio.

## 8 Uso de Variáveis Globais:

Problema: O uso de variáveis globais como nome pode levar a resultados inesperados em aplicações com múltiplos usuários.

## 9 Não Verificação de Erros de Conexão:

Problema: Não há verificação se a conexão com o banco foi bem-sucedida antes de executar a consulta.





