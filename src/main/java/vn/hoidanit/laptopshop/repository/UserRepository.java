package vn.hoidanit.laptopshop.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.domain.User;

@Repository
// generic user se thao tac o day, long la khoa chinh
// su dung repository de thao tac tu view xuong model
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User hoidanit);

    void deleteById(long id);

    List<User> findOneByEmail(String email);

    User findById(long id);

    boolean existsByEmail(String email);

    User findByEmail(String email);

    Page<User> findAll(Pageable pageable);
}
