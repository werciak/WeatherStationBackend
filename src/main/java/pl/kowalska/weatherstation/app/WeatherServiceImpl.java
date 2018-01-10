package pl.kowalska.weatherstation.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    @Override
    public List<Weather> findAll() {
        return weatherRepository.findAll();
    }

    @Override
    public Weather search(int id) {
        return weatherRepository.findById(id);
    }

    @Override
    public Weather findOne(int id) {
        return weatherRepository.findById(id);
    }

    @Override
    public void save(Weather Weather) {
        if(Weather.getInfo().startsWith("$GPGLL")) {
            String info = Weather.getInfo();
            String cps = info.substring(7, 17);
            String cps2 = cps.substring(0, 2); //51
            int wynik51 = Integer.parseInt(cps2);
            String cps3 = cps.substring(2, 10); //reszta
            double siema = Double.parseDouble(cps3);
            double wynik = siema / 60;
            double ostatni = wynik51 + wynik;

            String dlugosc = info.substring(20, 31);
            String dlugosc2 = dlugosc.substring(1, 3);
            int wynik15 = Integer.parseInt(dlugosc2); //15
            String dlugosc3 = dlugosc.substring(3, 11);
            double siemka10 = Double.parseDouble(dlugosc3);
            double wyniczek = siemka10 / 60;
            double ostatni2 = wynik15 + wyniczek;


        Weather.setDlugosc(ostatni2);
        Weather.setSzerokosc(ostatni);}
        else {
            double dlugosc = 15.528609;
            double szerokosc = 51.941249;
            Weather.setDlugosc(dlugosc);
            Weather.setSzerokosc(szerokosc);
        }
        weatherRepository.save(Weather);
    }

    @Override
    public void delete(int id) {

        weatherRepository.delete(id);
    }

    @Override
    public List<Weather> findAllWithID(int id) {
        return weatherRepository.findAll().stream().filter(weather -> weather.getNrPlytki() == id).collect(Collectors.toList());
    }


}
