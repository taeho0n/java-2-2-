import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("월(1~12 )을 입력하시오:");
        int month = s.nextInt();
         if(month>=3 && month<=5){
            System.out.println("봄입니다");
         }
         else if(month>=6 && month<=8){
            System.out.println("여름입니다");
         }
         else if(month>=9 && month<=11){
            System.out.println("가을입니다.");
         }
         else if(month==12 || month<=2) {
            System.out.println("겨울입니다.");
        }
        else{
         System.out.println("1부터 12 사이의 숫자를 입력해주세요.");
        }
        s.close();
    }
}