import java.sql.*;
import javax.swing.*;

public class DBConnect {
   Connection conn;
   
   public DBConnect()
   {
       try
       {
           Class.forName("oracle.jdbc.OracleDriver");
                   conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
       }
           catch(Exception ex)
           {
               JOptionPane.showMessageDialog(null, ex);
           }
   }
       public void QueryExecuter(String sql)
       {
           try{
               Statement stat= conn.createStatement();
               stat.execute(sql);
               stat.close();
               conn.close();
               JOptionPane.showMessageDialog(null,"RECORDsaved");
               
       }
           catch(Exception ex)
           {
               JOptionPane.showMessageDialog(null,ex);
               
           }
       }
       public ResultSet QueryReturner(String sql)
       {
          ResultSet rs= null;
           
           try{
               Statement stat= conn.createStatement();
               rs= stat.executeQuery(sql);
           }
           catch(Exception ex)
           {
               JOptionPane.showMessageDialog(null, ex);
           }
           return rs;
       }
                   
}                  
                   
                   
                   
                   
                   
                   
                   
                   
                   
