package ÜbungsblattzuKlassenundAuflistungen;

import java.util.Objects;

public class Event {
    private String titel;
    private String ort;
    private double eintrittspreis;

    public Event(String titel, String ort, double eintrittspreis) {
        this.titel = titel;
        this.ort = ort;
        this.eintrittspreis = eintrittspreis;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getEintrittspreis() {
        return eintrittspreis;
    }

    public void setEintrittspreis(double eintrittspreis) {
        this.eintrittspreis = eintrittspreis;
    }

    @Override
    public String toString() {
        return "Event{" +
                "titel='" + titel + '\'' +
                ", ort='" + ort + '\'' +
                ", eintrittspreis=" + eintrittspreis +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Double.compare(event.eintrittspreis, eintrittspreis) == 0 && Objects.equals(titel, event.titel) && Objects.equals(ort, event.ort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, ort, eintrittspreis);
    }
}
