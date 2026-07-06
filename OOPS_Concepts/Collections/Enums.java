package Collections;
import java.lang.*;

public class Enums {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday ,Sunday;
        //these are enum constants
        //by default the members of the enum are public , static and final
        // since its final you can't create child enums

        Week(){
            System.out.println("Constructor called for " + this);
        }
        //internally : public static final Week Monday = new Week();

        @Override
        public void A(){
            System.out.println("hello how are you?");
        }
    }

  
    public interface A {
        public void A();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Saturday;

        // for(Week day : Week.values()){
        //     System.out.println(day);
        // }

        week.A();

        System.out.println(week.valueOf("Sunday"));
    }
}
