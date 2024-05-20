package com.app.serviceImpl;

import com.app.Exception.RestaurantException;
import com.app.model.Category;
import com.app.model.Restaurant;
import com.app.repository.CategoryRepository;
import com.app.service.CategoryService;
import com.app.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImplementation implements CategoryService {

    private final RestaurantService restaurantService;
    private final CategoryRepository categoryRepository;

    @Override
    public Category createCategory(String name, Long userId) throws RestaurantException {
        Restaurant restaurant = restaurantService.getRestaurantsByUserId(userId);
        Category createdCategory = new Category();

        createdCategory.setName(name);
        createdCategory.setRestaurant(restaurant);
        return categoryRepository.save(createdCategory);
    }

    @Override
    public List<Category> findCategoryByRestaurantId(Long id) throws RestaurantException {
        Restaurant restaurant = restaurantService.findRestaurantById(id);
        return categoryRepository.findByRestaurantId(id);
    }

    @Override
    public Category findCategoryById(Long id) throws RestaurantException {
        Optional<Category> opt = categoryRepository.findById(id);

        if (opt.isEmpty()) {
            throw new RestaurantException("category not exist with id " + id);
        }
        return opt.get();
    }

}
