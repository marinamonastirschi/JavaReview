package review10;

public class FacebookUser {
   private String name;
   private String username;
   private String password;
   private String dob;

    public FacebookUser(String name, String username, String password, String dob) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.dob = dob;
    }

    void login(String username, String password){
        if(this.username.equals(username)&& this.password.equals(password)){
            System.out.println("Logged in");
        }
    }
    public String getDob(){
        return dob;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
