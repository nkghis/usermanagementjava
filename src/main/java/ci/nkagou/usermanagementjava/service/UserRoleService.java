package ci.nkagou.usermanagementjava.service;

import ci.nkagou.usermanagementjava.model.AppRole;
import ci.nkagou.usermanagementjava.model.AppUser;
import ci.nkagou.usermanagementjava.model.UserRole;

import java.util.List;

public interface UserRoleService {

    List<UserRole> all ();
    UserRole create (UserRole userRole);
    List<UserRole> findByAppRoleIsNot(AppRole role);
    List<UserRole> findByAppUser(AppUser user);

}
