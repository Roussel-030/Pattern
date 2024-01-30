package com.observerPattern.useMyHand;

import com.observerPattern.useMyHand.classes.dataWeather.DataWeather;
import com.observerPattern.useMyHand.classes.show.ConditionShow;
import com.observerPattern.useMyHand.classes.show.PresageShow;
import com.observerPattern.useMyHand.classes.show.StatShow;

public class Main {
    public static void main(String[] args) {
        DataWeather dataWeather = new DataWeather();
        ConditionShow conditionShow = new ConditionShow(dataWeather);
        PresageShow presageShow = new PresageShow(dataWeather);
        StatShow statShow = new StatShow(dataWeather);

        dataWeather.setMeasure(1.1f, 1.2f, 1.3f);
    }
}
