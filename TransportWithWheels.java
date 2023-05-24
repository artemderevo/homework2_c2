public abstract class TransportWithWheels implements Serviceable  {
    private final String modelName;
    private final int wheelsCount;

    public TransportWithWheels(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void doService() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

}
