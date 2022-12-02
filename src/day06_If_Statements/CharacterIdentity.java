package day06_If_Statements;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = '0';

        boolean isDigit = ch >= '0' && ch <= '9';
        boolean isLetter = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
        boolean isSpecialCh = !isLetter && !isDigit;
        String result = "";
        if (isDigit) {
            result = " Digit";
        }
        if (isLetter) {
            result = " Letter";
        }
        if (isSpecialCh) {
            result = " is special character";
        }
        System.out.println(result);


    }


    }
/*
Create a class named CharacterIdentity, and write a program that can identify if
the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'
		output:
			Special Character

			ch = '1'
		output:
			digit
		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */