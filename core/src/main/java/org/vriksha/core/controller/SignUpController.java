package org.vriksha.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.vriksha.core.service.SignUpService;
import org.vriksha.core.vo.GenericVO;

@Controller
@RequestMapping("/user")
public class SignUpController {

    @Autowired
    SignUpService signUpService;
    @PostMapping("/signUp")
    public ResponseEntity signUp(@RequestBody GenericVO request) {
        GenericVO genericVO = signUpService.signUp(request);
        return new ResponseEntity(genericVO, HttpStatus.OK);
    }
}
