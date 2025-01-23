package vn.hoidanit.laptopshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.domain.User;

@Repository
// generic user se thao tac o day, long la khoa chinh
// su dung repository de thao tac tu view xuong model
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User hoidanit);
}
