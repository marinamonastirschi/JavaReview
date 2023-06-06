package review5;

public class Repl141 {
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
    public static int maxValue(int[] arr){
        int max=0;
        for(int number:arr){
            if(number>max){
                max=number;
            }
        }
        return max;
    }
}
