public class garage {
    private car[] cars = {new car(), new car(), new car(), new car(), new car()};

    public car[] getCars() {
        return cars;
    }

    public void setCars(car[] cars) {
        this.cars = cars;
    }

    public garage() {
    }

    public void addCars(car carToAdd) {
        int counter = 0;
        for (car car : this.cars)

            if (car.getBrand()==null){
                this.cars[counter] = carToAdd;
                counter++;
                break;

                }else {
                continue;
            }
            ;
    }
}


