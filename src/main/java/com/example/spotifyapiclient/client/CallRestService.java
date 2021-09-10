package com.example.spotifyapiclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

public class CallRestService implements CommandLineRunner {

    private static void CallRestService () {

        RestTemplate restTemplate = new RestTemplate();

        @RequestMapping("/")







    }

    @Override
    public void run(String... args) throws Exception {

    }
}
