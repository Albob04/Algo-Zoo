public class Amphibian extends Animal {
    protected String skinMoisture;

    public Amphibian(String idAnimal, String namaAnimal, String speciesAnimal, String genderAnimal, int umurAnimal, double weightAnimal, double heightAnimal, String habitatAnimal, boolean isFedAnimal) {
        super(idAnimal, namaAnimal, speciesAnimal, genderAnimal, umurAnimal, weightAnimal, heightAnimal, habitatAnimal, isFedAnimal);
    }

    @Override
    public void displayEatSchedule(){
        //kosong
    }

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
        System.out.println("Skin Moisture    : " + skinMoisture);
        System.out.println("=============================");

        displayEatSchedule();
    }
}
