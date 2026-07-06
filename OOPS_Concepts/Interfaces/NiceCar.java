package Interfaces;

public class NiceCar {
    private Engine engine;
    private Media playMedia = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        playMedia.start();
    }

    public void stopMusic() {
        playMedia.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
