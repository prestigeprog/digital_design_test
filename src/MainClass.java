import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(\\d+)\\[(.+)\\](.+)?$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && !str.equals(null)) {
            int a =  Integer.parseInt(matcher.group(1));
            for (int i = 0; i < a; i++){
                System.out.print(matcher.group(2));
            }
            if(matcher.group(3)!=null){
                System.out.print(matcher.group(3));
            }


        } else {
            System.out.println("Not valid string!");
        }
    }
}
