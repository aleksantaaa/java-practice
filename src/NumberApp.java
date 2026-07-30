import java.util.Scanner;
class NumberTest {
    NumberTest(){}
    void testTheNumber() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println ("Поздороваться");
            System.out.println ("Выйти");
            int number = input.nextInt();
            if ( number == 1) {
                System.out.println ("Привет!");
            }
            else if ( number == 2) {
                break;
            }
        }
    }
}
public class NumberApp {
    public static void main(String[] args) {
        NumberTest nt = new NumberTest();
        nt.testTheNumber();
    }
}