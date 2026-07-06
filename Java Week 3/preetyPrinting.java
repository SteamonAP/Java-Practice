import java.util.*;

public class preetyPrinting {
    public static void main(String[] args) {
        float a = 453.1294f;
        //System.out.printf("Formatted no: %.2f", a);
        // System.out.printf("Pie: %.3f" ,Math.PI);
        // System.out.printf(" Hello ,I'm %s and nothing here is %s", "Hannibal Lecter", "Vegeterian");
        // System.out.println('a' + 'b');
        // System.out.println("a" + "b");
        // System.out.println((char)('a' + 3));

        // String s = "";
        // for (int i = 0; i < 26; i++){
        //     char ch = (char)('a' + i);
        //     s = s + ch;
        //     //System.out.println(ch);
        // }
        // System.out.println(s); //TC O(N^2);


        // StringBuilder sb = new StringBuilder();

        // for (int i = 0; i < 26 ; i++) {
        //     char ch = (char)('a' + i);
        //     sb.append(ch);
        // }
        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);

        String name = "Amogh Pitale";
        
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('o'));
        System.out.println(name.lastIndexOf('h'));
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }    
}
