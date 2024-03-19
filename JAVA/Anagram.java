import java.util.*;
public class Anagram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for A");
        String a = scanner.nextLine();
        System.out.println("Enter the value for B");
        String b = scanner.nextLine();
        char cur;
        int asciicur;
        int suma = 0;
        int sumb = 0;
        for(int i=0;i<a.length();i++){
            cur = a.charAt(i);
            asciicur = (int)cur;
            suma+=asciicur;
        }
        for(int i=0;i<b.length();i++){
            cur = b.charAt(i);
            asciicur = (int)cur;
            sumb+=asciicur;
        }
        if(suma==sumb){
            System.out.println("The Given String is An Anagram");
        }
        else{
            System.out.println("The Given String is not Anagram");
        }
    }
}
