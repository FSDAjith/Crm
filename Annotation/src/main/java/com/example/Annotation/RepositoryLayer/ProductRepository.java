package com.example.Annotation.RepositoryLayer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Annotation.EntityLayer.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

	@Query(value = "SELECT * FROM product WHERE customer_id_fk = :customerId", nativeQuery = true)
	List<Product> findProductUsingCustomerId(@Param("customerId")Long customerId);
	// Long customerId
}
