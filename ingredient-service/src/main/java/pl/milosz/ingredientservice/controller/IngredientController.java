package pl.milosz.ingredientservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.milosz.ingredientservice.dto.IngredientRequest;
import pl.milosz.ingredientservice.dto.IngredientResponse;
import pl.milosz.ingredientservice.service.IngredientService;

import java.util.List;

@RestController
@RequestMapping("/api/ingredient")
@RequiredArgsConstructor
public class IngredientController {

    private final IngredientService ingredientService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createIngredient(@RequestBody IngredientRequest ingredientRequest) {
        ingredientService.createIngredient(ingredientRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<IngredientResponse > getAllIngredient() {
        return ingredientService.getAllIngredients();
    }
}
