package login;

import java.sql.Connection;
/**
 * Classe criada para testar o funcionamento da conexão com o banco de dados e verificar se o método {@link User#verificarUsuario(String, String)} está funcionando.
 * Ela utiliza a classe {@link User} para estabelecer a conexão e validar as credenciais de um usuário específico.
 * 
 * @author Matheus
 * @version 1.0
 */
public class Teste {
    /**
     * Método principal para execução do programa.
     * <p>
     * Este método estabelece uma conexão com o banco de dados, verifica as credenciais de um usuário e exibe mensagens no console indicando o sucesso ou falha dessas operações.
     * </p>
     * 
     * @param args Argumentos de linha de comando
     */
    public static void main(String[] args) {
        // Cria uma instância da classe User para interagir com o banco de dados
        User user = new User();
        // Estabelece a conexão com o banco de dados
        Connection conn = user.conectarBD();
        if (conn != null) {
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
        } else {
            System.out.println("Falha ao conectar-se ao banco de dados.");

        }
     // Credenciais do usuário a ser verificado
        String login = "Zhefiroth";
        String senha = "1234";

     // Verifica se as credenciais são válidas
        boolean usuarioValido = user.verificarUsuario(login, senha);

     // Exibe o resultado da verificação
        if (usuarioValido) {
            System.out.println("Usuário válido!");
            System.out.println("Nome do usuário: " + user.nome);
        } else {
            System.out.println("Login ou senha incorretos!");
        }
    }
}
