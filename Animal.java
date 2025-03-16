public abstract class Animal {
    protected String namaAnimal;
    protected String namaLatin;
    protected String speciesAnimal;
    protected String idAnimal;
    protected String genderAnimal;
    protected int umurAnimal;
    protected double weightAnimal;
    protected double heightAnimal;
    protected String habitatAnimal;
    protected boolean isFedAnimal;

    protected Animal(String idAnimal, String namaAnimal, String speciesAnimal, String genderAnimal, int umurAnimal, double weightAnimal, double heightAnimal, String habitatAnimal, boolean isFedAnimal) {
        this.idAnimal = idAnimal;
        this.namaAnimal = namaAnimal;
        this.speciesAnimal = speciesAnimal;
        this.genderAnimal = genderAnimal;
        this.umurAnimal = umurAnimal;
        this.weightAnimal = weightAnimal;
        this.heightAnimal = heightAnimal;
        this.habitatAnimal = habitatAnimal;
        this.isFedAnimal = isFedAnimal;
        }

    public abstract void displayEatSchedule();

    public abstract void displayAnimalInfo();
}
