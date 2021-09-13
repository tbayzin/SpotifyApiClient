package com.example.spotifyapiclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public class CallRestService implements CommandLineRunner {

    private static void CallRestService () {

        RestTemplate restTemplate = new RestTemplate();

        HashMap<String, Object> planet = restTemplate.getForObject ("https://api.spotify.com/v1/artists/06HL4z0CvFAxyc27GXpf02",HashMap.class);





    }

    @Override
    public void run(String... args) throws Exception {

    }
}
