import java.util.*;
public class SingletonClass {
    private SingletonClass(){

    }

    //only one instance 
    private static SingletonClass instance; // just a variable name, no biggy

    public static SingletonClass getInstance() {
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}
