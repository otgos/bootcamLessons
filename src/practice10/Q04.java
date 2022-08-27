package practice10;
/*
    Count the frequency of the letters in a given String as the format below:
    Input: String str = "Java is so Good";
    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */
public class Q04 {
    public static void main(String[] args) {
        String str = "Java is so Good";
        String n = "";
        String newStr = str.replace(" ","");
        int count = 0;
        for(int i =0; i<newStr.length(); i++){
            char ch = newStr.charAt(i);
            for(int j = 0; j<newStr.length(); j++){
                if(ch==newStr.charAt(j)){
                    count++;
                }

            }
            if(!n.contains(String.valueOf(newStr.charAt(i)))){
                n=n+newStr.charAt(i)+count+" ";
            }

            count=0;
        }
        System.out.print(n);
    }
}
