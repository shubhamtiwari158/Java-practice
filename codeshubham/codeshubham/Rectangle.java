package codeshubham;

public class Rectangle {
    void area(){
        double l=10;
        double b=20;
        double a=2*(l+b);
        System.out.println("total="+a);
    }
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.area();
    }
}
