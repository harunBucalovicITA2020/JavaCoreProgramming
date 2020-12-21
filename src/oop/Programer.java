package oop;

public class Programer extends Person{
    private int godineIskustva;
    private String pozicija;

    public Programer(String name, String surename, int age, int godineIskustva, String pozicija) {
        super(name, surename, age);
        this.godineIskustva = godineIskustva;
        this.pozicija = pozicija;
    }
}
