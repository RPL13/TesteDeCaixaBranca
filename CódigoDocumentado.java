package login;

/**
*
* Todos os imports necessários para realizar a conexão com o banco
*
*
* "java.sql.Connection" representa uma conexão com um banco de dados
* "java.sql.DriverManager" fornece métodos para registrar e obter drivers de banco de dados
* "java.sql.ResultSet" representa um conjunto de resultados de uma consulta SQL
* "java.sql.Statement" representa uma instrução SQL.
*
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Classe que representa um usuário. Possuí métodos para conexão 
 * com o banco de dados e verificação de crendenciais de login
 */
public class User {

    /**
     * Método responsável por se conectar ao banco de dados
     *  
     * @return Connection
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
    public Connection conectarBD() {
        return conn;
    }

    /**
     * O nome do usuário
     */
    public String nome = "";

    /**
     * True se existir resultado na consulta do banco, caso contrário, false
     */
    public boolean result = false;

    /**
     * Método responsável por verificar se o usuário com o 
     * login e senha informados existe no banco de dados
     * @param login - O login do usuário
     * @param senha - A senha do usuário
     * @return TRUE caso o usuário exista, caso contrário, false
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        // INSTRUÇÃO SQL
        sql += "select nome from usuarios";
        sql += "where login= " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
        }
        return result;
    }
}