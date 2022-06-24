/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.verduleria.service;


import com.verduleria.entity.Verduras;
import java.util.List;
/**
 *
 * @author Daniela
 */
public interface IVerdurasService {
    public List<Verduras> getAllVerduras();
    public Verduras getVerdurasById (long id);
    public void saveVerduras(Verduras verduras);
    public void delete (long id);
    
}
