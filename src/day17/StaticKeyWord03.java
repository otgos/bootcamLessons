package day17;


import java.time.LocalDate;

public class StaticKeyWord03 {
    public static void main(String[] args) {
        StaticKeyWord03 obj = new StaticKeyWord03();
        System.out.println(StaticKeyWord03.setStdId("Tom Hanks", "math"));
        StaticKeyWord03 objss = new StaticKeyWord03();
        System.out.println(objss.setStdId("Otgo Ajk", "physics"));

        StaticKeyWord03 ewew = new StaticKeyWord03();
        System.out.println(setStdId("Otgo Ajk", "chemistry"));

    }

    public static int counter = 1000;
    public StaticKeyWord03(){
        counter++;
    }

    public static String setStdId(String stdName, String courseName){
        String firstChar = stdName.split(" ")[0].substring(0,1);
        String lastChar = stdName.split(" ")[1].substring(0,1);
        LocalDate date = LocalDate.now();
        int year = date.getYear();

        int courseCode = 0;
        switch (courseName.toLowerCase()){
            case "math":
                courseCode = 901;
                break;
            case "english":
                courseCode = 902;
                break;
            case "physics":
                courseCode = 903;
                break;
            case "chemistry":
                courseCode = 904;
                break;
            default:
                System.out.println(courseName+ " did not match");
        }
        return firstChar+lastChar+year+courseCode+counter;

    }
}
