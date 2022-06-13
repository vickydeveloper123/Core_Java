
package com.xworkz.expenditure;
import com.xworkz.expenditure.dao.ExpenditureDAO;
import com.xworkz.expenditure.dao.ExpenditureImplementationDAO;
import com.xworkz.expenditure.dto.ExpenditureDTO;
import  com.xworkz.expenditure.dto.ExpenditurePeriod;
public class ExpenditureRunner  {
	
	public static void main(String[] args) {
		
		ExpenditureDTO dto=new ExpenditureDTO();
		dto.setPersonName("SRI VIGNESH");
		dto.setAmount(10000);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dto.setTax(18.0);
		dto.setSpentOn("ELECTRINICS");
		ExpenditureDAO dao=new ExpenditureImplementationDAO();
		boolean create=dao.create(dto);
			System.out.println("CREATED "+create);
		
			
			ExpenditureDTO dto1=new ExpenditureDTO();
			dto.setPersonName("SRI VIGNESH");
			dto.setAmount(103);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(12.0);
			dto.setSpentOn("ELECTRINICS AND HOUSEWARE");
			
			dao.create(dto1);
			
			

			ExpenditureDTO dto2=new ExpenditureDTO();
			dto.setPersonName("VIJAYA DURGA");
			dto.setAmount(1000);
			dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
			dto.setTax(10.0);
			dto.setSpentOn("BOOKS");
			
			dao.create(dto2);
			
			

			ExpenditureDTO dto3=new ExpenditureDTO();
			dto.setPersonName("AMMA");
			dto.setAmount(500);
			dto.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
			dto.setTax(5.0);
			dto.setSpentOn("VEGETABLES");
			
			dao.create(dto3);
			
			
			
			

			ExpenditureDTO dto4=new ExpenditureDTO();
			dto.setPersonName("KARTHIK");
			dto.setAmount(5000);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(18.0);
			dto.setSpentOn("WATCHES");
			
			dao.create(dto4);
			
			
			

			ExpenditureDTO dto5=new ExpenditureDTO();
			dto.setPersonName("LUCKY");
			dto.setAmount(700);
			dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
			dto.setTax(10.0);
			dto.setSpentOn("SHUTTLE COCKS");
			
			dao.create(dto5);
			
			
			

			ExpenditureDTO dto6=new ExpenditureDTO();
			dto.setPersonName("YAMINI");
			dto.setAmount(1899);
			dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
			dto.setTax(18.0);
			dto.setSpentOn("CLOTHING");
			
			dao.create(dto6);
			
			
			

			ExpenditureDTO dto7=new ExpenditureDTO();
			dto.setPersonName("madhu");
			dto.setAmount(900);
			dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
			dto.setTax(19.0);
			dto.setSpentOn("MOVIES");
			
			dao.create(dto7);
			
			
			

			ExpenditureDTO dto8=new ExpenditureDTO();
			dto.setPersonName("surya");
			dto.setAmount(4000);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(20.0);
			dto.setSpentOn("online games");
			
			dao.create(dto8);
			
			
			

			ExpenditureDTO dto9=new ExpenditureDTO();
			dto.setPersonName("vicky bhai");
			dto.setAmount(3000);
			dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
			dto.setTax(12.0);
			dto.setSpentOn("HOUSEWARE");
			
			dao.create(dto9);
			
			
			

			ExpenditureDTO dto10=new ExpenditureDTO();
			dto.setPersonName("SASI MADAM");
			dto.setAmount(5000);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(20.0);
			dto.setSpentOn("BOOKS");
			
			dao.create(dto10);
			
			
			

			ExpenditureDTO dto11=new ExpenditureDTO();
			dto.setPersonName("MALLIKARJUNA RAO");
			dto.setAmount(100000);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(19.0);
			dto.setSpentOn("WATER PLANT");
			
			dao.create(dto11);
			
			

			ExpenditureDTO dto12=new ExpenditureDTO();
			dto.setPersonName("AMMA");
			dto.setAmount(1000);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(12.0);
			dto.setSpentOn("TEMPLE");
			
			dao.create(dto12);
			
			

			ExpenditureDTO dto13=new ExpenditureDTO();
			dto.setPersonName("SRI VIGNESH");
			dto.setAmount(900);
			dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
			dto.setTax(12.0);
			dto.setSpentOn("MILK PACKETS");
			
			dao.create(dto13);
			
			
			

			ExpenditureDTO dto14=new ExpenditureDTO();
			dto.setPersonName("SAHNTI");
			dto.setAmount(1000);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(15.0);
			dto.setSpentOn("LIPSTICKS");
			
			dao.create(dto14);
			
			
			

			ExpenditureDTO dto15=new ExpenditureDTO();
			dto.setPersonName("JYOTHI");
			dto.setAmount(5000);
			dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
			dto.setTax(12.0);
			dto.setSpentOn("MOVIES");
			
			dao.create(dto15);
			
			
			

			ExpenditureDTO dto16=new ExpenditureDTO();
			dto.setPersonName("kiran");
			dto.setAmount(500);
			dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
			dto.setTax(15.0);
			dto.setSpentOn("PANIPURI");
			
			dao.create(dto16);
			
			

			ExpenditureDTO dto17=new ExpenditureDTO();
			dto.setPersonName("RAVANAMMA TEACHER");
			dto.setAmount(10000);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(12.0);
			dto.setSpentOn("TRANSPORT");
			
			dao.create(dto17);
			
			
			

			ExpenditureDTO dto18=new ExpenditureDTO();
			dto.setPersonName("ROWDY FATHER");
			dto.setAmount(100000);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(12.0);
			dto.setSpentOn("TRANSPORTATION AND SUPPLIERS");
			
			dao.create(dto18);
			
			

			ExpenditureDTO dto19=new ExpenditureDTO();
			dto.setPersonName("VIGNESH");
			dto.setAmount(10000);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(12.0);
			dto.setSpentOn("gym body building");
			
			dao.create(dto19);
			
			

			ExpenditureDTO dto20=new ExpenditureDTO();
			dto.setPersonName("KEERTHI");
			dto.setAmount(900);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(12.0);
			dto.setSpentOn("SNACKS");
			
			dao.create(dto20);
			
			
			

			ExpenditureDTO dto21=new ExpenditureDTO();
			dto.setPersonName("GIRIDHAR");
			dto.setAmount(1000);
			dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dto.setTax(12.0);
			dto.setSpentOn("ELECTRONICS");
			
			dao.create(dto21);
			

			ExpenditureDTO dtoupdate=new ExpenditureDTO();
			dtoupdate.setPersonName("PREETHAM");
			dtoupdate.setAmount(599);
			dtoupdate.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
			dtoupdate.setTax(14.0);
			dtoupdate.setSpentOn("CLOTHES");
			
			
			
			
			
			ExpenditureImplementationDAO castedDAO=(ExpenditureImplementationDAO)dao;
			
			castedDAO.updateByPersonName("AMMA",dtoupdate);
			
			System.out.println(castedDAO.expendituresCount());
			
	
		castedDAO.deleteByPersonName("VIGNESH");
			
			
		
		
		
		
	}

}