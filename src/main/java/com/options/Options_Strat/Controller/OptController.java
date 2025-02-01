package com.options.Options_Strat.Controller;


import com.options.Options_Strat.Service.OptionsPnl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class OptController {
    @Autowired
    OptionsPnl usethis;
    @PostMapping("/strategy-builder")
    public double calc(@RequestBody Map<String, Object> frombrowser){

        double result=usethis.calc(frombrowser);
        return result;
    }
}
