public abstract class TransportWithEngine extends TransportWithWheels {
    public TransportWithEngine (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигаетль");
    }

    @Override
    public void doService() {
        super.doService();
        checkEngine();
    }
}
