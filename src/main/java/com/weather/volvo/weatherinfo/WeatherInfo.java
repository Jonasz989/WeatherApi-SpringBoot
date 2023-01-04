
package com.weather.volvo.weatherinfo;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "location",
    "current",
    "forecast",
    "alerts"
})
@Generated("jsonschema2pojo")
public class WeatherInfo implements Serializable
{

    @JsonProperty("location")
    private Location location;
    @JsonProperty("current")
    private Current current;
    @JsonProperty("forecast")
    private Forecast forecast;
    @JsonProperty("alerts")
    private Alerts alerts;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6152428644532957272L;

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("current")
    public Current getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(Current current) {
        this.current = current;
    }

    @JsonProperty("forecast")
    public Forecast getForecast() {
        return forecast;
    }

    @JsonProperty("forecast")
    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    @JsonProperty("alerts")
    public Alerts getAlerts() {
        return alerts;
    }

    @JsonProperty("alerts")
    public void setAlerts(Alerts alerts) {
        this.alerts = alerts;
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
