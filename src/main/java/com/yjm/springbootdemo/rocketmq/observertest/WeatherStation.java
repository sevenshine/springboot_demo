package com.yjm.springbootdemo.rocketmq.observertest;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurement(80,65,30.4f);
    }


}
