package com.techelevator.PostageCalculator;

public class ServiceTestingGround {

	public static void main(String[] args) {
		
		PostalService postal = new PostalService();
		postal.setServiceType("1st Class");
		System.out.println("USPS testing");
		System.out.println(postal.calculateRate(50, 50));
		
		postal.setServiceType("2nd Class");
		System.out.println(postal.calculateRate(50, 50));
		
		postal.setServiceType("3rd Class");
		System.out.println(postal.getServiceType() + " " + postal.calculateRate(50, 50));
		
		FedEx fedex = new FedEx();
		System.out.println("FedEx Testing");
		System.out.println(fedex.calculateRate(501, 50));
		System.out.println(fedex.calculateRate(500, 50));
		System.out.println(fedex.calculateRate(301, 20));
		System.out.println(fedex.calculateRate(100, 20));
		
		SPU spu = new SPU();
		System.out.println("SPU Testing");
		spu.setServiceType("Next Day");
		System.out.println(spu.getServiceType() + " " + spu.calculateRate(50, 50));
		spu.setServiceType("2-Day Business");
		System.out.println(spu.calculateRate(50, 50));
		spu.setServiceType("4-Day Ground");
		System.out.println(spu.calculateRate(50, 50));

	}

}
