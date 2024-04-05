import java.util.Scanner;

public class Ex3_13 {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int divid;
        int div;

        System.out.println("나뉨수를 입력하세요:");
        divid=s.nextInt();
        System.out.println("나눗수를 입력하세요.:");
        div=s.nextInt();
        try{
            System.out.println(divid+"를"+div+"로 나누면 몫은"+divid/div+"입니다.");
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다!");
        }
        finally{
            s.close();
        }
    }
    
}
