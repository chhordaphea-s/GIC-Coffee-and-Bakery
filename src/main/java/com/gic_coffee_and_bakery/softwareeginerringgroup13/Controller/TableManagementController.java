package com.gic_coffee_and_bakery.softwareeginerringgroup13.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gic_coffee_and_bakery.softwareeginerringgroup13.DBManagement.TableManagement;
import com.gic_coffee_and_bakery.softwareeginerringgroup13.Model.Table;

@Controller
public class TableManagementController {
    @GetMapping("/tablemanagement")	
	public ModelAndView test(Model model) {

		model.addAttribute("allTable", displayTable());

		return new ModelAndView("table_management");
	}

	private List<Table> displayTable(){
		TableManagement tableManagement = new TableManagement();
		return tableManagement.getAllTables();
	}

}

