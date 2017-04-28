package com.springBootApp.VoJson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by luis on 4/28/2017.
 */
// http://localhost:8081/kfc/brands/k
@RestController
@RequestMapping("/kfc/brands")
public class JSONShopController {


    @RequestMapping(value = "{name}",method = RequestMethod.GET)
    public @ResponseBody Shop getShopInJson(@PathVariable String name){

        Shop shop = new Shop();
        shop.setName(name);
       // shop.setLocations(new String[]{"norte","sur"});

        return shop;
    }



}
