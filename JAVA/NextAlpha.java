import java.util.*;
public class NextAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char character = sc.next().charAt(0);
        next(character);
        //printAscii();
    }

    public static void next(char character){
        String Result = "";
        for(int i=0;i<5;i++){
            Result += character;
            character++;
            
        }
        System.out.println("Output : "+Result);
    }

    public static void printAscii(){
        for(int i=0;i<127;i++){
            System.out.println(i + " : "+ (char)(i));
        }
    }
}
