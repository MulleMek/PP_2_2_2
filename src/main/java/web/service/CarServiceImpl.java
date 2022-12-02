package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarList() {
        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car("Car #1", 111, 100));
        carsList.add(new Car("Car #2", 222, 110));
        carsList.add(new Car("Car #3", 333, 130));
        carsList.add(new Car("Car #4", 444, 140));
        carsList.add(new Car("Car #5", 555, 150));

        return carsList;
    }

    public List<Car> getCarAmount(Integer count) {
        return getCarList().stream().limit(count).collect(Collectors.toList());
    }
}