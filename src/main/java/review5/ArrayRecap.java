package review5;

public class ArrayRecap {
    public static void main(String[] args) {
        String[] language={"English","Russian","Turkish","French","Spanish"};
        for (String s : language) {
            System.out.print(s+" ");
        }
        System.out.println();
        for (int i = language.length-1; i >=0 ; i--) {
            System.out.print(language[i]+" ");


        }
    }
}
