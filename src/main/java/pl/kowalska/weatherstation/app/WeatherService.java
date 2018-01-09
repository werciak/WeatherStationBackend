package pl.kowalska.weatherstation.app;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public interface WeatherService {


    List<Weather> findAll();

    Weather search(int id);

    Weather findOne(int id);

    void save(Weather Weather);

    void delete(int id);

    List<Weather> findAllWithID(int id);
}
