package Inheritence;

public class BoxWeigth extends Box {
    double weight;
    
    public BoxWeigth() {
        this.weight = -1;
    }

    public BoxWeigth (BoxWeigth other) {
        super(other);
        weight = other.weight;
    }

    BoxWeigth(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeigth(double l, double h, double w, double weight){
        super(l, h, w); // calls the parent class constructor!
        this.weight = weight;
    }
}
