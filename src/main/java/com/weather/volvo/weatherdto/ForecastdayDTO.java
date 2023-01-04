package com.weather.volvo.weatherdto;

public class ForecastdayDTO {

    private String date;
    private DayDTO day;
    private AstroDTO astro;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public DayDTO getDay() {
        return day;
    }

    public void setDay(DayDTO day) {
        this.day = day;
    }

    public AstroDTO getAstro() {
        return astro;
    }

    public void setAstro(AstroDTO astro) {
        this.astro = astro;
    }


}
