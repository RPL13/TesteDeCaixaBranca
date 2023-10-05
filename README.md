# 1.Erro na Carregamento do Driver JDBC:
Descrição: Na linha 10 do código, há um erro ao carregar o driver JDBC do MySQL. O nome da classe do driver está incorreto, e não é necessário chamar newInstance().

Linha com Erro: Class.forName("com.mysql.Driver.Manager").newInstance();

Correção: Use o nome correto da classe do driver JDBC do MySQL e remova o newInstance():

Class.forName("com.mysql.cj.jdbc.Driver");


# 2.Erro na URL de Conexão com o Banco de Dados:
Descrição: Na linha 11, a URL de conexão com o banco de dados está com um formato incorreto. Os parâmetros da URL estão fora de lugar.

Linha com Erro: String url = "jdbc:mysql://127.0.0.1/test7user=lopes&password=123";

Correção: Coloque os parâmetros da URL após o ponto de interrogação e adicione ? antes deles:

String url = "jdbc:mysql://127.0.0.1/?user=lopes&password=123";


# 3.Erro na Construção da Consulta SQL:
Descrição: Nas linhas 18, 19 e 20, há um erro na construção da consulta SQL. Faltam espaços em branco entre as cláusulas SQL, o que torna a consulta inválida.
Linhas com Erro:

sql += "select nome from usuarios";

sql +="where login= " + "'" + login + "'";

sql += " and senha = " + "'" + senha + "';";

Correção: Adicione espaços entre as cláusulas SQL para tornar a consulta válida:

sql += "SELECT nome FROM usuarios ";

sql += "WHERE login = '" + login + "' ";

sql += "AND senha = '" + senha + "';";

Além disso, é recomendável que você inclua um bloco finally para fechar a conexão com o banco de dados após o seu uso, como mostrado no código corrigido anteriormente. Isso garante uma gestão adequada das conexões e evita vazamentos de recursos.

# 4.Má documentação:
Além dos erros específicos que foram mencionados, o código também sofre de problemas de má documentação. Ter uma documentação adequada é fundamental para que outros desenvolvedores possam entender e trabalhar com o código com facilidade. Aqui estão alguns aspectos relacionados à má documentação do código:

Falta de Comentários Descritivos: O código carece de comentários descritivos que explicam o que está acontecendo em partes importantes do código. Comentários bem escritos ajudam outros desenvolvedores (e você mesmo no futuro) a entender a lógica por trás das operações realizadas.

Falta de Documentação de Funções e Métodos: As funções e métodos não estão adequadamente documentados. Cada função deve ser acompanhada por um comentário que descreve o que ela faz, quais parâmetros ela recebe e o que ela retorna.

Variáveis Sem Nomes Descritivos: As variáveis nome e result são declaradas sem um nome descritivo que indique o seu propósito. É importante escolher nomes de variáveis que transmitam claramente o que elas representam.

Falta de Comentários nas Declarações SQL: Não há comentários nas declarações SQL para explicar o que cada consulta está tentando realizar. Isso pode dificultar a depuração e a manutenção futura do código.

Falta de Documentação Geral: É útil incluir uma breve documentação geral no início do arquivo Java que explique o propósito do código, os pré-requisitos (como a necessidade do driver JDBC) e quaisquer outras informações relevantes.

# 5.Grafo de Fluxo:
![_Fluxograma](https://github.com/RPL13/TesteDeCaixaBranca/assets/99340714/c296c5bd-2036-4550-80a5-44d1d9dfcd42)

# 6.Complexidade ciclomática:
Para calcular a complexidade ciclomática, primeiro é preciso construir o grafo de fluxo de controle para o código. Com base no código fornecido e na representação do grafo de fluxo anterior, temos:

Número de Arestas (E): 12
Número de Nós (N): 11
Número de Componentes Conectados (P): 1
A complexidade ciclomática é calculada pela fórmula:

Complexidade ciclomática = Arestas - Nós + 2 * P

Aplicando a fórmula:

Complexidade ciclomática = 12 - 11 + 2 * 1
Complexidade ciclomática = 1 + 2
Complexidade ciclomática = 3

# 7.Sequências:
1;2;3

1;2;4;5;6;7;9

1;2;4;5;6;7;8;10;11

