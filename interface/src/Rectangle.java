import java.sql.SQLOutput;

public class Rectangle implements Shape,AnotherShape {
     public void shapeArea(){
        System.out.println(" the rectangle area");
    }

    @Override
    public void getNum() {
        System.out.println("The get number from another shape");
    }
}
