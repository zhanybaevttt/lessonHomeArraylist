import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 50; i++) {
            int c=random.nextInt(1,100);
            list.add(c);

         if (c%2==1){
             list2.add(c);
         }
         else {
list3.add(c);
         }

        }
        System.out.println("1 дени 100 го чейинки"+list);
        System.out.println("-----------------------------");
        System.out.println("так сандар"+list2);
        System.out.println("------------------------------");
        System.out.println( "жуп сандар"+list3);



























    }
}