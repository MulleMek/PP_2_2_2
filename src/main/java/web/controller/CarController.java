package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCar(Model model, @RequestParam(value = "count",defaultValue = "5")Integer count){
        model.addAttribute("cars", new CarServiceImpl().getCarAmount(count));
        return "cars";
    }
}