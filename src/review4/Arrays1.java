package review4;

public class Arrays1 {
    public static void main(String[] args) {
        String[] planets={"Earth","Mars","Jupiter","Saturn","Neptune"};
        for (int i = 0; i < planets.length; i++) {
            System.out.println(planets[i]);
        }
        for (String planet : planets) {
            System.out.println(planet);

        }
    }
}
