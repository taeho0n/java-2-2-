public class Ex5_02 {
    public static void main(String[] args) {
        ColorPoint1 cp= new ColorPoint1(5,6,"blue");
        cp.showColorPoint();
    }
    
}
class Point1 {
    private int x,y;
    public Point1(){
        this.x=1; this.y=2;
    }
    public Point1(int x, int y){
        this.x=x; this.y=y;
        }
    public void showpoint(){
        System.out.println("("+x+","+y+")");
    }
}
class ColorPoint1 extends Point1 {
    private String color;
    public ColorPoint1(int x,int y,String color) {
        super(x,y);
        this.color=color;
    }
    public void showColorPoint(){
        System.out.println(color);
        showpoint();
    }
}