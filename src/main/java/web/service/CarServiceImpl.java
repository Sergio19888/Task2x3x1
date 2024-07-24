package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Mercedes", 1234, "Red"));
            carList.add(new Car("Gely", 1235, "White"));
            carList.add(new Car("Kamaz", 1236, "Black"));
            carList.add(new Car("Alfa Romeo", 1237, "Blue"));
            carList.add(new Car("Fiat", 1238, "Grey"));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }



}
