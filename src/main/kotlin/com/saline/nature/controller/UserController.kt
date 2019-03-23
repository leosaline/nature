package com.saline.nature.controller

import com.saline.nature.entity.User
import com.saline.nature.repository.UserRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import javax.jws.soap.SOAPBinding

@RestController
@RequestMapping("/user")
class UserController(private val userRepository: UserRepository){

    @GetMapping("/")
    fun findAll() = userRepository.findAll()

    @GetMapping("/{id}")
    fun user(@PathVariable id: Long) = userRepository.findById(id);

    @PostMapping("/")
    fun saveUser(@RequestBody user: User){
        userRepository.save(user);
    }
}