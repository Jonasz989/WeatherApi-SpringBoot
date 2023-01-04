package com.weather.volvo.weatherdto;

import java.util.List;

public class ForecastDTO {

    private List<ForecastdayDTO> forecastday = null;

    public List<ForecastdayDTO> getForecastday() {
        return forecastday;
    }
    public void setForecastday(List<ForecastdayDTO> forecastday) {
        this.forecastday = forecastday;
    }

}
