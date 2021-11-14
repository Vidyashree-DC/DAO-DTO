package com.Xworkz.IronBox;

import com.Xworkz.IronBox.DAO.IronBoxDAO;
import com.Xworkz.IronBox.DTO.IronBoxDTO;

public class IronBoxTester {

	public static void main(String[] args) {

		IronBoxDAO ironboxdao = new IronBoxDAO();
		IronBoxDTO Preethi = new IronBoxDTO("Preethi", "gray", 3000, 240);
		ironboxdao.saveDTO(Preethi);
		IronBoxDTO BajajMX = new IronBoxDTO("Butterfly", "blue", 2500, 280);
		ironboxdao.saveDTO(BajajMX);
		IronBoxDTO UshaEi = new IronBoxDTO("Usha", "navyblue", 2000, 260);
		ironboxdao.saveDTO(UshaEi);

		ironboxdao.displayByBrandname("Preethi");

		System.out.println("before update");
		ironboxdao.displayByBrandname("Butterfly");
		
		ironboxdao.updateByBrand("Butterfly", 1800);
		
		System.out.println("after update");
		ironboxdao.displayByBrandname("Butterfly");

		ironboxdao.deleteByBrand("Usha");
		ironboxdao.displayInfo();
	}
}
