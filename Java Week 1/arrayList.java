import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // ArrayList<Integer> list = new ArrayList<>();

    // for (int i = 0;i<n;i++) {
    // list.add(sc.nextInt());
    // }

    // for (int i = 0; i <n; i++){
    // System.out.print(list.get(i) + ",");
    // }

    // System.out.println();

    // for (int ele : list) {
    // System.out.print(ele + " ");
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // String nums[] = str.split(",");
    // ArrayList<Integer> list = new ArrayList<>();

    // for (String num : nums) {
    // list.add(Integer.parseInt(num));
    // }
    // for (int ele: list) {
    // System.out.print(ele + " ");
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // String nums[] = str.split(",");
    // ArrayList<Integer> list = new ArrayList<>();

    // for (String num : nums) {
    // list.add(Integer.parseInt(num));
    // }
    // for (int ele: list) {
    // System.out.print(ele + " ");
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();

    // if (str.startsWith("{") && str.endsWith("}")){
    // str = str.substring(1, str.length() - 1);
    // }
    // String nums[] = str.split(",");
    // ArrayList<Integer> list = new ArrayList<>();

    // for (String num : nums) {
    // list.add(Integer.parseInt(num));
    // }
    // for (int ele: list) {
    // System.out.print(ele + " ");
    // }
    // }

    // IF Scanner class not working in Placements... Use Buffered Reader

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        System.out.println(word);

        int num1 = Integer.parseInt(br.readLine());

        double num2 = Double.parseDouble(br.readLine());
    }

}
