package com.kafka.producer.KafkaProducer.model;

public class User {

    private String name;
    private String location;
    private int salary;

    public User(){}

    public User(String name, String location, int salary) {
        this.name = name;
        this.location = location;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
