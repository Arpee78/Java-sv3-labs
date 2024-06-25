package stringseparate;

import java.util.List;

public class Codes {

    public String getCodesStartWithLetter(List<String> codes){
        StringBuilder sb = new StringBuilder("Betűvel kezdődő kódok: ");
        for (int i = 0; i < codes.size(); i++) {
            if (Character.isAlphabetic(codes.get(i).charAt(0))){
                if (i>0){
                    sb.append(", ");
                }
                sb.append(codes.get(i));
            }
        }
        return sb.toString();
    }
}
