package com.saline.nature.controller

import com.saline.nature.entity.User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.jws.soap.SOAPBinding

@RestController
class UserController{

    @GetMapping("/user")
    fun user(): User{
        return User("leo","leonardo","saline","learning", 0)
    }
}