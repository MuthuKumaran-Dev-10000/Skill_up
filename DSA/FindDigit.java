public class FindDigit{
    public static void main(String[] args){
        if(args.length!=0){

            int no = Integer.parseInt(args[0])%10;
            if((Integer.parseInt(args[0])%10)<10){
                System.out.println("1 Digit found");
            }
            if(((Integer.parseInt(args[0])%100)<100)&&(Integer.parseInt(args[0])%100)>10){
                System.out.println("2 Digit found");
            }
             if(((Integer.parseInt(args[0])%1000)<1000)&&(Integer.parseInt(args[0])%1000)>100){
                System.out.println("3 Digit found");
            }
            System.out.println(no);
        }
    }
}