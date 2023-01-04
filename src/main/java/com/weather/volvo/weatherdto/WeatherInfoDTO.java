package com.weather.volvo.weatherdto;

public class WeatherInfoDTO  {


    private LocationDTO location;

    private CurrentDTO current;

    private ForecastDTO forecast;

    public LocationDTO getLocation() {
        return location;
    }

    public void setLocation(LocationDTO location) {
        this.location = location;
    }

    public CurrentDTO getCurrent() {
        return current;
    }

    public void setCurrent(CurrentDTO current) {
        this.current = current;
    }

    public ForecastDTO getForecast() {
        return forecast;
    }

    public void setForecast(ForecastDTO forecast) {
        this.forecast = forecast;
    }




}
