package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarService {
    private final CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    public List<Car> getCars(int count){
        return carDAO.getCars(count);
    }

    public List<Car> showCars(){
        return carDAO.showCars();
    }
}
