package login;
/**
 * Avaliação final do semestre
 *
 * Este código estabelece uma conexão com um banco de dados SQL e possui um método para verificar usuários.
 *
 * @author Matheus
 * @version 1.0
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
	/**
	 * Faz uma conexão com o banco de dados SQL.
	 *
	 * @return Um objeto {@link Connection} ativo conectado ao banco de dados.
	 */
    public Connection conectarBD() {
        Connection conn = null;

        try {
        	// Carrega a classe do driver JDBC para MySQL
        	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        	// URL de conexão ao banco de dados, incluindo o endereço, nome do banco e credenciais
            String url = "jdbc:mysql://127.0.0.1/teste?user=root&password=1234";
         // Estabelece a conexão com o banco de dados usando a URL fornecida
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
        	// Tratamento de exceções
        }
        return conn;
    }
    /**
     * Armazena o nome do usuário autenticado após uma chamada bem-sucedida de {@link #verificarUsuario(String, String)}.
     */
    public String nome = "";
    /**
     * Indica se a última verificação de usuário foi bem-sucedida.
     */
    public boolean result = false;
    /**
     * Verifica se o usuário existe no banco de dados e retorna seu nome se encontrado.
     *
     * @param login o login do usuário que pode estar no banco de dados
     * @param senha a senha do usuário que pode estar no banco de dados
     * @return o nome do usuário se encontrado; caso contrário, retorna null
     */

    public boolean verificarUsuario(String login, String senha) {
    	// String que irá armazenar a consulta SQL
    	String sql = "";
        // Objeto Connection para estabelecer a conexão com o banco de dados
        Connection conn = conectarBD();

        // Construção da instrução SQL
        sql = "select nome from usuarios ";
        sql += "where login = '" + login + "' ";
        sql += "and senha = '" + senha + "';";

        try {
        	// Statement para executar a consulta SQL
            Statement st = conn.createStatement();
            // ResultSet para armazenar os resultados da consulta
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
             // Recupera o nome do usuário do resultado da consulta
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
        	// Tratamento de exceções
        }
        return result;
    }
}
