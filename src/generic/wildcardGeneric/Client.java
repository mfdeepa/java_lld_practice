package generic.wildcardGeneric;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void drawShapes(List<? extends Shape> li){
        for(Shape s:li){
            s.draw(); //calling method of shape class by child class instance.
        }
    }

    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        //list2.add(new Circle());

        drawShapes(list1); //calling method drawShape
        drawShapes(list2);
    }
}
