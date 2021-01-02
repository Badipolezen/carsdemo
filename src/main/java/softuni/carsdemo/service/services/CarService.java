package softuni.carsdemo.service.services;

import softuni.carsdemo.service.models.CarServiceModel;

import java.util.List;

public interface CarService {
    CarServiceModel save (CarServiceModel model);

List<CarServiceModel> getCars();
}
