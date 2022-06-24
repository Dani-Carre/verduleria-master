/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.verduleria.service;

import com.verduleria.entity.Verduras;
import com.verduleria.repository.VerdurasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela
 */

@Service
public class VerdurasService implements IVerdurasService{

    @Autowired
    private VerdurasRepository verdurasRepository;
    
    @Override
    public List<Verduras> getAllVerduras() {
        return (List<Verduras>)verdurasRepository.findAll();
    }

    @Override
    public Verduras getVerdurasById(long id) {
        return verdurasRepository.findById(id).orElse(null);
    }

    @Override
    public void saveVerduras(Verduras verduras) {
        verdurasRepository.save(verduras);
    }

    @Override
    public void delete(long id) {
        verdurasRepository.deleteById(id);
    }
        
}
