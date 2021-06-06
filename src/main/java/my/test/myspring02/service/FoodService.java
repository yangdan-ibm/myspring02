package my.test.myspring02.service;

import my.test.myspring02.model.dao.FoodDao;
import my.test.myspring02.model.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    FoodDao foodDao;

    public Iterable<Food> getFood() {
        return foodDao.findAll();
    }

    public Iterable<Food> createFood(Food food) {
        foodDao.save(food);
        return getFood();
    }

    public Food updateFood(Integer id, Food food) {
        try {
            Food resFood = findById(id);
            Integer status = food.getStatus();
            resFood.setStatus(status);
            return foodDao.save(resFood);
        }catch (Exception exception) {
            return null;
        }

    }

    public Food findById(Integer id) {
        Food food = foodDao.findById(id).get();
        return food;
    }

    public Boolean deleteFood(Integer id) {
        try {
            Food resFood = findById(id);
            foodDao.deleteById(id);
            return true;
        }catch (Exception exception) {
            return false;
        }
    }
}
