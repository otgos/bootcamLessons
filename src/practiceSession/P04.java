package practiceSession;

import java.util.ArrayList;
import java.util.List;

public class P04 {
    public static void main(String[] args) {
        List<Integer> pr=new ArrayList<>();
        int count = 0;
        for(int i =2; i<100; i++){
            for(int j = 2; j<=i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count==1){
                pr.add(i);

            }
            count = 0;
        }
        System.out.println(pr);
    }
}
