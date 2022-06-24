/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.verduleria.repository;

import com.verduleria.entity.Verduras;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Daniela
 */
@Repository
public interface VerdurasRepository extends CrudRepository<Verduras,Long> {
    
}
