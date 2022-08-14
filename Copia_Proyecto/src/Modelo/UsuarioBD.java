
package Modelo;

import Vista.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UsuarioBD {

    PreparedStatement ps;
    ResultSet rs;
    Connect cn = new Connect();
    Connection con = cn.getConnection();

    public login log(String login, String password){
        int resultado = 0;
        login l = new login();
        String sql = "SELECT * FROM usuario WHERE login = '"+login+"' and PASSWORD = '"+password+"';";
        String user = "SELECT usuario.nombre FROM usuario WHERE login = '"+login+"' and PASSWORD = '"+password+"';";
        try{
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            

            if(rs.next()){
                
                resultado = 1;
                if(resultado == 1){
                    JOptionPane.showMessageDialog(null, "Bienvenido ");
                    new Vista.Inicio().setVisible(true);                    
                }                 
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña No Validos");
            }
        }catch (SQLException e){
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error, El usuario ");
        }
        return l;
    }
  
}
