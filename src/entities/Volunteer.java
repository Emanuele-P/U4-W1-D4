package entities;

import Interfaces.Worker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Volunteer implements Worker {

    //attributes
    private String name;
    private int age;
    private String resume;

    public Volunteer(String name, int age, String resume) {
        this.name = name;
        this.age = age;
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", resume='" + resume + '\'' +
                '}';
    }

    @Override
    public void checkIn(LocalDateTime time) {
        System.out.println("I am " + this.name + ", " + this.getClass().getSimpleName());
        System.out.println("I checked in at " + time.format(DateTimeFormatter.ISO_TIME));
        System.out.println(this.resume);
    }
}
