public abstract class Bird extends Animal{
    protected boolean canFly;

    protected Bird(String idAnimal, String namaAnimal, String speciesAnimal, String genderAnimal, int umurAnimal, double weightAnimal, double heightAnimal, String habitatAnimal, boolean isFedAnimal) {
        super(idAnimal, namaAnimal, speciesAnimal, genderAnimal, umurAnimal, weightAnimal, heightAnimal, habitatAnimal, isFedAnimal);
    }

    @Override
    public abstract void displayEatSchedule();
    
    @Override
    public void displayAnimalInfo() {
        System.out.println("=============================");
        System.out.println("Animal Name      : " + namaAnimal);
        System.out.println("-----------------------------");
        System.out.println("Latin Name      : " + namaLatin);
        System.out.println("-----------------------------");
        System.out.println("Species          : " + speciesAnimal);
        System.out.println("-----------------------------");
        System.out.println("Age              : " + umurAnimal + " years");
        System.out.println("-----------------------------");
        System.out.println("Animal ID        : " + idAnimal);
        System.out.println("-----------------------------");
        System.out.println("Weight           : " + weightAnimal + " kg");
        System.out.println("-----------------------------");
        System.out.println("Height           : " + heightAnimal + " cm");
        System.out.println("-----------------------------");
        System.out.println("Fly              : " + (canFly ? "Yes" : "No"));
        System.out.println("=============================");

        displayEatSchedule();
    }
}
