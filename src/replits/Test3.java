package replits;

public class Test3 {


    public static void main(String[] args) {

        String s = "aa2aa3";

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
                if(arr[i][j].equals("B")){
                    break;
                }

            }

        }

        int [] num1 = new int [3];
        int [] num2 = {2,4,6,8,10};
        num1=num2;

        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]);

        }
        System.out.println();
int x = 100;
        int a = x++;
        System.out.println(a);

        }
    }

