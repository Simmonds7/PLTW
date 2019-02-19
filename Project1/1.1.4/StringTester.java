
/**
 * Write a description of class StringTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringTester
{
    public static void main()
    {
        System.out.println(WeatherConditionals.getWeatherAdvice(25, "heavy snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(110, "armageddon snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(60, "light rain"));
        System.out.println(WeatherConditionals.getWeatherAdvice(-49, "freezing rain"));
    }
}