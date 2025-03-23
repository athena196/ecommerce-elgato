package com.elgatocode.ecommerce.dao;

import com.elgatocode.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    // used when user click Books/Coffee Mugs/Mouse Pad categories
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
    /*
    Behind the scene, Spring will execute above command similar to query:
    SELECT * FROM product WHERE category_id=?
     */

    // used when user type product in Search box
    Page<Product> findByNameContaining(@Param("name") String name, Pageable page);

}
