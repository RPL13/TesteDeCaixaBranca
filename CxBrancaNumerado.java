package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
         1-    	public Connection conectarBD() {
		Connection conn = null;
   2-	     	try {
		     	Class.forName("com.mysql.Driver.Manager").newInstance();
		     	String url =  "jdbc:mysql://127.0.0.1/test7user=lopes&password=123";
		4-	conn = DriverManager.getConnection(url);		
		} catch (Exception e) { }  -3
		return conn;}
	public String nome="";
	public boolean result = false;
	public boolean verificarUsuario(String login, String senha) {
		String sql = "";
	5-	Connection conn = conectarBD();
		//INSTRUÇÃO SQL
	6-	sql += "select nome from usuarios";
		sql +="where login= " + "'" + login + "'";
		sql += " and senha = " + "'" + senha + "';";
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
		7-	if(rs.next()) {
			8-	result = true;
			10-	nome = rs.getString("nome");}
	9-	}catch (Exception e) { } 
	11-	return result; }														
	}//fim da class
