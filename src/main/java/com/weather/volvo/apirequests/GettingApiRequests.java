package com.weather.volvo.apirequests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.volvo.parser.Parser;
import com.weather.volvo.weatherdto.WeatherInfoDTO;
import com.weather.volvo.weatherinfo.WeatherInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class GettingApiRequests {



    //private key for appi
    public static String privateKey = "3579fd24b2dd4d7e82805228223112";

    //api link for testing
    //static String fullApiLink = "https://api.weatherapi.com/v1/forecast.json?key=3579fd24b2dd4d7e82805228223112&q=Warsaw&days=3&aqi=no&alerts=yes";
    private static HttpURLConnection connection;
    static String[] cities = new String[]{"Warsaw", "Cracow", "Wroclaw", "Lodz", "Poznan"};


    //main for testing usages
    public static void main(String[] args) {

        for (String city : cities) {
            //WeatherInfo essa = convertToJavaFromJson(getApiResponse(city, privateKey));
            WeatherInfo essa = getApiResponse(city, privateKey);

            WeatherInfoDTO essa2 = Parser.parsingWeatherToWeatherDTO(essa);
            System.out.println("CURRENT");

            System.out.println(essa2.getCurrent().getTempC());
            System.out.println(essa2.getCurrent().getWindKph());
            System.out.println(essa2.getCurrent().getPressureMb());
            System.out.println(essa2.getCurrent().getPrecipMm());
            System.out.println(essa2.getCurrent().getHumidity());
            System.out.println(essa2.getCurrent().getCloud());
            System.out.println(essa2.getCurrent().getFeelslikeC());
            System.out.println(essa2.getCurrent().getUv());

            System.out.println("FORECAST");
            System.out.println(essa.getForecast());
            System.out.println("LOKALIZACJA");
            System.out.println(essa.getLocation());
            System.out.println(essa2);


        }
        //getApiResponse("Warsaw", privateKey);
        /*try {
            convertToJavaFromJson(getApiResponse("Warsaw", privateKey));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }*/


    }

    /*public static String getApiResponse(String city, String privateKey) {

        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder();

        try {
            //creating a new url
            URL url = new URL(creatingUrlString(city, privateKey));
            //opening connection with our url
            connection = (HttpURLConnection) url.openConnection();

            //setting for connections
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            //getting status of our connection
            int status = connection.getResponseCode();
            //System.out.println(status);

            //if the code we get in return is not successful, we want to get an error stream
            if (status > 299) {
                //reading process
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            } else { //if the response is successful we want to get a JSON
                //reading process
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();

            //printing response
            System.out.println(responseContent);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return responseContent.toString();
    }*/

    public static WeatherInfo getApiResponse(String city, String privateKey) {

        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder();

        try {
            //creating a new url
            URL url = new URL(creatingUrlString(city, privateKey));
            //opening connection with our url
            connection = (HttpURLConnection) url.openConnection();

            //setting for connections
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            //getting status of our connection
            int status = connection.getResponseCode();
            //System.out.println(status);

            //if the code we get in return is not successful, we want to get an error stream
            if (status > 299) {
                //reading process
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            } else { //if the response is successful we want to get a JSON
                //reading process
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();

            //printing response
            System.out.println(responseContent);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(responseContent.toString(), WeatherInfo.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getApiResponseExpose(String city, String privateKey) {

        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder();

        try {
            //creating a new url
            URL url = new URL(creatingUrlString(city, privateKey));
            //opening connection with our url
            connection = (HttpURLConnection) url.openConnection();

            //setting for connections
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            //getting status of our connection
            int status = connection.getResponseCode();
            //System.out.println(status);

            //if the code we get in return is not successful, we want to get an error stream
            if (status > 299) {
                //reading process
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            } else { //if the response is successful we want to get a JSON
                //reading process
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();

            //printing response for console for tests
            System.out.println(responseContent);

            return responseContent.toString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String creatingUrlString(String city, String privateKey) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://api.weatherapi.com/v1/forecast.json?key=" + privateKey + "&q=" + city + "&days=3&aqi=no&alerts=yes");
        return sb.toString();
    }

    public static WeatherInfo convertToJavaFromJson(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("Przez returnem json to java");
        System.out.println(json);

        return objectMapper.readValue(json, WeatherInfo.class);
    }

    public static String getPrivateKey() {
        return privateKey;
    }


}
