package controller;

import java.util.ArrayList;
import java.util.List;

import model.Partner;

public class PartnerController {

	private List<Partner> list;

	public PartnerController() {
		this.list = new ArrayList<Partner>();
	}

	public PartnerController(List<Partner> list) {
		this.list = list;
	}

	public void add(Partner data) {
		this.list.add(data);

	}

	public void addAndSave(Partner data) {
		this.list.add(data);

	}

	public void rem() {
		if (this.list.size() > 0) {
			this.list.remove(this.list.size() - 1);
		} else {
			System.err.println("Lista vazia!");

		}
	}

	public void rem(int index) {
		if (this.list.size() > index && index >= 0) {
			this.list.remove(index);
		} else {
			System.err.println("Posição inválido!");

		}
	}

	public Partner getElement(int index) {
		if(this.list.size()>index && index>=0 ) {
			return this.list.get(index);
		}else {
		return null;
		}
	}
	
	public Partner getElementById(int id) {
		Partner data = null;
		for(int i =0; i<this.list.size();i++) {
			if(this.list.get(i).getId()==i) {
				data = this.list.get(id);
				break;
			}
		}
		return data;
	}
	
 	public int size() {
		return this.list.size();
	}
	
	@Override
	public String toString() {
		String mostra;
		int s = 0;
		if (this.list.size() > 0) {
			StringBuffer buffer = new StringBuffer();
			do {
				buffer.append(this.list.get(s).getId() + ";" + this.list.get(s).getNamePartner() + ";"
						+ this.list.get(s).getRg() + ";" + this.list.get(s).getCpf() + ";" + this.list.get(s).getCnh()
						+ ";" + this.list.get(s).getPis() + ";" + this.list.get(s).getDateB() + ";"
						+ this.list.get(s).getAdrress() + ";" + this.list.get(s).getNeigh() + ";"
						+ this.list.get(s).getCep() + ";" + this.list.get(s).getCity() + ";"
						+ this.list.get(s).getNameDad() + ";" + this.list.get(s).getNameMother() + ";"
						+ this.list.get(s).getVoter() + ";" + this.list.get(s).getDateRg() + ";"
						+ this.list.get(s).getEmitterRg() + ";" + this.list.get(s).getStatus() + ";"
						+ this.list.get(s).getParticipation() + ";" + this.list.get(s).getNat() + ";"
						+ this.list.get(s).getPosition() + ";" + "\n");
				s++;
			} while (this.list.size() > s + 1);
			mostra = buffer.toString();
		} else {
			mostra = "lista vazia";
		}
		return mostra;
	}








}
