package com.options.Options_Strat.Service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;


@Service
public class OptionsPnl {


    public double calc(@RequestBody Map<String, Object> request){
        double strikePrice=(double)request.get("strikePrice");
        System.out.println(strikePrice);
        return strikePrice;
    }
}
