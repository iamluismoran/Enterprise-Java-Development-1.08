package org.example;

import java.math.BigDecimal;

import org.example.VideoStreamingService.Movie;
import org.example.VideoStreamingService.TvSeries;
import org.example.VideoStreamingService.Video;
import org.example.cars.Car;
import org.example.cars.Sedan;
import org.example.cars.Truck;
import org.example.cars.UtilityVehicle;
import org.example.intList.IntList;
import org.example.intList.IntArrayList;
import org.example.intList.IntVector;



public class Main {
    public static void main(String[] args) {
        // BigDecimalOperations

        BigDecimal num1 = new BigDecimal("14.4861");
        BigDecimal num2 = new BigDecimal("1.3564");
        BigDecimal num3= new BigDecimal("-45.67");

        System.out.println("\nRedondeado a la céntesima: " + BigDecimalOperations.roundToHundredth(num1));
        System.out.println("Invertido y redondeado(1.3564): " + BigDecimalOperations.interAndRoundToTenth(num2));
        System.out.println("Invertido y redondeado(-45.67): " + BigDecimalOperations.interAndRoundToTenth(num3));

        // Cars

        Car Sedan = new Sedan("1A2B3C", "Toyota", "Corolla", 120000);
        Car Truck = new Truck("456DEF", "Ford", "F-150", 80000, 5000.5);
        Car uv = new UtilityVehicle("7H8I9J", "Jeep", "Wrangler", 90000, true);

        System.out.println("\nInformacion de autos:");
        System.out.println(Sedan.getInfo());
        System.out.println(Truck.getInfo());
        System.out.println(uv.getInfo());

        // Video Streaming

        Video movie = new Movie("Interstellar", 169, 9.4);
        Video series = new TvSeries("The Handmaids Tale", 50,56);

        System.out.println("\nInformación de videos:");
        System.out.println(movie.getInfo());
        System.out.println(series.getInfo());

        //IntList Interface
        System.out.println("\nPrueba de IntArrayList:");
        IntList arrayList = new IntArrayList();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i * 2);
        }
        System.out.println("Elemento en posición 5: " + arrayList.get(5));

        System.out.println("\nPrueba de IntVector:");
        IntList vector = new IntVector();
        for (int i = 0; i < 25; i++) {
            vector.add(i * 3);
        }
        System.out.println("Elemento en posición 10: " + vector.get(10));
    }

}