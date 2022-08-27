package practice11;

public class Q02 {
      /*

             Type code to print shape below:

                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6

         */

    public static void main(String[] args) {

        for(int row = 1; row<7; row++ ){//row control


            for(int space=1; space<row; space++ ){

                System.out.print("*");
            }
            for(int digit=row; digit<7; digit++){//Digits

                System.out.print(digit+" ");

            }

            System.out.println("==>");
        }

    }
}
