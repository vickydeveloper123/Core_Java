package com.xworkz.criminals;

public class CriminalService {
	
	private CriminalDAO dao;
	
	/*
	 * private CriminalDTO[] criminals=new CriminalDTO[10]; private int index=0;
	 */
	
     
	
	public CriminalDAO getDao() {
		return dao;
	}

	public void setDao(CriminalDAO dao) {
		this.dao = dao;
	}

	public CriminalService(CriminalDAO dao) {

		System.out.println("criminal service parameterised constructor");
		this.dao=dao;
	
	}
	
	public void getCriminal()
	{
		System.out.println("getCriminal");
		this.validateAndSave(null);
	}
	
	
	public void validateAndSave(CriminalDTO dto)
	{
		
		if(dto!=null)
		{
			if(dto.getId().length()>0 && dto.getJailName().length()>3 && dto.getJailName().length()<50 )
			
			if(dto.imprisonment>0 && dto.getJailName().length()>12   )
				
			{
				boolean data=dao.save(dto);
				System.out.println("Criminal data is adding "+dto);
				System.out.println(data);
				
			}
			
			
		}
	
		
		
	}

}
