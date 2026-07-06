package Inheritence;

public class BoxMain {
    public static void main(String[] args) {
        // Box box1 = new Box(4.6,7.9,9.9);
        // Box box2 = new Box(box1);

        // System.out.println(box1.l + " " + box1.w + " " + box1.h);

        // BoxWeigth box3 = new BoxWeigth();
        // System.out.println(box3.h + " " + box3.w + " " + box3.l + " " + box3.weight);
        // BoxWeigth box4 = new BoxWeigth(2,3,4,5);
        // System.out.println(box4.h + " " + box4.w + " " + box4.l + " " + box4.weight);

        // Box box5 = new BoxWeigth(2,3,4,5);
        // System.out.println(box5.weight);
        // BoxWeigth box6 = new Box(2,3,4);
        // System.out.println(box6.l);

        BoxPrice box = new BoxPrice(5, 8, 200);
        System.out.println("b1:"+box.h);
        System.out.println("b1:"+box.w);
        System.out.println("b1:"+box.l);
        System.out.println("b1:"+box.weight);
        System.out.println("b1:"+box.price);

        BoxPrice box2 = new BoxPrice(box);
        System.out.println("b2:"+box2.l);
        System.out.println("b2:"+box2.w);
        System.out.println("b2:"+box2.h);
        System.out.println("b2:"+box2.weight);
        System.out.println("b2:"+box2.price);
    }
}
