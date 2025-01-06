public class TrafficLight {
    private String color;
    private int duration;
    public TrafficLight(String initialColor, int initialDuration) {
        this.color = initialColor;
        this.duration = initialDuration;
    }
    public void changeColor(String newColor) {
        this.color = newColor;
    }
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 30);
        System.out.println("Initial color: " + trafficLight.color);
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());

        trafficLight.changeColor("green");
        System.out.println("New color: " + trafficLight.color);
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());
    }
}
