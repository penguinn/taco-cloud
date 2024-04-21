package sjy.tacocloud.configuration;

//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import lombok.extern.slf4j.Slf4j;
//import sjy.tacocloud.model.Ingredient;
//import sjy.tacocloud.model.Ingredient.Type;
//import sjy.tacocloud.data.IngredientRepository;
//
//@Configuration
//@Slf4j
//public class DataLoaderConfig {
//
//    @Bean
//    public ApplicationRunner dataLoader(IngredientRepository repo) {
//        log.info("Loading ingredients into the database");
//        return args -> {
//            repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
//            repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
//            repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
//            repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
//            repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
//            repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
//            repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
//            repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
//            repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
//            repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
//        };
//    }
//}
