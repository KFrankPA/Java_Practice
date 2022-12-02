package day10_string;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10/test1.txt"));
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());

        String word1 = "cat";
        String word2 = new String("cat");
        System.out.println(word1 + "\n" + word2);
        int num = scan.nextInt();

    }
}
