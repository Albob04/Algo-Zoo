public class HippoFeeding extends Event implements Feeding{
    private String foodType = "Meat";

    public HippoFeeding(String name, int startTime, int endTime, double price, String eventPerformanceByAnimalId) {
        super(name, startTime, endTime, price, eventPerformanceByAnimalId);
    }

    @Override
    public void feedAnimal() {
        System.out.println("Feeding hippo with " + foodType);
    }

    @Override
    public void showPerformance() {
        System.out.println("Hippo is performing! ");
    }

    public void displayEventInfo() {
        displayEventInfo();
        System.out.println("Food Type: " + foodType);
    }
}
