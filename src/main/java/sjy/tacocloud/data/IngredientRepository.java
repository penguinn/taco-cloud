package sjy.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import sjy.tacocloud.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{
}
