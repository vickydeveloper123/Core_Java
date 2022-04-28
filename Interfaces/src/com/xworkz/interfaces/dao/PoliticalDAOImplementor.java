package com.xworkz.interfaces.dao;

import java.util.ArrayList;
import java.util.Comparator;
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
			System.out.println(list);
			index++;
			return true;
		}
		
		
		
		return false;
	}

	@Override
	public void deleteByName(String name) {

		System.out.println("Running delete method in PoliticalDAOImplementor "+name);
		
		if(name!=null)
		{
			Iterator <PoliticalPartyDTO>  iterater=list.listIterator();
			while(iterater.hasNext())
			{
				PoliticalPartyDTO dto=(PoliticalPartyDTO)iterater.next();
				if(dto.getName().equals(name))
				{
					iterater.remove();
					System.out.println(list.size());
					return;
				}
				
			}
		}
		
	}

	@Override
	public List<PoliticalPartyDTO> sort(Comparator<PoliticalPartyDTO> comparator) {

		if(comparator!=null)
		{
			list.sort(comparator);
			return list;
		}
		return null;
	}
	
	
	/*
	 * public void addingDTOelementsTOcollection(PoliticalPartyDTO dto) {
	 * list.add(dto); } public void iterater() { System.out.println("Iterater");
	 * 
	 * Iterator<PoliticalPartyDTO> h=list.iterator();
	 * 
	 * while(h.hasNext()) { System.out.println(h.next()); } }
	 */
	
	
	
	

}
