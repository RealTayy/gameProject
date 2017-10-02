import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = "";

        while (in.hasNextLine()) input += in.nextLine();

        Pattern paOne = Pattern.compile("<h3><a href=\"/questions/(\\d+).+>([^<]+)<[^<]+</h3>");
        Pattern paTwo = Pattern.compile("\"relativetime\">([^<]+)<");

        Matcher maOne = paOne.matcher(input);
        Matcher maTwo = paTwo.matcher(input);

        while (maOne.find()) {
            System.out.println("FOUND");
            System.out.println(maOne.group());
            System.out.println(maTwo.group());
        }
    }
}
