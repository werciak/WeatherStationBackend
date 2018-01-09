package pl.kowalska.weatherstation.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController  {

    @Autowired
    WeatherService weatherService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void create(@Valid @RequestBody Weather weather)
        {
            weatherService.save(weather);
        System.out.print("Stworzono");}

    @GetMapping
    List<Weather> getAll(){
        return weatherService.findAll();
    }

    @GetMapping("/rpi/{id}")
    List<Weather> getAllwithID(@PathVariable("id") int id){
        return weatherService.findAllWithID(id);
    }

    @GetMapping("/{id}")
    Weather getOne(@PathVariable("id") int id){
        return weatherService.findOne(id);
    }


}
