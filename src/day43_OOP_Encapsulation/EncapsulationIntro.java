package day43_OOP_Encapsulation;

public class EncapsulationIntro {

    private String username = "Cybertek",
                  password = "Cybertek123";

    public String getUsername(){ // allows to read private data outside the class
        return username;
    }

    public String  getPassword(){
        return password;
    }

    public void setUsername(String username){
        if(username.length() < 5){
            System.out.println("Username needs to be at least 5 characters long");
            return; // exit
        }
        this.username = username;
    }

    public void setPassword(String password){
        if(password.length() < 8){
            System.out.println("Password needs to be at least 8 characters long");
            return;
        }

        this.password = password;
    }


}
