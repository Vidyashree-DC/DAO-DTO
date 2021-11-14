package com.Xworkz.JunctionBox;

import com.Xworkz.JunctionBox.DAO.JunctionBoxDAO;
import com.Xworkz.JunctionBox.DTO.JunctionBoxDTO;

public class JunctionBoxTester {

	public static void main(String[] args) {

		JunctionBoxDAO junctionboxdao = new JunctionBoxDAO();
		JunctionBoxDTO cantex = new JunctionBoxDTO("Cantex", "Silver", 500, 101);
		junctionboxdao.saveDTO(cantex);
		JunctionBoxDTO carlon = new JunctionBoxDTO("Carlon", "Gray", 2000, 201);
		junctionboxdao.saveDTO(carlon);
		JunctionBoxDTO adamax = new JunctionBoxDTO("Adamax", "White", 1800, 301);
		junctionboxdao.saveDTO(adamax);

		junctionboxdao.displayByBrandName("Cantex");

		System.out.println("before update");
		junctionboxdao.displayByBrandName("Carlon");
		
		junctionboxdao.updateByBrand("Carlon", 3000);
		
		System.out.println("after update");
		junctionboxdao.displayByBrandName("Carlon");

		junctionboxdao.deleteByBrand("Adamax");
		junctionboxdao.displayInfo();

	}

}