## Diagrama

![alt text](image-1.png)

NODOS:

N1 =  public class User {
    public Connection conectarBD() {
        Connection conn = null

N2 =         try {
        	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1/teste?user=root&password=1234";
            conn = DriverManager.getConnection(url);
N3 =         } catch (Exception e) {
        }

N4 =  return conn
   
N5 =     public String nome = "";
    public boolean result = false;

    public boolean verificarUsuario(String login, String senha) {

    	String sql = "";
        Connection conn = conectarBD();

        // INSTRUÇÃO SQL
        sql = "select nome from usuarios ";
        sql += "where login = '" + login + "' ";
        sql += "and senha = '" + senha + "';";  

N6 =         try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }

N7 =         } catch (Exception e) {
        }   

N8 =             if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }

N9 = caso o if seja falso

N10 =  return result;    

## Caminho e a conta dos caminhos

C1 = N1,N2,N4,N5,N6,N8,N10
C2 = N1,N2,N4,N5,N6,N9,N10
C3 = N1,N2,N4,N5,N7,N10
C4 = N1,N3,N4,N5,N7,N10
C5 = N1,N3,N4,N5,N6,N8,N10
C6 = N1,N3,N4,N5,N6,N9,N10

## Complexidade ciclomática
V(G) = E – N + 2.
V(G) = 12 - 10 + 2
V(G) = 4



## Autor

Matheus Moreira de Arruda


