package zoologico;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Conexao {
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;
	//jdbc:mysql://127.0.0.1:3306/?user=root
	
	static String servidor = "jdbc:mysql://127.0.0.1:3306/zoologico?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
	//String servidor = "jdbc:mysql://127.0.0.1:3306/zoologico?autoReconnect=true&useSSL=false";
	//String servidor = "jdbc:mysql://127.0.0.1:3306/zoologico?useSSL=false";
	//BD_URL = "jdbc:mysql://localhost:port/bd_name?useTimezone=true&serverTimezone=UTC";
	static String usuario="root";
	static String senha = "18008657";
	static String driver = "com.mysql.cj.jdbc.Driver";
	
	
	public static Connection getConnection() {
		try {
			Class.forName(driver);
			
			return DriverManager.getConnection(servidor, usuario, senha);
			
		} catch (ClassNotFoundException | SQLException ex) {
			throw new RuntimeException("Erro na conexão: ", ex);
			
		}
	}
	

	
	
	
	public static void closeConnection(Connection con) {

        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
    }
    
    
    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {
            if(stmt!=null){
                stmt.close();
            }
        } catch (SQLException ex) {
        	System.out.println("Erro: " + ex);
        }
    }
    
        public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con,stmt);
        
        try {
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException ex) {
        	System.out.println("Erro: " + ex);
        }
    }
        
        
        
        
        
        
        
        
        
	/*
	public static Connection conectar() {
		String servidor = "jdbc:mysql://127.0.0.1:3306/zoologico?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
		//String servidor = "jdbc:mysql://127.0.0.1:3306/zoologico?autoReconnect=true&useSSL=false";
		//String servidor = "jdbc:mysql://127.0.0.1:3306/zoologico?useSSL=false";
		//BD_URL = "jdbc:mysql://localhost:port/bd_name?useTimezone=true&serverTimezone=UTC";
		String usuario="root";
		String senha = "18008657";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			this.connection=(Connection) DriverManager.getConnection(servidor, usuario, senha);
			this.statement=(Statement) this.connection.createStatement();
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public boolean estaConectado() {
		if(this.connection != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void desconectar() {
		try {
			this.connection.close();
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	*/

	
	
}
