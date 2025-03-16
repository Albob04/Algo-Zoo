import java.util.ArrayList;

class ZooManagement {
    private static ArrayList<Animal> animalList = new ArrayList<>();
    private static ArrayList<ZooKeeper> keeperList = new ArrayList<>();
    private static ArrayList<Event> eventList = new ArrayList<>();

    public void LoadSampleData(){
        addAnimal(new Lion("1ln", "Femi", "African Lion", "Panthera leo", "Male", 3, 190.5, 1.2, "Savanna", false));
        addAnimal(new Hippo("2hp", "kingkong", "African hippo",  "Hippopotamus amphibius", "Female", 8, 1500.0, 1.5, "River", true));
        addKeeper(new ZooKeeper("John Doe", 5, "Mammals", 30, "ZK001"));
        addEvent(new HippoFeeding("Hippo feeding", 18, 20, 30.0, "2hp"));
        addEvent(new DolphinShow("Dolphin show", 18, 20, 30.0, "iln", true));
    }

    // Animal Management
    public void addAnimal(Animal animal) {
        if (animal != null) {
            animalList.add(animal);
        }
    }

    public void removeAnimal(String id) {
        if (id == null || id.isEmpty()){
            System.out.println("Please input the right ID");
        } else {
            for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).idAnimal.equalsIgnoreCase(id)) {
                animalList.remove(i);
                System.out.println("Your Animal has been Succsesfully removed\n");
                break;
            } else {
                System.out.println("The ID you were refering could not be found.\n");
                }
            }
        }
    }

    public boolean searchAnimal(String id) {
        if (id == null || id.isEmpty()) return false;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).idAnimal.equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false; // Not found
    }


    public static void editAnimalsAge(String id, int newAge) {
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i) != null && animalList.get(i).idAnimal.equalsIgnoreCase(id)) {
                animalList.get(i).umurAnimal = newAge;
                System.out.println("\n" + animalList.get(i).namaAnimal + "'s age has been updated.");
                System.out.println("-----------------------------------------\n");
                System.out.println("======== ANIMAL LIST ========");
            }
        }
    }

    public static void editAnimalsWeight(String id, double newWeight) {
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i) != null && animalList.get(i).idAnimal.equalsIgnoreCase(id)) {
                animalList.get(i).weightAnimal = newWeight;
                System.out.println("\n"+  animalList.get(i).namaAnimal + "'s weight has been updated.");
                System.out.println("-----------------------------------------\n");
                System.out.println("======== ANIMAL LIST ========");
            }
        }
    }

    public static void editAnimalsHeightInCm(String id, double newHeightInCm) {
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i) != null && animalList.get(i).idAnimal.equalsIgnoreCase(id)) {
                animalList.get(i).heightAnimal = newHeightInCm;
                System.out.println("\n"+ animalList.get(i).namaAnimal + "'s height has been updated.");
                System.out.println("-----------------------------------------\n");
                System.out.println("======== ANIMAL LIST ========\n");
                animalList.get(i).displayAnimalInfo();
            }
        }
    }

    // ZooKeeper Management
    public void addKeeper(ZooKeeper keeper) {
        if (keeper != null) {
            keeperList.add(keeper);
        }
    }

    public static void sortZooKeepersByName() {
        int n = keeperList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (keeperList.get(j).getKeeperName().compareToIgnoreCase(keeperList.get(j + 1).getKeeperName()) > 0) {
                    // Swap elements
                    ZooKeeper temp = keeperList.get(j);
                    keeperList.set(j, keeperList.get(j + 1));
                    keeperList.set(j + 1, temp);
                }
            }
        }
    }

    public void joinEvent(String eventName) {
        if (eventName == null || eventName.isEmpty()) {
            System.out.println("Invalid event name! Please enter a valid event.");
            return;
        }
    
        for (int i = 0; i < eventList.size(); i++) {
            if (eventList.get(i).name.equalsIgnoreCase(eventName)) {
                System.out.println("You have successfully joined the event: " + eventName);
                return;
            }
        }
        
        System.out.println("Event not found! Please check the event name.");
    }
    

    public void removeKeeper(String id) {
        if (id == null || id.isEmpty()) return;
        for (int i = 0; i < keeperList.size(); i++) {
            if (keeperList.get(i).getKeeperId().equals(id)) {
                keeperList.remove(i);
                break;
            }
        }
    }

    public void searchKeeper(String id) {
        if (id == null || id.isEmpty() || keeperList.isEmpty()){
            System.out.println("Please input the ID or make sure there's a zooKeeper added");
        }
        for (int i = 0; i < keeperList.size(); i++) {
            if (keeperList.get(i).getKeeperId().equals(id)) {
                keeperList.get(i);
            }
        }
    }

    // Event Management
    public void addEvent(Event event) {
        if (event != null) {
            eventList.add(event);
        }
    }

    public boolean checkUsedAnimalEvent(String EventPerformanceByAnimalIdChecker, int EventStart){
        for (int i = 0; i < eventList.size(); i++) {
            if (!(eventList.isEmpty()) && eventList.get(i).startTime == EventStart && eventList.get(i).eventPerformanceByAnimalId.equalsIgnoreCase(EventPerformanceByAnimalIdChecker)) {
                return true;
            } 
        }
        return false;
    }

    // Display Data
    public void displayAllEvents() {
        if (eventList.isEmpty()) {
            System.out.println("No events available.");
        } else {
            for (int i = 0; i < eventList.size(); i++) {
                eventList.get(i).displayEventInfo();
            }
        }
    }

    public void displayAllAnimals() {
        if (animalList.isEmpty()) {
            System.out.println("No animals in the zoo.");
        } else {
            System.out.println("-----------------------------------------\n");
            System.out.println("======== ANIMAL LIST ========\n");
            for (int i = 0; i < animalList.size(); i++) {
                animalList.get(i).displayAnimalInfo();
            }
        }
    }

    public void displayAllKeepers() {
        if (keeperList.isEmpty()) {
            System.out.println("No zookeepers available.");
        } else {
            sortZooKeepersByName();
            for (int i = 0; i < keeperList.size(); i++) {
                keeperList.get(i).displayKeeperInfo();
            }
        }
    }
}
