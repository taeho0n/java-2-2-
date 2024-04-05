import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        Rectangle rect= new Rectangle();
        Scanner s=new Scanner(System.in);
        System.out.println(">>");
        rect.width=s.nextInt();
        rect.height=s.nextInt();
        System.out.println("사각형의 면적은"+ rect.getArea());
        s.close();
    }
}
class Rectangle{
    int width;
    int height;
    public int getArea(){
        return width*height;
    }
}