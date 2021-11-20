/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.extra.outside.learn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dedi Wardani
 */
@RestController
@RequestMapping("/view/welcome")
public class welcomeController {
    @GetMapping
    public String welcome(){
        return "Hello World, WHO AM I? I DONT KNOW";
    }
}
