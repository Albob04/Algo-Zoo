public class DolphinShow extends Event {
    private boolean rainCoat;

    public DolphinShow(String name, int startTime, int endTime, double price, String eventPerformanceByAnimalId, boolean rainCoat) {
        super(name, startTime, endTime, price, eventPerformanceByAnimalId);
        this.rainCoat = rainCoat;
    }

    @Override
    public void displayEventInfo() {
        System.out.println("============================================");
        System.out.println("Event Name            : " + name);
        System.out.println("--------------------------------------------");
        System.out.println("Event Star Animal ID  : " + eventPerformanceByAnimalId);
        System.out.println("--------------------------------------------");
        System.out.println("Event Start           : " + startTime + ":00");
        System.out.println("--------------------------------------------");
        System.out.println("Event End             : " + endTime + ":00");
        System.out.println("--------------------------------------------");
        System.out.printf("Event Price ($)       : $%.2f%n", price);
        System.out.println("--------------------------------------------");
        System.out.println("Raincoat Required     : " + (rainCoat ? "Yes" : "No"));
        System.out.println("============================================\n");
    }

    @Override
    public void showPerformance() {
        System.out.println("The bird is performing: ");
    }
    
}
