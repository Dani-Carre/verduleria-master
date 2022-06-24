/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.verduleria.repository;

import com.verduleria.entity.Verdulerias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Daniela
 */
@Repository
public interface VerduleriasRepository  extends CrudRepository<Verdulerias,Long>{
    
}
