package my.test.myspring02.model.dao;

import my.test.myspring02.model.entity.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodDao extends CrudRepository<Food, Integer> {
}
