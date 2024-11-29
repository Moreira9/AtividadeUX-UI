## Grafo

![Diagrama](https://github.com/user-attachments/assets/86f1da7f-26dc-4b72-a742-cbb6c9c5faab)


NODOS:

N1 
~~~JAVA
public class User {
    public Connection conectarBD() {
        Connection conn = null
~~~

N2 
~~~JAVA
    try {
        	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1/teste?user=root&password=1234";
            conn = DriverManager.getConnection(url);
~~~

N3
~~~JAVA
} catch (Exception e) {
        }
~~~
N4
~~~JAVA
return conn
~~~
   
N5   
~~~JAVA
public String nome = "";

    public boolean result = false;

    public boolean verificarUsuario(String login, String senha) {

    	String sql = "";
        Connection conn = conectarBD();

        // INSTRUÇÃO SQL
        sql = "select nome from usuarios ";
        sql += "where login = '" + login + "' ";
        sql += "and senha = '" + senha + "';";
~~~

N6
~~~JAVA
            try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
~~~

N7  
~~~JAVA
        } catch (Exception e) {
        }
~~~ 

N8 
~~~JAVA
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
~~~ 

N9 

caso o if seja falso

N10
~~~JAVA
return result;
~~~ 

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


