import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Unpacker unpacker = new Unpacker();
        System.out.println(unpacker.unpack(str));
    }
}
