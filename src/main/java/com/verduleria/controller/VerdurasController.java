/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.verduleria.controller;


import com.verduleria.entity.Verdulerias;
import com.verduleria.entity.Verduras;
import com.verduleria.service.IVerduleriasService;
import com.verduleria.service.IVerdurasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author Daniela
 */
@Controller
public class VerdurasController {
    @Autowired
    private IVerdurasService verdurasService;
    
    @Autowired
    private IVerduleriasService verduleriasService;
    
    @GetMapping("/verduras") //cuando reciba esto (localhost/persona) en el navegador va a reconocer que tiene que realizar toda esta accion
    public String index (Model model){
        List<Verduras> listaVerduras = verdurasService.getAllVerduras();
        model.addAttribute("titulo","Tabla Verduras");
        model.addAttribute("verduras",listaVerduras);
        return "verduras";
    }

    @GetMapping("/verdurasN")
    public String crearVerduras (Model model){
        List<Verdulerias> listaVerdulerias = verduleriasService.ListVerdulerias();
        model.addAttribute("verduras",new Verduras());
        model.addAttribute("verdulerias",listaVerdulerias);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarVerduras (@ModelAttribute Verduras verduras){
        verdurasService.saveVerduras(verduras); //con esto lo guardo en mi base de datos
        return "redirect:/verduras";
    }
    
     @GetMapping("/editVerduras/{id}")
    public String editarVerduras (@PathVariable("id") Long idVerduras, Model model){
        Verduras verduras = verdurasService.getVerdurasById(idVerduras);
        List<Verdulerias> listaVerdulerias = verduleriasService.ListVerdulerias();
        model.addAttribute("verduras",verduras);
        model.addAttribute("verdulerias",listaVerdulerias);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarVerduras (@PathVariable("id") Long idVerduras){
        verdurasService.delete(idVerduras);
        return "redirect:/verduras";
    }
}
