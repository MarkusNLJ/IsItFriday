package com.example.demo.DayController;

import com.example.demo.Services.DayCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    DayCalculator day = new DayCalculator();
    @ResponseBody
    @GetMapping("IsItFriday")
    public String fridayOrNot(){
       return day.fridayOrNot();
    }
}
