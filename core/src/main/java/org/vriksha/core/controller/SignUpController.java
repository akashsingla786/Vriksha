package org.vriksha.core.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

@Controller
public class SignUpController {

    @PostMapping("/signUp")
    public ResponseEntity signUp(@RequestBody HashMap<String,Object> request){
        return new ResponseEntity(new String("success"), HttpStatus.OK);
    }
}
