package com.uca.cuartaTarea.controller;

import java.text.ParseException;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.cuartaTarea.modelo.domain.Producto;

@Controller
public class ProductoController {
	
	@RequestMapping("/ingresar")
	public ModelAndView ingresar() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("ingresar");
		return mav;
	}
	
	@RequestMapping("/ingreso")
	public ModelAndView ingreso(@Valid @ModelAttribute Producto producto, BindingResult result) throws ParseException {
		
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("ingresar");
		}
		else { 
			mav.addObject("nombre", producto.getNombre());
			mav.setViewName("succefullPage");
		}
		return mav;
		
	}
	
	

}
