package com.springBootApp.VoJson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luis on 4/28/2017.
 */

@Controller
@RequestMapping("/kfc/brands")
public class JSONShopController {


    @RequestMapping(value = "{name}",method = RequestMethod.GET)
    public @ResponseBody Shop getShopInJson(@PathVariable String name){

        Shop shop = new Shop();
        shop.setName(name);
        shop.setLocations(new String[]{"norte","sur"});

        return shop;
    }



}
