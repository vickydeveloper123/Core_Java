package com.xworkz.interfaces.dao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.interfaces.dto.PoliticalPartyDTO;

public class PoliticalDAOImplementor implements PoliticalDAO {
	
	List<PoliticalPartyDTO> list=new LinkedList<PoliticalPartyDTO>();
	private int index=0,i=0;

	@Override
	public boolean save(PoliticalPartyDTO dto) {
		System.out.println("Running save method in PoliticalDAOImplementor");
		if(dto!=null)
		{
			list.add(dto);
			System.out.println(list.get(index));
			index++;
			return true;
		}
		
		
		
		return false;
	}

	@Override
	public void deleteByName(String name) {

		System.out.println("Running delete method in PoliticalDAOImplementor ");
		for(int i=0;i<list.size();i++)
		{
			if(name!=null)
			{
				if(list.get(i).getName().equals(name));
				System.out.println(list.get(i));
				list.remove(i);
			}
			else
			{
				System.out.println("We cannot remove name because name is not eqaul");
				System.out.println(list.get(i));
			}
		}
		
	}
	
	
	public void addingDTOelementsTOcollection(PoliticalPartyDTO  dto)
	{
		list.add(dto);
	}
	public void iterater()
	{
		System.out.println("Iterater");
		
		Iterator<PoliticalPartyDTO> h=list.iterator();
		
		while(h.hasNext())
		{
			System.out.println(h.next());
		}
	}
	
	
	
	

}
