package com.weather.volvo;


import com.weather.volvo.apirequests.GettingApiRequests;
import com.weather.volvo.parser.Parser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@RestController
@EnableSwagger2
public class WeatherController {

    final String[] city = {"warsaw", "cracow", "wroclaw", "lodz", "poznan"};
    final String warsaw = "warsaw";
    final String cracow = "cracow";
    final String wroclaw = "wroclaw";
    final String lodz = "lodz";
    final String poznan = "poznan";

    @GetMapping("weather/test")
    public int test() {
        return 2;
    }
    /*@GetMapping("/weather")
    public String weather() {
        WeatherInfo essa = new WeatherInfo();
        try {
            essa = convertToJavaFromJson(getApiResponse("Warsaw", GettingApiRequests.privateKey));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return "es";
    }*/
    @GetMapping("weather")
    public String weatherForAllCities() {
        StringBuilder sb = new StringBuilder();

        for (String c : city) {
            sb.append(Parser.parseWeatherDTOToString(Parser.parsingWeatherToWeatherDTO(GettingApiRequests.getApiResponse(c, GettingApiRequests.getPrivateKey()))));
        }

        return sb.toString();
    }

    @GetMapping("/weather/city/" + warsaw)
    public String weatherForWarsaw() {

        return Parser.parseWeatherDTOToString(Parser.parsingWeatherToWeatherDTO(GettingApiRequests.getApiResponse(warsaw, GettingApiRequests.getPrivateKey())));
    }


    @GetMapping("/weather/city/" + cracow)
    public String weatherForCracow() {

        return Parser.parseWeatherDTOToString(Parser.parsingWeatherToWeatherDTO(GettingApiRequests.getApiResponse(cracow, GettingApiRequests.getPrivateKey())));
    }

    @GetMapping("/weather/city/" + wroclaw)
    public String weatherForWroclaw() {

        return Parser.parseWeatherDTOToString(Parser.parsingWeatherToWeatherDTO(GettingApiRequests.getApiResponse(wroclaw, GettingApiRequests.getPrivateKey())));
    }

    @GetMapping("/weather/city/" + lodz)
    public String weatherForLodz() {

        return Parser.parseWeatherDTOToString(Parser.parsingWeatherToWeatherDTO(GettingApiRequests.getApiResponse(lodz, GettingApiRequests.getPrivateKey())));
    }

    @GetMapping("/weather/city/" + poznan)
    public String weatherForPoznan() {

        return Parser.parseWeatherDTOToString(Parser.parsingWeatherToWeatherDTO(GettingApiRequests.getApiResponse(poznan, GettingApiRequests.getPrivateKey())));
    }
    @GetMapping("weather/expose")
    public String weatherForAllCitiesExpose() {

        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (String c : city) {
            sb.append(GettingApiRequests.getApiResponseExpose(c, GettingApiRequests.getPrivateKey()));
            sb.append(',');
        }
        sb.append("]");

        return sb.toString();
    }


    @GetMapping("/weather/city/" + warsaw + "/expose")
    public String weatherForWarsawExpose() {

        return GettingApiRequests.getApiResponseExpose(warsaw, GettingApiRequests.getPrivateKey());    }


    @GetMapping("/weather/city/" + cracow + "/expose")
    public String weatherForCracowExpose() {

        return GettingApiRequests.getApiResponseExpose(cracow, GettingApiRequests.getPrivateKey());    }

    @GetMapping("/weather/city/" + wroclaw + "/expose")
    public String weatherForWroclawExpose() {

        return GettingApiRequests.getApiResponseExpose(wroclaw, GettingApiRequests.getPrivateKey());    }

    @GetMapping("/weather/city/" + lodz + "/expose")
    public String weatherForLodzExpose() {

        return GettingApiRequests.getApiResponseExpose(lodz, GettingApiRequests.getPrivateKey());    }

    @GetMapping("/weather/city/" + poznan + "/expose")
    public String weatherForPoznanExpose() {

        return GettingApiRequests.getApiResponseExpose(poznan, GettingApiRequests.getPrivateKey());    }
}
