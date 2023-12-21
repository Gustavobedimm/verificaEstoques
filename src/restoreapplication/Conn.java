package restoreapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conn {
    public static String status = "Não conectou...";
    public Connection con;
    
    public void Conectar() {
        //String databaseURL = "jdbc:firebirdsql:localhost:C:\\db\\ECODADOS_RST.ECO";
        //String databaseURL = "jdbc:firebirdsql:127.0.0.1:\\ecosis\\dados\\raio\\ECODADOS_RST.ECO";
        //String databaseURL = "jdbc:firebirdsql:127.0.0.1:D:\\DADOS\\SELARIA-MINEIRA\\BKPECO2211231800_RST.ECO";
        //String databaseURL = "jdbc:firebirdsql:127.0.0.1:D:\\DADOS\\CASA-DO-MINERADOR\\ECODADOS_RST.ECO";
        //String databaseURL = "jdbc:firebirdsql:127.0.0.1:C:\\ecosis\\dados\\SELTY\\ECODADOSRST.ECO";
        //String databaseURL = "jdbc:firebirdsql:127.0.0.1:D:\\DADOS\\SELARIA-MINEIRA\\BKPECO1306231800_RST.ECO";
        String databaseURL = "jdbc:firebirdsql:127.0.0.1:D:\\DADOS\\BOIGORDO\\ECODADOS_RST.ECO";
        
        String user = "sysdba";
        String password = "masterkey";
        String driverName = "org.firebirdsql.jdbc.FBDriver";
        try {
            Class.forName(driverName).newInstance();
            con = DriverManager.getConnection(databaseURL, user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage());
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getSQLState());
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getErrorCode());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar a base " + databaseURL + "ERRO : " + e);
        }
    }
    public boolean FecharConexao() {
        try {
            con.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
     
}
