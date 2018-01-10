package pl.kowalska.weatherstation.app;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Weather {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nrPlytki")
    @NotNull
    private int nrPlytki;

    @Column(name = "temperatura")
    @NotNull
    private String temperatura;

    @Column(name = "wilgotnosc")
    @NotNull
    private String wilgotnosc;

    @Column(name = "cisnienie")
    @NotNull
    private String cisnienie;

    @Column(name = "szerokosc")
    @NotNull
    private double szerokosc;

    @Column(name = "dlugosc")
    @NotNull
    private double dlugosc;

    @Column(name = "czas")
    @NotNull
    private String czas;

    @Column(name = "info",length = 500)
    @NotNull
    private String info;

    public Weather() {

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Weather(int nrPlytki, String temperatura, String wilgotnosc, String cisnienie, double szerokosc, double dlugosc, String czas, String info) {
        this.nrPlytki = nrPlytki;
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        this.czas = czas;
        this.info = info;

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNrPlytki() {
        return nrPlytki;
    }

    public void setNrPlytki(int nrPlytki) {
        this.nrPlytki = nrPlytki;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getWilgotnosc() {
        return wilgotnosc;
    }

    public void setWilgotnosc(String wilgotnosc) {
        this.wilgotnosc = wilgotnosc;
    }

    public String getCisnienie() {
        return cisnienie;
    }

    public void setCisnienie(String cisnienie) {
        this.cisnienie = cisnienie;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public String getCzas() {
        return czas;
    }

    public void setCzas(String czas) {
        this.czas = czas;
    }
}

