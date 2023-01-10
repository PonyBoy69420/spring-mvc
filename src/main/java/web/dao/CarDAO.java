package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO  {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add( new Car("Tesla","red",12));
        carList.add( new Car("UAZ","green",13));
        carList.add( new Car("ZHIGUL","black",14));
        carList.add( new Car("KAMAZ","grey",15));
        carList.add( new Car("TOYOTA","white",16));
    }

    public List<Car> showCars(){
        return carList;
    }

    public List<Car> getCars(int count){
        if(count>5)
            count = 5;
        List<Car> cars = new ArrayList<>();
        if(count>0)
            for(int i = 0;i<=count-1;i++){
                cars.add((Car) showCars().get(i));
            }
        return cars;
    }

}
