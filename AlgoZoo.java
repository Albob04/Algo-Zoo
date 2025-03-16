import java.util.Scanner;

public class AlgoZoo {
    static Scanner scanner = new Scanner(System.in);
    static ZooManagement zooManagement = new ZooManagement();
    static String line = "-----------------------------------------";
    public static void main(String[] args) {

        // Sample Data
        zooManagement.LoadSampleData();

        boolean running = true;
        do{
            // Menampilkan ASCII Art dan menu roleplay
            displayWelcomeMessage();

            System.out.println("WHO DO YOU WANT TO BE?");
            System.out.println("1. Manager");
            System.out.println("2. Visitor");
            System.out.println("3. Exit the Program");
            System.out.print("Roleplay choice: ");
            int role = scanner.nextInt();
            scanner.nextLine();

            switch(role){
                case 1:
                boolean ManagerMode = true;

                while(ManagerMode){
                    System.out.println("\n===== Manager Mode =====");
                    System.out.println("Which to Manage?");
                    System.out.println("1. Manage Animal");
                    System.out.println("2. Manage Zookeeper");
                    System.out.println("3. Manage Event");
                    System.out.println("4. Return to Main Menu");

                    System.out.print("Choose an option: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {

                        case 1: 
                            boolean AnimalMenu = true;

                            System.out.println("\n     M A N A G E  A N I M A L ");
                            System.out.println("You are currently managing animals");
                            System.out.println();
                    
                            while (AnimalMenu) {
                                System.out.println("Options:");
                                System.out.println("1. View Animal List");
                                System.out.println("2. Add a New Animal");
                                System.out.println("3. Update Animal");
                                System.out.println("4. Delete Animal");
                                System.out.println("5. Return to manager menu");
                                System.out.print("Please select an option: ");
                
                                int AnimalChoice = scanner.nextInt();
                                scanner.nextLine();
                            
                                switch (AnimalChoice){
                                    case 1:
                                        zooManagement.displayAllAnimals();
                                        break;

                                    case 2:
                                        addAnimal();
                                        break;

                                    case 3: 
                                        updateAnimal();
                                        break;

                                    case 4:
                                        System.out.print("\nEnter Animal ID to remove: ");
                                        String id = scanner.nextLine();
                                        zooManagement.removeAnimal(id);
                                        break;

                                    case 5:
                                        AnimalMenu = false;
                                        System.out.println("Return to Manager menu");
                                        break;

                                    default:
                                        System.out.println("Enter valid option");
                                        break;
                                }
                            }
                            break;

                        case 2:
                            boolean zooKeeperMenu = true;

                            System.out.println("  M A N A G E  Z O O K E E P E R ");
                            System.out.println("You are currently managing ZooKeper\n");
                        
                            while (zooKeeperMenu) {
                                System.out.println("Options:");
                                System.out.println("1. Add a New ZooKeeper");
                                System.out.println("2. View All ZooKeepers (Sorted by Name)");
                                System.out.println("3. Search ZooKeeper");
                                System.out.println("4. Return to manager menu");
                                System.out.print("Please select an option: ");

                                int ZookeperChoice = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println();
                    
                                switch (ZookeperChoice){
                                    case 1:
                                        addZooKeeper();
                                        break;
                                    case 2:
                                        zooManagement.displayAllKeepers();
                                        break;
                                    case 3:
                                        System.out.print("\nEnter Zookeeper ID to Search: ");
                                        String id = scanner.nextLine(); 
                                        zooManagement.searchKeeper(id);
                                        break;
                                    case 4:
                                        zooKeeperMenu = false;
                                        System.out.println("Return to manager menu");
                                    default:
                                        System.out.println("Invalid Option");
                                        break;
                                }
                            }
                            break;
                        
                        case 3:
                            boolean EventMenu = true;

                            System.out.println("    M A N A G E  E V E N T ");
                            System.out.println("You are currently managing events");
                    
                            while(EventMenu){
                                System.out.println("Options:");
                                System.out.println("1. View Event List");
                                System.out.println("2. Add a New Event");
                                System.out.println("3. Update Event");
                                System.out.println("4. Delete Event");
                                System.out.println("5. Return to manager menu");
                                System.out.print("Please select an option: ");
            
                                int EventChoice = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println();
            
                                switch (EventChoice){
                                    case 1:
                                        zooManagement.displayAllEvents();
                                        break;
                                    case 2:
                                        addEvent();
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        EventMenu = false;
                                        break;
                                    default:
                                        System.out.println("Invalid choice!");
                                        break;
                                }
                        }
                        break;

                    case 4:
                        ManagerMode = false;
                        System.out.println("Thank you, Manager! Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please enter a number between 1-6.");
                        break;
                        }
                    }
                    break;
                
                case 2:
                    boolean visitorMenu = true; 

                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("                       Welcome Zoo Visitor                       ");
                    System.out.println("                             ALGO ZOO                            ");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println();
        
                    while (visitorMenu) {
                        System.out.println("What do you want to do?");
                        System.out.println("1. Seeing Animal");
                        System.out.println("2. Watch Event");
                        System.out.println("3. Return to Main Menu");
                        System.out.print("Input: ");
        
                        int visitorChoice = scanner.nextInt();
                        scanner.nextLine();
        
                        switch (visitorChoice) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                System.out.println("\nReturning to Main Menu...");
                                visitorMenu = false;
                                break;
                            default:
                                System.out.println("Invalid choice!");
                                break;
                        }
                    }
                    break;
                
                case 3:
                    running = false;
                    System.out.println("Algo Zoo is closed!\n");
                    System.out.println("Exiting the program...\n");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            } 
        } while(running);
        System.exit(0);
    }

    private static void displayWelcomeMessage() {
        System.out.println("""
                              -:::::::----------------:::::::-  
                            +......  ____  _____ ____   ......+  
                       :-==+*++.....(__  )[    ][    ]......*+++==-.
                    +******#*------  / _/ [ [] ][ [] ] ------##******=
                    +*#**%%#%#=-=   (____)[____][____]   =--%%%%%*##*-
                    #****#***#=.=                        =.:%***#*****  
                     ********##=.=          .  ..         =.:%#*******+  
                     +#**#%%###=.=      :+**#  #**+-      =.:%##%%#**#=  
                     *%#####*##=.=-----=+*++#  *+++*=-----+.:%#*#####%=  
                 .=**####****#%=.++**+++***+#: %++*#++++**#.:%#****####*+=.  
                +*##*****###%#*=.+=++===+++=#-.%==+*====++#.:##%##******#**=  
               =**#**%%%%**##**=.+=++===+++=#-.%==+*=-==++*.:#*#**#%%%%**#**-  
              .#********@#***##=.=+**+==+**+#-.%+++*+==+++*.:%****%%********#  
            :-###******#######%%#%+**+==+**+#-.%+++#+==++*%#%%######********#*-:  
         :-*+++*++*%##%#*******##%=++===+++=#: %==+*==-=++%##*******#%##%*++*+++*-:  
        -*+++++++#*+++++*#*******#*++===+++=#  *==+*=-==+***********+++++*#+++++++*=  
       =+++++++**+++++++++#********##***###*%  #**#%****@********#+++++++++#+++++++++  
        :-------------------------:                      :-------------------------:  
=========================================================================================  
                                 Welcome To The Amazing  
                                    A L G O   Z O O  
=========================================================================================
        """);
    }

    private static void addAnimal() {
        System.out.println("\nAdd Animal: ");

        System.out.println(line);
        System.out.println("Choose Animal Type: ");
        System.out.println("1. Lion");
        System.out.println("2. Hippo");;
        System.out.print("Your option: ");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.println(line);
        System.out.print("Enter Animal ID: ");
        String AnimalId = scanner.nextLine();

        System.out.println(line);
        System.out.print("Enter Animal Name: ");
        String AnimalName = scanner.nextLine();

        System.out.println(line);
        System.out.print("Enter Animal Species: ");
        String species = scanner.nextLine();

        System.out.println(line);
        System.out.print("Enter Animal latin name: ");
        String latinName = scanner.nextLine();

        System.out.println(line);
        System.out.print("Enter Animal Gender: ");
        String gender = scanner.nextLine();

        System.out.println(line);
        System.out.print("Enter Animal Age: ");
        int AnimalAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println(line);
        System.out.print("Enter Animal Weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.println(line);
        System.out.print("Enter Animal Height (cm): ");
        double height = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(line);
        System.out.println("Enter Animal Habitat: ");
        String habitat = scanner.nextLine();
        System.out.println(line);

        switch (type) {
            case 1:
                zooManagement.addAnimal(new Lion(AnimalId, AnimalName, species, latinName, gender, AnimalAge, weight, height, habitat, false));
                System.out.println("Lion added successfully.\n");
                break;
            case 2:
                zooManagement.addAnimal(new Hippo(AnimalId, AnimalName, species, latinName, gender, AnimalAge, weight, height, habitat, false));
                System.out.println("Hippo added successfully.");
                break;
            default:
                System.out.println("Invalid animal type! Animal was not added.");
                break;
        }
    }
    
    private static void addZooKeeper(){
        System.out.println("Add Zookeeper");

        System.out.println(line);
        System.out.print("Enter ZooKeeper's Name: ");
        String name = scanner.nextLine();

        System.out.println(line);
        System.out.print("Enter Years of Experience: ");
        int experienceYears = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println(line);
        System.out.print("Enter Assigned Section (e.g., Mammals, Reptiles, Birds): ");
        String section = scanner.nextLine();

        System.out.println(line);
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println(line);
        System.out.print("Enter Zoo Keeper ID: ");
        String id = scanner.nextLine();
        System.out.println(line);

        zooManagement.addKeeper(new ZooKeeper(name, experienceYears, section, age, id));
        System.out.println("\nZooKeeper " + name + " has been successfully added to the system!\n");
        }

    private static void updateAnimal(){
        System.out.println("\n=========================================");
        System.out.println("               Edit Animal                 ");
        System.out.println("-----------------------------------------");
        System.out.print("Enter Animal ID to Edit: ");
        String editid = scanner.nextLine();
        
        System.out.println("\nWhich data to edit: ");
        System.out.println("1. Edit Animal Age:  ");
        System.out.println("2. Edit Animal Weight ");
        System.out.println("3. Edit Animal Height ");
        System.out.print("Data: ");
        int editdata = scanner.nextInt();
        scanner.nextLine();

            switch (editdata){
                case 1://edit animal age
                System.out.print("\nEnter new age: ");
                int newAge = scanner.nextInt();
                ZooManagement.editAnimalsAge(editid, newAge);
                break;

                case 2://edit animal weight
                System.out.print("Enter new weight (kg): ");
                double newWeight = scanner.nextDouble();
                ZooManagement.editAnimalsWeight(editid, newWeight);
                System.out.println();
                break;

                case 3://edit animal heihgt
                System.out.print("Enter new height (cm): ");
                double newHeightInCm = scanner.nextDouble();
                ZooManagement.editAnimalsHeightInCm(editid, newHeightInCm);
                break;

                default:
                System.out.println("Invalid options, please try again");
                break;
            }
        System.out.println("-----------------------------------------\n");
        }

    private static void addEvent(){
        System.out.println("Add Event: ");
                        
        System.out.println("=========================================================================");
        System.out.println("Notes! ");
        System.out.println("1. All event start and ends at the hour sharp (i.e. '10:00')");
        System.out.println("2. Therefore only needs to input the hour starts and ends (i.e. '10')");
        System.out.println("=========================================================================\n");
    

        System.out.println("Choose Events to add");
        System.out.println("1. HippoFeeding");
        System.out.println("2. DolphinShow");
        System.out.print("Your option: ");

        int eventOption = scanner.nextInt();
        scanner.nextLine();


        boolean above10 = true;
        boolean abovestart = true;
        int EventStart = 0;
        int EventEnd = 0;

        System.out.print("1. Enter Event Name: ");
        String EventName = scanner.nextLine();
    
        while(above10){
            System.out.println("----------------------------------------------------------------");
            System.out.println("[Event Start Time must be above 10:00 and below 18:00]");
            System.out.print("2. Enter Event Start Time: ");
            int EventStartCheck = scanner.nextInt();
            if (EventStartCheck >= 10 && EventStartCheck <= 18){
                EventStart = EventStartCheck;
                above10 = false;
            }else {
                System.out.println("Invalid Time Frame!");
            }
        }
    
        while(abovestart){
            System.out.println("----------------------------------------------------------------");
            System.out.println("[Event End Time must be above Start Time]");
            System.out.print("3. Enter Event End Time: ");
            int EventEndCheck = scanner.nextInt();
    
            if (EventEndCheck > EventStart && EventEndCheck <= 19){
                EventEnd = EventEndCheck;
                abovestart = false;
            }else {
                System.out.println("Invalid Time Frame!");
            }
        }
    
        System.out.println("----------------------------------------------------------------");
        System.out.print("4. Enter Event Price: ");
        float EventPrice = scanner.nextFloat(); 
    
        boolean animalIDCheck = true;
        String eventPerformanceByAnimalId = null;
    
        while(animalIDCheck){
            System.out.println("----------------------------------------------------------------");
            System.out.print("5. Enter Star Animal ID: ");
            String eventPerformanceByAnimalIdChecker = scanner.nextLine();

            // Check if the animal ID exists
            boolean animalFound = zooManagement.searchAnimal(eventPerformanceByAnimalIdChecker);
    
            if (!animalFound) {
                System.out.println("Invalid ID! Animal ID is not found");
                continue; // Ask for the ID again
            }
    
            // Check if the animal ID is already used in an event at the same start time
            boolean idAlreadyUsed = zooManagement.checkUsedAnimalEvent(eventPerformanceByAnimalIdChecker, EventStart);
       
            if (idAlreadyUsed) {
                System.out.println("*Animal ID " + eventPerformanceByAnimalIdChecker + " is already scheduled for an event at this start time.*");
            } else {
                eventPerformanceByAnimalId = eventPerformanceByAnimalIdChecker;
                animalIDCheck = false; // Exit the loop since we have a valid ID
            }
        }

        System.out.println("----------------------------------------------------------------");

        switch(eventOption){
            case 1:
                zooManagement.addEvent(new HippoFeeding(EventName, EventStart, EventEnd, EventPrice, eventPerformanceByAnimalId));
                break;
            case 2:
                System.out.print("Does it need rain coat? (yes/no): ");
                boolean needRainCoat = scanner.nextLine().equalsIgnoreCase("yes");
                
                zooManagement.addEvent(new DolphinShow(EventName, EventStart, EventEnd, EventPrice, eventPerformanceByAnimalId, needRainCoat));
                break;
        }
        zooManagement.displayAllEvents();
        System.out.println("Don't forget to add the image in the event class and call it when the visitor want to watch the event!\n");
       }
}


        
    