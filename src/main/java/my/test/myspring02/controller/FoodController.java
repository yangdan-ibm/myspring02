package my.test.myspring02.controller;
import my.test.myspring02.model.entity.Food;
import my.test.myspring02.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class FoodController {

    @Autowired
    FoodService foodService;

    @GetMapping("/foods")
    public String getFoods(Model model) {
        Iterable<Food> foodList = foodService.getFood();
        model.addAttribute("foodlist", foodList);
        Food food = new Food();
        model.addAttribute("foodObject", food);
        return "foodlist";
    }

    @PostMapping("/foods")
    public String createFoods(@ModelAttribute Food food, Model model) {
        Iterable<Food> allFoodList = foodService.createFood(food);
        Food emptyFood = new Food();
        model.addAttribute("foodlist", allFoodList);
        model.addAttribute("foodObject", emptyFood);
        return "redirect:/foods";
    }

    @ResponseBody
    @PutMapping("/foods/{id}")
    public String upadteFood(@PathVariable Integer id, @RequestBody Food food) {
        foodService.updateFood(id ,food);
        return "OK";
    }

    @ResponseBody
    @DeleteMapping("/foods/{id}")
    public String deleteFood(@PathVariable Integer id) {
        foodService.deleteFood(id);
        return "OK";
    }
}
