public class Lion extends Mammals implements Carnivore {

    public Lion(String idAnimal, String namaAnimal, String speciesAnimal, String namaLatin, String genderAnimal, int umurAnimal, double weightAnimal, double heightAnimal, String habitatAnimal, boolean isFedAnimal) {
        super(idAnimal, namaAnimal, speciesAnimal, genderAnimal, umurAnimal, weightAnimal, heightAnimal, habitatAnimal, isFedAnimal);
        this.namaLatin = namaLatin;
        this.bodyTemp = "Hot Blood";
        this.reproduction = "Live Birth";
        this.skinType = "Fur";
    }

    @Override
    public void displayAnimalInfo(){
        super.displayAnimalInfo();
    }

    @Override
    public void displayEatSchedule(){
        System.out.println("===========================================================");
        System.out.println("           Lion " + namaAnimal + " Eating Schedule");
        System.out.println("              Status: "+ (isFedAnimal ? "not yet been fed" : "has beed fed"));
        System.out.println("===========================================================");
        System.out.println("     Time   |     Type of Food        |   Portion Of Food");
        System.out.println("-----------------------------------------------------------");
        if (umurAnimal < 2) {
            System.out.println("   7:00 AM  |       Meat, Milk        |  (2 kg)(200 ml)");
            System.out.println("-----------------------------------------------------------");
            System.out.println("   6:00 PM  |          Meat           |       (2 kg)   ");
        } else {
            System.out.println("   7:00 AM  |          Meat           |       (5 kg)   ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("   6:00 PM  |          Meat           |       (5 kg)   ");
        }
        System.out.println("-----------------------------------------------------------");

        //ini jga tolong rapihin yak wkwkwk
    }

    @Override
    public void feedMeat() {
        if(!isFedAnimal){
            System.out.println("Feeding Snake " + namaAnimal + " with " + (umurAnimal < 1 ? "a small mouse." : "a large rat."));
            this.isFedAnimal = true;
            //klo mau tampilin gambar makanannya, ini bsa di implemen di animalsnack jga buat visitor
            //nanti jga bisa liat kalo misal visitor beli daging brarti yg bisa dikasih makan itu cuma buat instance yg pake carnivore, nanti pake "if (instance of Carnivore)"
        } else {
            System.out.println("You already fed this Animal.");
        }
    }
}
