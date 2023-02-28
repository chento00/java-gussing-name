import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char c;
        String store="";
        int val=0;
        System.out.print("Enter Name : ");
        String name=scanner.nextLine().toLowerCase().replace(" ","");
        for(c = 'a'; c <= 'z'; c++){
            val=val+1;
            for(int i=0;i<name.length();i++){
                if(name.charAt(i)==c){
                    store+=val+",";
                }
            }
            if(val==9){
                val=0;
            }
        }
        String []record=store.split(",");
        int sum=0;
        for(int i=0;i<record.length;i++){
            sum=sum+(Integer.parseInt(record[i]));
        }
        String result;
        while (true){
            int resultSum=0;
            result=Integer.toString(sum);
            String part[]=result.split("");
            if(sum>9){
                for(int i=0;i<part.length;i++){
                    resultSum+=Integer.parseInt(String.valueOf(part[i]));
                }
            }else{
                break ;
            }
            sum=resultSum;
        }
        System.out.println("result :" +sum);
    }
}
