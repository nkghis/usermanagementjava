package ci.nkagou.usermanagementjava.repository;

import ci.nkagou.usermanagementjava.model.AppRole;
import ci.nkagou.usermanagementjava.model.AppUser;
import ci.nkagou.usermanagementjava.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole> findByAppUser(AppUser user);
    List<UserRole> findByAppRoleIsNot(AppRole role);
}
