package replits;

public class test_Freq {
    public static void main(String[] args) {

        String str = "aaaabbccpppppppooooo";
      String result = "";
        int max = 0;
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                count ++;
            }else{
                if(count > max){
                    max = count;
                    result = "" + str.charAt(i-1);
                }
                count =1;
            }
        }
if(count > max){
    max  = count;

}
        System.out.print(max + " "  + result);

    }
}


