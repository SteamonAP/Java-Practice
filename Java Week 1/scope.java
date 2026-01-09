public class scope {
    public static void main(String[] args) {
        int a = 87;
        {
            a = 89; // outside initialized but can be used inside a scope
            // System.out.println(a);
            int c = 100; // cannot be used outside this scope as defined inside
            System.out.println("inside : " + c);
        }
        int c = 10000;
        System.out.println("outside : " + c);

        for (int i = 0 ;i < 4 ; i++){
            // int a = 3;
        }
    }
}
