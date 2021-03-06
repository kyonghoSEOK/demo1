package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class SampleController {

    @Setter(onMethod_ = @Autowired)
    private KakaoPay kakaoPay;

    @GetMapping("/")
    public String hmoe(){
        log.info("WQEQE WWWt~~~~~~~~~~~~~~~");

        return "/kakaoPayss";
    }

    @GetMapping("/kakaoPay")
    public String kakaoPayGet(){
        log.info("WQEQE WWWt~~~~~~~~~~~~~~~");

        return "/kakaoPay";
    }

    @PostMapping("/kakaoPay")
    public String kakaoPay(){
        log.info("kakaopa post~~~~~~~~~~~~~~~");

        return "redirect : " + kakaoPay.kakaoPayReady();
    }

    @GetMapping("/kakaoPaySuccess")
    public void kakaoPaySuccess(@RequestParam("pg_token") String pg_token, Model model){
        log.info("kakaoPaySuccess get~~~~~~~~");
        log.info("kakaoPaySuccess pg_token : " + pg_token);
    }
}
