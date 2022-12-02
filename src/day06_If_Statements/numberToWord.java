package day06_If_Statements;

public class numberToWord {
    public static void main(String[] args) {
        int num = 6;
        String word = "";
        if (num == 1) {
            word = " One";
        }
        if (num == 2) {
            word = " 2";
        }
        if (num == 3) {
            word = " three";
        }
        if (num == 4) {
            word = " four";
        }
        if (num == 5) {
            word = " five";
        }
        if (num == 6) {
            word = " six";
        }
        if (num == 7) {
            word = " seven";
        }
        if(num == 8){
            word = " eight";
        }
        if(num == 9){
            word = " nine";
        }
        if(num == 0 ) {
            word = " zero";
        }
        System.out.println(word);





    }


}
/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement

 */