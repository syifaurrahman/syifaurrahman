public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(90, 65, 30.4f);
        System.out.println("\n");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("\n");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
