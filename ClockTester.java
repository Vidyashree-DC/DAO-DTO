package com.Xworkz.Clock;

import com.Xworkz.Clock.DAO.ClockDAO;
import com.Xworkz.Clock.DTO.ClockDTO;

public class ClockTester {

	public static void main(String[] args) {

		ClockDAO clockdao = new ClockDAO();
		ClockDTO ti = new ClockDTO("TITAN", "block", "TIT0056", 500);
		clockdao.saveDTO(ti);
		ClockDTO ma = new ClockDTO("MAGENTA", "white", "MEG765", 1000);
		clockdao.saveDTO(ma);
		ClockDTO si = new ClockDTO("SEEBIRD", "blue", "SEE678", 400);
		clockdao.saveDTO(si);

		clockdao.displayInfo();
		System.out.println("before update");
		clockdao.displayByBrandName("TITAN");
		
		clockdao.updateByBrand("TITAN", 700);
		System.out.println("after update");
		clockdao.displayByBrandName("TITAN");

		System.out.println("before update");
		clockdao.displayByBrandName("TITAN");
		
		clockdao.updateBrandNamebybrandname("TITAN", "ajanta");
		
		System.out.println("after update");
		clockdao.displayByBrandName("ajanta");

		clockdao.deleteByBrand("MAGENTA");
		clockdao.displayInfo();
	}

}