package au.com.edimoto.controller;

import au.com.edimoto.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by torree on 12/12/2016.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

//    @Autowired
//    UserEntity userEntity;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public UserEntity sayHello1(){
//        userEntity = new UserEntity("Emerson","Morales");
//        return userEntity;
        return new UserEntity("Emerson","Morales");
    }

    @RequestMapping(value = "/sayHello/{name}", method = RequestMethod.GET)
    public String sayHello2(@PathVariable String name){
        return String.format("Hola como estas %s ?",name);
    }

    @RequestMapping(value = "/sayHello/{name}", method = RequestMethod.POST)
    public String sayHello23(@PathVariable String name){
        return String.format("Hola como estas %s ?",name);
    }
}
