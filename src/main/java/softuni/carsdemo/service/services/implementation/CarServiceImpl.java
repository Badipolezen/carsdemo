package softuni.carsdemo.service.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.carsdemo.data.models.Car;
import softuni.carsdemo.data.repositories.CarRepository;
import softuni.carsdemo.service.models.CarServiceModel;
import softuni.carsdemo.service.services.CarService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final ModelMapper modelMapper;
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(ModelMapper modelMapper, CarRepository carRepository) {
        this.modelMapper = modelMapper;
        this.carRepository = carRepository;
    }

    @Override
    public CarServiceModel save(CarServiceModel model) {
        this.carRepository.save(this.modelMapper.map(model, Car.class));
        return model;
    }

    @Override
    public List<CarServiceModel> getCars() {
        return this.carRepository.findAll()
                .stream()
                .map(c->this.modelMapper.map(c,CarServiceModel.class))
                .collect(Collectors.toList());
    }
}
