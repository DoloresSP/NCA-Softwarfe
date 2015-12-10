package IteraccionAñadir;
import java.sql.*;

public class Agente {

	Connection conn;
	Statement stat;
	ResultSet rst;

	
	public void conectar() throws SQLException{
	
		
		String url= "jdbc:ODBC:Ag";
		String login= "";
		String password= "";
		
		
		conn=DriverManager.getConnection(url);
		
		stat = conn.createStatement();
		System.out.println("Conexion establecida");

		
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
		}catch(ClassNotFoundException e){
			System.out.println("No se encontro la clase del Driver");

		}
		
		
	
	
	}
	
	
	public String[][] getTelefonos(){
		int numFilas;
		String[][] datos;
		String sql="select count(*) as numFilas from Agenda";
		try {
			rst=stat.executeQuery(sql);
			rst.next();
			numFilas=rst.getInt("numFilas");
			datos=new String[numFilas][4];
			String sql2="Select * from Agenda";
			rst=stat.executeQuery(sql2);
			int i=0;
			while(rst.next()){
				datos[i][0]=Integer.toString(rst.getInt(1));
				datos[i][1]=rst.getString("nom_ciudad");
				datos[i][2]=Integer.toString(rst.getInt(3));
				i++;
			}
			return datos;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void main (String[]args) throws SQLException{
		Agente conectar= new Agente();
		conectar.conectar();
		conectar.getTelefonos();
		
		
	}

	
}
