
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        List<String> list=new ArrayList<String>();
        for (int a=0;a<n;a++){
            String firstName=scanner.next();
            String emailID=scanner.next();
            String regExPattern="[a-z].@gmail.com";

            Pattern pattern=Pattern.compile(regExPattern);
            Matcher matcher= pattern.matcher(emailID);
            if (matcher.find()){
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for (String string:list){
            System.out.println(string);
        }
        }}
