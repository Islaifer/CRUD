package controller;

import java.util.ArrayList;
import java.util.List;

import model.Enterprise;

public class EnterpriseController {
	private List<Enterprise> list;
	
	public EnterpriseController() {
		this.list = new ArrayList<Enterprise>();
	}
	
	public EnterpriseController(List<Enterprise> list) {
		this.list = list;
	}
	
	public void add(Enterprise data) {
		this.list.add(data);
	}
	
	public void addAndSave(Enterprise data) {
		this.list.add(data);
	}
	
	public void rem() {
		if(this.list.size()>0) {
			this.list.remove(this.list.size()-1);
		}else {
			System.err.println("Lista vazia!");
		}
	}
	
	public void rem(int index) {
		if(this.list.size()>index && index>=0) {
			this.list.remove(index);
		}else {
			System.err.println("Posição inválida");
		}
	}
	
	public Enterprise getElement(int index) {
		if(this.list.size()>index && index>=0) {
			return this.list.get(index);
		}else {
			return null;
		}
	}
	
	public Enterprise getElementById(int id) {
		Enterprise data = null;
		for(int i = 0; i<this.list.size(); i++) {
			if(this.list.get(i).getId()==id) {
				data = this.list.get(i);
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
		int a;
		String ids = "";
		if(this.list.size()>0) {
			StringBuffer buffer = new StringBuffer();
			StringBuffer bufferId = new StringBuffer();
			do {
				a = 0;
				List<Integer> idsPartners = this.list.get(s).getIdPartners();
				if(idsPartners.size()>0) {
					do {
						bufferId.append(idsPartners.get(a) + ",");
					}while(idsPartners.size()>a);
					ids = bufferId.toString();
				}
				buffer.append(this.list.get(s).getId() + ";" + ids + ";" + this.list.get(s).getNameEnterprise() + 
						";" + this.list.get(s).getNameFantasy() + ";" + this.list.get(s).getTfe() + 
						";" + this.list.get(s).getCnpj() + ";" + this.list.get(s).getCnae() + ";" +
						";" + this.list.get(s).getNire() + ";" + this.list.get(s).getCcm() + ";" +
						";" + this.list.get(s).getEstadualSubscribe() + ";" + this.list.get(s).getIss() +
						";" + this.list.get(s).getJuridicalNature() + ";" + this.list.get(s).getTributs() +
						";" + this.list.get(s).getRegistry() + ";" + this.list.get(s).getNeigh() + ";" +
						";" + this.list.get(s).getNeigh() + ";" + this.list.get(s).getHouseNumber() +
						";" + this.list.get(s).getComplement() + ";" + this.list.get(s).getCep() +
						";" + this.list.get(s).getCity() + ";" + this.list.get(s).getCounty() +
						";" + this.list.get(s).getTel() + ";" + this.list.get(s).getEmail() + "\n");
				s++;
			}while(this.list.size()>s+1);
			mostra = buffer.toString();
		}else {
			mostra = "Lista vazia!";
		}
		return mostra;
	}
}
