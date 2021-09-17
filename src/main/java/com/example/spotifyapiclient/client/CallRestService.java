package com.example.spotifyapiclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;


@Component
public class CallRestService implements CommandLineRunner {

        @Value("${api.key}")
        private String apikey;


    private  void CallRestService () {

        System.out.println(this.apikey);
        RestTemplate restTemplate = new RestTemplate();

        HashMap<String, Object> artist = restTemplate.getForObject ("https://api.spotify.com/v1/artists/06HL4z0CvFAxyc27GXpf02" + apikey,HashMap.class);

        System.out.println("Artist is  " + artist.get("validity_checks"));



    }

    @Override
    public void run(String... args) throws Exception {
        CallRestService();
    }
}
