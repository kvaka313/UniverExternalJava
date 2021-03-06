package hw2.factories;

import hw2.vehicles.CAmphibianCar;

import java.util.Random;

public class CAmphibianCarConcreteFactory extends AbstractConcreteFactory {

    public static CAmphibianCar create(){
        Random r = new Random();

        return new CAmphibianCar(r.nextInt(100000) + 1000000,
                r.nextInt(60) + 1958,
                new int[][]{{r.nextInt(100000000), r.nextInt(100000000)}},
                r.nextInt(300));
    }
}
