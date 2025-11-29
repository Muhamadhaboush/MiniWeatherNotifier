import java.util.Random;
import java.util.Scanner;

public class Weather{   // Class adı büyük harf ile başlasın, Java standardı

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" Mini Weather Notifier ");
        System.out.print("Enter a city name: ");
        String city = scanner.nextLine();

        // Random temperature between -10 and 35
        int temp = random.nextInt(46) - 10;

        // Random weather condition
        String[] weathers = { "Sunny", "Cloudy", "Rainy", "Windy", "Snowy" };
        String weather = weathers[random.nextInt(weathers.length)];

        // Simple advice based on weather
        String advice;
        switch (weather) {
            case "Sunny":
                advice = "Wear sunglasses!";
                break;
            case "Rainy":
                advice = "Take an umbrella!";
                break;
            case "Snowy":
                advice = "Wear warm clothes!";
                break;
            case "Windy":
                advice = "Hold onto your hat!";
                break;
            default:
                advice = "Have a nice day!";
        }

        System.out.println("\nCity: " + city);
        System.out.println("Temperature: " + temp + "°C");
        System.out.println("Weather: " + weather);
        System.out.println("Advice: " + advice);

        scanner.close();
    }
}
