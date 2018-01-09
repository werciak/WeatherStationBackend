package pl.kowalska.weatherstation.app;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface

WeatherRepository extends CrudRepository<Weather,Integer> {

    Weather findById(int id);

    List<Weather> findAll();


}
