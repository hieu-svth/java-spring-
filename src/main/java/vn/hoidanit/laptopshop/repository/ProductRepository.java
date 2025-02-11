package vn.hoidanit.laptopshop.repository;

import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.domain.Product;
import vn.hoidanit.laptopshop.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product save(Product product);

    Product findById(long id);

}
