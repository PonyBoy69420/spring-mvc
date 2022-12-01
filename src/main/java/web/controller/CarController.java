package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {


    private final CarDAO carDAO;

    public CarController(CarDAO carDAO){
        this.carDAO = carDAO;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count",defaultValue = "5") int count,
            ModelMap model){
        if(count>5)
            count = 5;
        List<Car> cars = new ArrayList<>();
        if(count>0)
        for(int i = 0;i<=count-1;i++){
            cars.add((Car) carDAO.showCars().get(i));
            model.addAttribute("allCars",cars);
        }
        return "cars";
    }
}
