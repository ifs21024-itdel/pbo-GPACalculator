/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author david
 */

public class Database {
    private String host;
    private int port;
    private String username;
    private String password;
    private String database;
    
//    public Database(String localhost, int par, String vincen32168, String pbo_w12){}
    
    public Database(String host, int port, String username, String password, String database){
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.database = database;
                
    }

//    public Database(String host,int port,String username,String password,String database) {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    public String getHost(){
        return host;
    }
    public void setHost(String host){
        this.host = host;
    }
    public int getPort(){
        return port;
    }
    public void setPort(int port){
        this.port = port;
    }
    
//    public String getnim(){
//        return nim;
//    }
//    
//    public void setnim(String nim){
//        this.nim = nim;
//    }
    
//     public String getfirstname(){
//        return firstname;
//    }
//    public void setfirstname(String firstname){
//        this.firstname = firstname;  
//    }
//    
//    public String getlastname(){
//        return lastname;
//    }
//    public void setlastname(String lastname){
//        this.lastname = lastname;  
//    }
    
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;  
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getDatabase(){
        return database;
    }
    public void setDatabase(String database){
        this.database = database;
    }
    
    @Override
    public String toString(){
        return "Database{"+ "host=" + host + ",port=" + port + ", username=" + username +", password="+ password + ", database="+ database + '}' ;
    
    }
}
