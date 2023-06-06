package review10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> amazonList=new ArrayList<>();

        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            amazonList.add(String.valueOf(i));
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
