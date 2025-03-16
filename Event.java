public abstract class Event {
    protected double price;
    protected int startTime;
    protected int endTime;
    protected String name;
    protected String eventPerformanceByAnimalId;

    protected Event(String name, int startTime, int endTime, double price, String eventPerformanceByAnimalId) {
        this.price = price;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
        this.eventPerformanceByAnimalId = eventPerformanceByAnimalId;
    }

    public abstract void displayEventInfo();

    public abstract void showPerformance();
}