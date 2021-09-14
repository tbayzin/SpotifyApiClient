package com.example.spotifyapiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
public class SpotifyApiClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpotifyApiClientApplication.class, args);
    }

}
