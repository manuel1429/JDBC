package test;

import java.sql.*;

public class TestMysqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test"
                + "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        
        try {
            Connection conexion = DriverManager.getConnection(url,"root","admin");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT * FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Nombre:" + resultado.getString("nombre"));
                System.out.print(" Apellido:" + resultado.getString("apellido"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
