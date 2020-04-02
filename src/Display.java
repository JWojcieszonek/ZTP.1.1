import java.util.ArrayList;

public class Display {

    public static void showVehicle(ArrayList<Vehicle> list)
    {
        for(Vehicle v: list) {
            System.out.println("Show vehicle"  );
            System.out.println(v.numberOfWheels);

        }
    }

    public static void showCar(ArrayList<Car> list)
    {
        for(Car c: list) {
            System.out.println("Show car"  );
            System.out.println(c.numberOfWheels);
            System.out.println(c.numberOfDoors);

        }
    }

    public static void showModel(ArrayList<Model> list)
    {

        for(Model m: list) {
            System.out.println("Show model"  );
            System.out.println(m.numberOfWheels);
            System.out.println(m.numberOfDoors);
            System.out.println(m.modelName);

        }
    }
    public static void main(String[]args)
    {

        ArrayList<Vehicle> vehicles = new ArrayList();
        ArrayList<Car> cars=new ArrayList();
        ArrayList<Model> models=new ArrayList();

        Vehicle v1 = new Vehicle();
        v1.numberOfWheels=2;

        Car c1 = new Car();
        c1.numberOfWheels=4;
        c1.numberOfDoors=2;

        Model m1 = new Model();
        m1.numberOfWheels=4;
        m1.numberOfDoors=4;
        m1.modelName="Mondeo";

        vehicles.add(v1);
        vehicles.add(c1);
        vehicles.add(m1);

        cars.add(c1);
        cars.add(m1);

        models.add(m1);

        showVehicle(vehicles);
        //showVehicle(cars);
        //showVehicle(models);

        showCar(cars);
        //showCar(vehicles);
        //showCar(models);

        showModel(models);
        //showModel(vehicles);
        //showModel(cars);

    }
}
