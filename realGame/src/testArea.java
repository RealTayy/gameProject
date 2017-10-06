
import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testArea {

    public static void main(String[] args) {
        /*String[] strArr = {"0", ".1", ".01" , "0.0", "0.01", "-.1", "-.01" , "-0.0", "-0.01", "-0"};
        Comparator<String> cusComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal big1 = new BigDecimal(o1);
                BigDecimal big2 = new BigDecimal(o2);
                return big1.compareTo(big2);
            }
        };
        Arrays.sort(strArr, 0 , strArr.length, cusComparator);
        for (String s : strArr) System.out.println(s);*/

        BigDecimal b1 = new BigDecimal("0");
        BigDecimal b2 = new BigDecimal("1");

        System.out.println(b1.compareTo(b2));
    }
}