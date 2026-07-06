package Interfaces.Nested;

public class A {
    public interface innerA {
        boolean isOdd(int num);
    }
}

class B implements A.innerA {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
