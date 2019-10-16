package com.company;

import java.util.Objects;

public class Llapis implements Comparable<Llapis>{

    private int color;
    private float grosor;

    public int getColor(){ return color; }

    public void setColor(){
        color = (int) (Math.random() * 10) + 1;
    }

    public  float getGrosor(){
        return grosor;
    }

    public void setGrosor(){
        grosor = (float) (Math.random() * 2) + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Llapis llapis = (Llapis) o;
        return color == llapis.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public int compareTo(Llapis llapis) {
        if(getColor() < llapis.getColor()){
            return -1;
        }
        if(getColor() > llapis.getColor()){
            return 1;
        } else { return 0; }
    }
}
