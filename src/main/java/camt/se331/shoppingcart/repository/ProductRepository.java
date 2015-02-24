package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Dto on 2/9/2015.
 */

public interface ProductRepository extends JpaRepository<Product,Long>{
    public final static String Find_By_any_Keyword = "SELECT p FROM Product p " +
            "WHERE p.name LIKE %:anyKeyWord% " +
            "OR p.description LIKE %:anyKeyWord%";

    @Query(Find_By_any_Keyword)
    public List<Product> findByAnyWalue(@Param("anyKeyWord") String anyKeyWord);
}
