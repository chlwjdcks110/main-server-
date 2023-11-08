package com.example.Hann.controller;

import com.example.Hann.entity.RoleType;
import com.example.Hann.entity.User;
import com.example.Hann.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hann/login/{useremail}")
    public String login(@PathVariable String useremail){
        User user = userRepository.findByUseremail(useremail);
        System.out.println(user.getUserpwd());
        return user.getUserpwd();
    }
    @GetMapping("/hann/check/{useremail}")
    public String check(@PathVariable String useremail){
        User user = userRepository.findByUseremail(useremail);
        System.out.println(user.getUseremail());
        return user.getUseremail();
    }
    @PostMapping("/hann/join")
    public String join(@RequestBody User user){
        System.out.println("id:"+user.getUserid());
        System.out.println("username:"+user.getUsername());
        System.out.println("password:"+user.getUserpwd());
        System.out.println("email:"+user.getUseremail());
        System.out.println("role:"+user.getRole());
        System.out.println("createData:"+user.getCreateData());

        user.setRole(RoleType.USER);
        userRepository.save(user);
        return "회원가입이 완료되었습니다.";
    }



}
