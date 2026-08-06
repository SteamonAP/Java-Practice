import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
        //getAscii("", "ab");
        System.out.println(getAsciiRec("","abc"));
    }

    static void getAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        getAscii(p + ch, up.substring(1));
        getAscii(p, up.substring(1));
        getAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> getAsciiRec(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list; 
        }

        char ch = up.charAt(0);
        ArrayList<String> first = getAsciiRec(p + ch , up.substring(1));
        ArrayList<String> second = getAsciiRec(p, up.substring(1));
        ArrayList<String> third = getAsciiRec(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
