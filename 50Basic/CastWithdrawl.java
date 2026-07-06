import java.util.*;

class CastWithdrawl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine().trim());
        int[] notes = {500,100,50,10};
        int totalNotes = 0;
        for (int note : notes){
            int count = amount / note;
            totalNotes += count;
            if (count > 0){
                System.out.println(note + " " + count);
                amount %= note;
            }
        }
        if (amount != 0){
            System.out.println("Not possible");
        }else {
            System.out.println("Total notes: " + totalNotes);
        }
    }
}