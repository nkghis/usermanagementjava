package ci.nkagou.usermanagementjava.repository;

import ci.nkagou.usermanagementjava.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String userName);
    Boolean existsByUserName(String userName);
}
