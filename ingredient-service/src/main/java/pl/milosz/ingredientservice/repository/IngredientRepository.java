package pl.milosz.ingredientservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.milosz.ingredientservice.model.Ingredient;

public interface IngredientRepository extends MongoRepository<Ingredient, String> {
}
