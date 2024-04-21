package sjy.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import sjy.tacocloud.model.TacoOrder;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long>{
    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
