package practiceSession;

public class P03 {
    public static void main(String[] args) {
        int bananas= 165, daysSurvive = 0;
        boolean monkeyAlive = true;
        do{
            bananas -= 4;
            daysSurvive++;
            if(bananas<4){
                monkeyAlive = false;
            }
        }while (monkeyAlive);
        System.out.println(daysSurvive);
    }
}
