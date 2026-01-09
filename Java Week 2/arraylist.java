import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(67);
        // list.add(673);
        // list.add(672);
        // list.add(673);
        // list.add(674);
        // list.add(675);


        // System.out.println(list);
        // list.set(1, 45);
        // list.remove(3);
        // System.out.println(list);

        // for (int i = 0; i < 5; i++){
        //     list.add(in.nextInt());
        // }
        // for (int i = 0; i < 5; i++){
        //     System.out.print(list.get(i) + " ");
        // }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3 ; i++ ) {
            list.add(new ArrayList<>());
        }

        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0; j < 3; j++){
                list.get(i).add(in.nextInt()); //get array list at index i (row)
            }
        }
        System.out.println(list);



    }
}
