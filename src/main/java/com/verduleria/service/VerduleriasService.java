/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.verduleria.service;

import com.verduleria.entity.Verdulerias;
import com.verduleria.repository.VerduleriasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela
 */
@Service
public class VerduleriasService implements IVerduleriasService{

    @Autowired
    private VerduleriasRepository verduleriasRepository;
    
    @Override
    public List<Verdulerias> ListVerdulerias() {
        return (List<Verdulerias>)verduleriasRepository.findAll();
    }
}
