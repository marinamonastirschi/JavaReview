package review10;

public class FacebookUserTester {
    public static void main(String[] args) {
        FacebookUser vlad=new FacebookUser("Vlad","user123","pass123","1950-1-1");
        System.out.println(vlad.getDob());
        System.out.println(vlad.getUsername());
        vlad.setUsername("TSwift123");
        System.out.println(vlad.getUsername());

    }
}
