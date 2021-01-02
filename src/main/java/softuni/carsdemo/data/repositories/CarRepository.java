package softuni.carsdemo.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.carsdemo.data.models.Car;


@Repository
public interface CarRepository extends JpaRepository <Car,String>{



}
