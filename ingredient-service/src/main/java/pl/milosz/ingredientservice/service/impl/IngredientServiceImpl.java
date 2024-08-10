package pl.milosz.ingredientservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.milosz.ingredientservice.dto.IngredientRequest;
import pl.milosz.ingredientservice.dto.IngredientResponse;
import pl.milosz.ingredientservice.model.Ingredient;
import pl.milosz.ingredientservice.repository.IngredientRepository;
import pl.milosz.ingredientservice.service.IngredientService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

    @Override
    public void createIngredient(IngredientRequest ingredientRequest) {
        Ingredient ingredient = Ingredient.builder()
                .name(ingredientRequest.getName())
                .calories(ingredientRequest.getCalories()).build();

        ingredientRepository.save(ingredient);
    }

    @Override
    public List<IngredientResponse> getAllIngredients() {
        return ingredientRepository.findAll().stream().map(this::mapToIngredientResponse).toList();
    }

    private IngredientResponse mapToIngredientResponse(Ingredient ingredient) {
        return IngredientResponse.builder()
                .id(ingredient.getId())
                .name(ingredient.getName())
                .calories(ingredient.getCalories())
                .build();
    }
}
