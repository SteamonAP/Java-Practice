/**
     * Calculate minimum number of notes to dispense
     * Available denominations: 500, 200, 100, 50
     * 
     * @param amount - amount to withdraw (must be multiple of 50)
     * @return array [count_500, count_200, count_100, count_50]
     */
import java.util.*;

public class atmNotes {
    public static int[] notes(int amount) {

        if (amount < 50 || amount % 50 != 0){
            return null;
        } 

        int[] amtcombo = new int[4];

        int remain = amount;

        amtcombo[0] = remain / 500;
        remain = remain % 500;

        amtcombo[1] = remain / 200;
        remain = remain % 200;

        amtcombo[2] = remain / 100;
        remain = remain % 100;

        amtcombo[3] = remain / 50;
        remain = remain % 50;


        return amtcombo;



    }

    
}
