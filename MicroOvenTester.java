package com.Xworkz.MicroOven;

import com.Xworkz.MicroOven.DAO.MicroOvenDAO;
import com.Xworkz.MicroOven.DTO.MicroOvenDTO;

public class MicroOvenTester {

	public static void main(String[] args) {

		MicroOvenDAO microovendao = new MicroOvenDAO();
		MicroOvenDTO samsung = new MicroOvenDTO("SAMSUNG", 1, 10000,"SAM005","grey");
		microovendao.saveDTO(samsung);
		MicroOvenDTO hier = new MicroOvenDTO("Hier", 3, 20000,"Hi678","black");
		microovendao.saveDTO(hier);
		MicroOvenDTO goodrej = new MicroOvenDTO("Goodrej", 6, 30000,"GOO456","blue");
		microovendao.saveDTO(goodrej);
		MicroOvenDTO lg = new MicroOvenDTO("LG", 9, 25000,"LG678","white");
		microovendao.saveDTO(lg);

		microovendao.displayByBrandName("SAMSUNG");

		System.out.println("before update");
		microovendao.displayByBrandName("SAMSUNG");
		
		microovendao.updateByBrand("SAMSUNG", "white");
		
		System.out.println("after update");
		microovendao.displayByBrandName("SAMSUNG");

		microovendao.deleteByBrand("Hier");
		microovendao.displayinfo();
	}

}
