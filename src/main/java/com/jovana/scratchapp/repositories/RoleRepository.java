package com.jovana.scratchapp.repositories;

import com.jovana.scratchapp.entities.Role;
import com.jovana.scratchapp.entities.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by jovana on 30.07.2021
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName name);

}
