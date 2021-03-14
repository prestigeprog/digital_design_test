import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Unpacker {
    public String unpack(String string){
        Pattern pattern = Pattern.compile("(\\d+\\[[^\\[\\]]+\\])", Pattern.CASE_INSENSITIVE);
        if (pattern.matcher(string).find()) {
            for (String string2: pattern.matcher(string).results()
                    .map(MatchResult::group)
                    .collect(Collectors.toSet())){
                String[] split = string2.split("[\\[\\]]+");
                String repeat = split[1].repeat(Integer.parseInt(split[0]));
                string = string.replace(string2, repeat);
                string = unpack(string);
            }
        } else  if (Pattern.compile("[\\[\\]]+").matcher(string).find()){
            System.out.println("Not valid string!");
        }
        return string;
    }
}
