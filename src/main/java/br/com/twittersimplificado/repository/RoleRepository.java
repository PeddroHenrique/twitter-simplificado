/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.twittersimplificado.repository;

import br.com.twittersimplificado.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pedro
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

    Role findByName(String admin);
    
}
