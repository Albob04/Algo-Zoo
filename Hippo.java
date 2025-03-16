public class Hippo extends Mammals {

    public Hippo(String idAnimal, String namaAnimal, String speciesAnimal, String namaLatin, String genderAnimal, int umurAnimal, double weightAnimal, double heightAnimal, String habitatAnimal, boolean isFedAnimal) {
        super(idAnimal, namaAnimal, speciesAnimal, genderAnimal, umurAnimal, weightAnimal, heightAnimal, habitatAnimal, isFedAnimal);
        this.namaLatin = namaLatin;
        this.bodyTemp = "Hot Blood";
        this.reproduction = "Live Birth";
        this.skinType = "Thick Skin";
        
    }

    @Override
    public void displayEatSchedule(){
        System.out.println("===========================================================");
        System.out.println("          Hippo " + namaAnimal + " Eating Schedule");
        System.out.println("===========================================================");
        System.out.println("     Time   |     Type of Food        |   Portion Of Food");
        System.out.println("-----------------------------------------------------------");
        if (umurAnimal < 2) {
            System.out.println("   8:00 AM  |   Grass, Milk           |  (5 kg)(500 ml)");
            System.out.println("-----------------------------------------------------------");
            System.out.println("   5:00 PM  |        Grass            |       (5 kg)   ");
        } else {
            System.out.println("   8:00 AM  | Grass & Vegetation      |      (30 kg)   ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("   5:00 PM  | Grass & Vegetation      |      (30 kg)   ");
        }
        System.out.println("-----------------------------------------------------------");
    }
}
