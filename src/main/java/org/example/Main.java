package org.example;

import java.math.BigDecimal;

import org.example.VideoStreamingService.Movie;
import org.example.VideoStreamingService.TvSeries;
import org.example.VideoStreamingService.Video;
import org.example.cars.Car;
import org.example.cars.Sedan;
import org.example.cars.Truck;
import org.example.cars.UtilityVehicle;



public class Main {
    public static void main(String[] args) {
        // BigDecimalOperations

        BigDecimal num1 = new BigDecimal("14.4861");
        BigDecimal num2 = new BigDecimal("1.3564");
        BigDecimal num3= new BigDecimal("-45.67");

        System.out.println("Redondeado a la céntesima: " + BigDecimalOperations.roundToHundredth(num1));
        System.out.println("Invertido y redondeado(1.3564): " + BigDecimalOperations.interAndRoundToTenth(num2));
        System.out.println("Invertido y redondeado(-45.67): " + BigDecimalOperations.interAndRoundToTenth(num3));

        // Cars

        Car Sedan = new Sedan("1A2B3C", "Toyota", "Corolla", 120000);
        Car Truck = new Truck("456DEF", "Ford", "F-150", 80000, 5000.5);
        Car suv = new UtilityVehicle("7H8I9J", "Jeep", "Wrangler", 90000, true);

        System.out.println("Informacion de autos:");
        System.out.println(Sedan.getInfo());
        System.out.println(Truck.getInfo());
        System.out.println(suv.getInfo());

        // Video Streaming

        Video movie = new Movie("Interestellar", 169, 9.4);
        Video series = new TvSeries("The Handmaids Tale", 50,56);

        System.out.println("Información de videos:");
        System.out.println(movie.getInfo());
        System.out.println(series.getInfo());
        
    }

}