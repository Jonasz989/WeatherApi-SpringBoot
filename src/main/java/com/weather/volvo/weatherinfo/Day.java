
package com.weather.volvo.weatherinfo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maxtemp_c",
    "mintemp_c",
    "avgtemp_c",
    "maxwind_mph",
    "totalprecip_mm",
    "totalsnow_cm",
    "avgvis_km",
    "avghumidity",
    "daily_chance_of_rain",
    "daily_chance_of_snow",
    "condition",
    "uv"
})
@Generated("jsonschema2pojo")
public class Day implements Serializable
{

    @JsonProperty("maxtemp_c")
    private double maxtempC;
    @JsonProperty("mintemp_c")
    private double mintempC;
    @JsonProperty("avgtemp_c")
    private double avgtempC;
    @JsonProperty("maxwind_mph")
    private double maxwindMph;
    @JsonProperty("totalprecip_mm")
    private double totalprecipMm;
    @JsonProperty("totalsnow_cm")
    private double totalsnowCm;
    @JsonProperty("avgvis_km")
    private double avgvisKm;
    @JsonProperty("avghumidity")
    private double avghumidity;
    @JsonProperty("daily_chance_of_rain")
    private long dailyChanceOfRain;
    @JsonProperty("daily_chance_of_snow")
    private long dailyChanceOfSnow;
    @JsonProperty("condition")
    private Condition__1 condition;
    @JsonProperty("uv")
    private double uv;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5915249412569065024L;

    @JsonProperty("maxtemp_c")
    public double getMaxtempC() {
        return maxtempC;
    }

    @JsonProperty("maxtemp_c")
    public void setMaxtempC(double maxtempC) {
        this.maxtempC = maxtempC;
    }

    @JsonProperty("mintemp_c")
    public double getMintempC() {
        return mintempC;
    }

    @JsonProperty("mintemp_c")
    public void setMintempC(double mintempC) {
        this.mintempC = mintempC;
    }

    @JsonProperty("avgtemp_c")
    public double getAvgtempC() {
        return avgtempC;
    }

    @JsonProperty("avgtemp_c")
    public void setAvgtempC(double avgtempC) {
        this.avgtempC = avgtempC;
    }

    @JsonProperty("maxwind_mph")
    public double getMaxwindMph() {
        return maxwindMph;
    }

    @JsonProperty("maxwind_mph")
    public void setMaxwindMph(double maxwindMph) {
        this.maxwindMph = maxwindMph;
    }

    @JsonProperty("totalprecip_mm")
    public double getTotalprecipMm() {
        return totalprecipMm;
    }

    @JsonProperty("totalprecip_mm")
    public void setTotalprecipMm(double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
    }

    @JsonProperty("totalsnow_cm")
    public double getTotalsnowCm() {
        return totalsnowCm;
    }

    @JsonProperty("totalsnow_cm")
    public void setTotalsnowCm(double totalsnowCm) {
        this.totalsnowCm = totalsnowCm;
    }

    @JsonProperty("avgvis_km")
    public double getAvgvisKm() {
        return avgvisKm;
    }

    @JsonProperty("avgvis_km")
    public void setAvgvisKm(double avgvisKm) {
        this.avgvisKm = avgvisKm;
    }

    @JsonProperty("avghumidity")
    public double getAvghumidity() {
        return avghumidity;
    }

    @JsonProperty("avghumidity")
    public void setAvghumidity(double avghumidity) {
        this.avghumidity = avghumidity;
    }

    @JsonProperty("daily_chance_of_rain")
    public long getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    @JsonProperty("daily_chance_of_rain")
    public void setDailyChanceOfRain(long dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }

    @JsonProperty("daily_chance_of_snow")
    public long getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    @JsonProperty("daily_chance_of_snow")
    public void setDailyChanceOfSnow(long dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }

    @JsonProperty("condition")
    public Condition__1 getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition__1 condition) {
        this.condition = condition;
    }

    @JsonProperty("uv")
    public double getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(double uv) {
        this.uv = uv;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
