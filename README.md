Consegui encontrar 3 erros no código:

1- Linha 10 - O nome da classe do driver JDBC para o MySQL está incorreto. Deve ser com.mysql.cj.jdbc.Driver em vez de com.mysql.Driver.Manager. Além disso, não é necessário usar newInstance().

2- Linha 11 - A URL de conexão com o banco de dados está com um formato incorreto. A parte test7user=lopes&password=123 deve ser user=lopes&password=123.

3- Linha 18-19-20 -  Há um erro de sintaxe na construção da sua consulta SQL. Precisa adicionar espaços entre as cláusulas SQL.

O código foi reconstruído com os erros corrigidos.
