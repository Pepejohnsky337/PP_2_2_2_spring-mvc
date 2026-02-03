package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;


    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Camry"));
        cars.add(new Car(2, "Honda", "Civic"));
        cars.add(new Car(3, "Brichka", "Moskovskaya"));
        cars.add(new Car(4, "Chertolet", "Slavic"));
        cars.add(new Car(5, "Lada", "Immortal"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        if(count <= 0) {
            return Collections.emptyList();
        } else {
            return cars.subList(0, Math.min(count, cars.size()));
        }
    }
}
