package pl.milosz.ingredientservice.service;

import pl.milosz.ingredientservice.dto.IngredientRequest;
import pl.milosz.ingredientservice.dto.IngredientResponse;

import java.util.List;

public interface IngredientService {


    void createIngredient(IngredientRequest ingredientRequest);

    List<IngredientResponse> getAllIngredients();
}
