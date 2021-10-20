public class main2 {
    public static void main(String[] args) {
        car Tesla = new car();
        Tesla.setBrand("Tesla");
        Tesla.setColor("Red");
        Tesla.setCupHolders(true);
        Tesla.setModel("Model 3");

        car AstonMartin = new car();
        AstonMartin.setBrand("Aston Martin");
        AstonMartin.setModel("Vanquish");
        AstonMartin.setColor("White");
        AstonMartin.setCupHolders(false);

        car notACar = new car();

        garage myGarage = new garage();
        System.out.println(myGarage.getCars());
        myGarage.addCars(AstonMartin);
        System.out.println(myGarage.getCars());
        myGarage.addCars(Tesla);
        System.out.println(myGarage.getCars());
    }
}
