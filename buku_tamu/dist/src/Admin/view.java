package Admin;

import buku_tamu.Tamu;
import java.sql.*;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class view {
    Map<Integer,Tamu>  data = new HashMap<Integer,Tamu>();
    int sum;
    public view (){
        
     try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bukutamu", "root", "");
            Statement stmt = conn.createStatement();
            ){  
                ResultSet rset = stmt.executeQuery("select * from tamu");
                int i=0;
                while (rset.next()){
                    Tamu tm = new Tamu(rset.getString("Tanggal"), rset.getString("Nama"),rset.getString("Email"), 
                            rset.getString("Telpon"), rset.getString("Alamat"), rset.getString("Pekerjaan"), 
                            rset.getString("Instansi"), rset.getString("Kepentingan"));
                    data.put(i, tm);
                    i++;
                }       
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        } 
}
