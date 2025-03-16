public class ZooKeeper {
    private String keeperName;
    private int experienceYears;
    private String assignedSection;
    private int keeperAge;
    private String keeperId;

    public ZooKeeper(String keeperName, int experienceYears, String assignedSection, int keeperAge, String keeperId) {
        this.keeperName = keeperName;
        this.experienceYears = Math.max(experienceYears, 0); // Tidak boleh negatif
        this.assignedSection = assignedSection;
        this.keeperAge = Math.max(keeperAge, 18); // Minimal usia 18 tahun
        this.keeperId = keeperId;
    }

    public String getKeeperName() {
        return keeperName;
    }

    public String getAssignedSection() {
        return assignedSection;
    }

    public String getKeeperId() {
        return keeperId;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public int getKeeperAge() {
        return keeperAge;
    }

    public void displayKeeperInfo() {
        System.out.println("ZooKeeper Info:");
        System.out.println("Name: " + keeperName);
        System.out.println("Experience: " + experienceYears + " years");
        System.out.println("Assigned Section: " + assignedSection);
        System.out.println("Age: " + keeperAge);
        System.out.println("ID: " + keeperId + "\n");
    }
}
