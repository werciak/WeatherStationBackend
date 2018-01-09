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
    private int szerokosc;

    @Column(name = "dlugosc")
    @NotNull
    private int dlugosc;

    @Column(name = "czas")
    @NotNull
    private String czas;

    public Weather() {

    }

    public Weather(int nrPlytki, String temperatura, String wilgotnosc, String cisnienie, int szerokosc, int dlugosc, String czas) {
        this.nrPlytki = nrPlytki;
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        this.czas = czas;
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

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public String getCzas() {
        return czas;
    }

    public void setCzas(String czas) {
        this.czas = czas;
    }
}

