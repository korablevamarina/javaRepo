package com.lesson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://dataservice.accuweather.com/locations/v1/search?" +
                        "q=saint-petersburg&apikey=NeEXVm3xyuImscyAhYSzzTYTkwGGkPGH"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        request = HttpRequest.newBuilder()
                .uri(URI.create("http://dataservice.accuweather.com/forecasts/v1/daily/5day/332287?" +
                        "apikey=NeEXVm3xyuImscyAhYSzzTYTkwGGkPGH"))
                .build();
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
