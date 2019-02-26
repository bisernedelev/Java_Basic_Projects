/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biserPC
 */
public class Credentials {

    private  String username;
    private  String password;
    private String newPassword;
    private String oldPassword;
    
     private String olderPassword;

   
     Credentials(String username, String password) {

        this.username=username;
        this.password=password;

    }
     
   Credentials(String username, String password,String newPassword)  {
   
        this.username=username;
        this.password=password;
        this.newPassword=newPassword;
   
   }
    
 void changePassword(String newPassword){
    
    password = newPassword;
    password=oldPassword;
    
     }


   
boolean checkPrevoiusPassword(String oldPassword, String newPassword){
  return oldPassword.equals(newPassword);
   }



   public String getUsername() {
        return username;
    }

  public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }



}
