package com.weather.volvo.parser;

import com.weather.volvo.weatherdto.*;
import com.weather.volvo.weatherinfo.Forecastday;
import com.weather.volvo.weatherinfo.WeatherInfo;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static WeatherInfoDTO parsingWeatherToWeatherDTO(WeatherInfo obj) {

        WeatherInfoDTO dtoObject = new WeatherInfoDTO();

        //location
        LocationDTO location = new LocationDTO();
        dtoObject.setLocation(location);
        dtoObject.getLocation().setName(obj.getLocation().getName());
        dtoObject.getLocation().setLocaltime(obj.getLocation().getLocaltime());
        //current
        CurrentDTO current = new CurrentDTO();
        dtoObject.setCurrent(current);
        dtoObject.getCurrent().setTempC(obj.getCurrent().getTempC());
        dtoObject.getCurrent().setWindKph(obj.getCurrent().getWindKph());
        dtoObject.getCurrent().setPressureMb(obj.getCurrent().getPressureMb());
        dtoObject.getCurrent().setPrecipMm(obj.getCurrent().getPrecipMm());
        dtoObject.getCurrent().setHumidity(obj.getCurrent().getHumidity());
        dtoObject.getCurrent().setCloud(obj.getCurrent().getCloud());
        dtoObject.getCurrent().setFeelslikeC(obj.getCurrent().getFeelslikeC());
        dtoObject.getCurrent().setUv(obj.getCurrent().getUv());
        //forecast
        ForecastDTO forecast = new ForecastDTO();
        dtoObject.setForecast(forecast);
        int i = 0;
        List<ForecastdayDTO> forecastdayDTO = new ArrayList<>();
        for (Forecastday obj2 : obj.getForecast().getForecastday()) {

            dtoObject.getForecast().setForecastday(forecastdayDTO);
            dtoObject.getForecast().getForecastday().add(new ForecastdayDTO());
            dtoObject.getForecast().getForecastday().get(i).setDate(obj2.getDate());
            DayDTO day = new DayDTO();
            dtoObject.getForecast().getForecastday().get(i).setDay(day);
            dtoObject.getForecast().getForecastday().get(i).getDay().setMaxtempC(obj.getForecast().getForecastday().get(i).getDay().getMaxtempC());
            dtoObject.getForecast().getForecastday().get(i).getDay().setMintempC(obj2.getDay().getMintempC());
            dtoObject.getForecast().getForecastday().get(i).getDay().setAvgtempC(obj2.getDay().getAvgtempC());
            dtoObject.getForecast().getForecastday().get(i).getDay().setMaxwindMph(obj2.getDay().getMaxwindMph());
            dtoObject.getForecast().getForecastday().get(i).getDay().setTotalprecipMm(obj2.getDay().getTotalprecipMm());
            dtoObject.getForecast().getForecastday().get(i).getDay().setTotalsnowCm(obj2.getDay().getTotalsnowCm());
            dtoObject.getForecast().getForecastday().get(i).getDay().setAvgvisKm(obj2.getDay().getAvgvisKm());
            dtoObject.getForecast().getForecastday().get(i).getDay().setAvghumidity(obj2.getDay().getAvghumidity());
            dtoObject.getForecast().getForecastday().get(i).getDay().setDailyChanceOfRain(obj2.getDay().getDailyChanceOfRain());
            dtoObject.getForecast().getForecastday().get(i).getDay().setDailyChanceOfSnow(obj2.getDay().getDailyChanceOfSnow());
            dtoObject.getForecast().getForecastday().get(i).getDay().setUv(obj2.getDay().getUv());
            AstroDTO astro = new AstroDTO();
            dtoObject.getForecast().getForecastday().get(i).setAstro(astro);
            dtoObject.getForecast().getForecastday().get(i).getAstro().setSunrise(obj2.getAstro().getSunrise());
            dtoObject.getForecast().getForecastday().get(i).getAstro().setSunset(obj2.getAstro().getSunset());
            i++;

        }
        return dtoObject;
    }

    public static String parseWeatherDTOToString(WeatherInfoDTO obj) {

        StringBuilder sb = new StringBuilder();

        sb.append("Weather for ").append(obj.getLocation().getName()).append(System.getProperty("line.separator"));
        sb.append("Time: ").append(obj.getLocation().getLocaltime()).append(System.getProperty("line.separator"));
        sb.append("Weather for today: ").append(System.getProperty("line.separator"));
        sb.append("Temperature: ").append(obj.getCurrent().getTempC()).append(" celsius").append(System.getProperty("line.separator"));
        sb.append("Feels like: ").append(obj.getCurrent().getFeelslikeC()).append(" celsius").append(System.getProperty("line.separator"));
        sb.append("Wind speed: ").append(obj.getCurrent().getWindKph()).append(" km/h").append(System.getProperty("line.separator"));
        sb.append("Pressure: ").append(obj.getCurrent().getPressureMb()).append(" milibars").append(System.getProperty("line.separator"));
        sb.append("Precipitation: ").append(obj.getCurrent().getPrecipMm()).append(" mm").append(System.getProperty("line.separator"));
        sb.append("Humidity: ").append(obj.getCurrent().getHumidity()).append(" g.m^3").append(System.getProperty("line.separator"));
        sb.append("Cloudiness: ").append(obj.getCurrent().getCloud()).append(" %").append(System.getProperty("line.separator"));
        sb.append("UV Index: ").append(obj.getCurrent().getUv()).append(System.getProperty("line.separator"));
        sb.append("Forecast - ").append(System.getProperty("line.separator"));

        for (ForecastdayDTO forecastday : obj.getForecast().getForecastday()) {

            sb.append("Date - ").append(forecastday.getDate()).append(System.getProperty("line.separator"));
            sb.append("Max temperature: ").append(forecastday.getDay().getMaxtempC()).append(" celsius").append(System.getProperty("line.separator"));
            sb.append("Min temperature:  ").append(forecastday.getDay().getMintempC()).append(" celsius").append(System.getProperty("line.separator"));
            sb.append("Average temperature: ").append(forecastday.getDay().getAvgtempC()).append(" celsius").append(System.getProperty("line.separator"));
            sb.append("Max wind: ").append(forecastday.getDay().getMaxwindMph()).append(" miles/h").append(System.getProperty("line.separator"));
            sb.append("Total precipitation: ").append(forecastday.getDay().getTotalprecipMm()).append(" mm").append(System.getProperty("line.separator"));
            sb.append("Chance to rain: ").append(forecastday.getDay().getDailyChanceOfRain()).append(" %").append(System.getProperty("line.separator"));
            sb.append("Total snow: ").append(forecastday.getDay().getTotalsnowCm()).append(" cm").append(System.getProperty("line.separator"));
            sb.append("Chance to snow: ").append(forecastday.getDay().getDailyChanceOfSnow()).append(" %").append(System.getProperty("line.separator"));
            sb.append("Average visibility: ").append(forecastday.getDay().getAvgvisKm()).append(" km").append(System.getProperty("line.separator"));
            sb.append("UV Index: ").append(forecastday.getDay().getUv()).append(System.getProperty("line.separator"));
            sb.append("Sunrise: ").append(forecastday.getAstro().getSunrise()).append(System.getProperty("line.separator"));
            sb.append("Sunset: ").append(forecastday.getAstro().getSunset()).append(System.getProperty("line.separator"));

        }
        return sb.toString();
    }
}


