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
