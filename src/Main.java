import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        File f = null;
        try {
            f = new File("inputFile");
            Scanner s = new Scanner(f);

            //Time:        34     90     89     86
            //Distance:   204   1713   1210   1780


            Digits test = new Digits(34, 204);
            Digits test2 = new Digits(90, 1713);
            Digits test3 = new Digits(89, 1210);
            Digits test4 = new Digits(86, 1780);

            String ok = "204171312101780";
            long nice = Long.parseLong("204171312101780");
            Digits test5 = new Digits(34908986, nice);

            int finalAnswer = test.number() * test2.number() * test3.number() * test4.number();
            System.out.println("Part 1: " + finalAnswer);
            System.out.println("Part 2: " + test5.part2());



        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
