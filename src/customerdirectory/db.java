/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerdirectory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dennis
 */
public class db {
    
    public static Connection mycon(){
        
        Connection mycon = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            mycon = DriverManager.getConnection("jdbc:mysql://localhost/customerpro","root","");
            return mycon;
            
        
            
    }
    catch(ClassNotFoundException|SQLException e){
        
        System.out.println(e);
        return null;
        
    }
        
        
    }
}
