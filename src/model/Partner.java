package model;

import java.util.Date;

public class Partner {
	private int id;
	private String namePartner;
	private String rg;
	private String cpf;
	private String cnh;
	private String pis;
	private Date dateB;
	private String adrress;
	private String neigh;
	private String cep;
	private String city;
	private String nameDad;
	private String nameMother;
	private String voter;
	private Date dateRg;
	private String emitterRg;
	private String status;
	private String participation;
	private String nat;
	private String position;

	// constructor with parameters
	public Partner(int id, String namePartner, String rg, String cpf, String cnh, String pis, Date dateB,
			String adrress, String neigh, String cep, String city, String nameDad, String nameMother, String voter,
			Date dateRg, String emitterRg, String status, String participation, String nat, String position) {
		this.id = id;
		this.namePartner = namePartner;
		this.rg = rg;
		this.cpf = cpf;
		this.cnh = cnh;
		this.pis = pis;
		this.dateB = dateB;
		this.adrress = adrress;
		this.neigh = neigh;
		this.cep = cep;
		this.city = city;
		this.nameDad = nameDad;
		this.nameMother = nameMother;
		this.voter = voter;
		this.dateRg = dateRg;
		this.emitterRg = emitterRg;
		this.status = status;
		this.participation = participation;
		this.nat = nat;
		this.position = position;

	}

	// constructor no parameters
	public Partner() {
		super();
	}

	// getters and setters methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamePartner() {
		return namePartner;
	}

	public void setNamePartner(String namePartner) {
		this.namePartner = namePartner;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public Date getDateB() {
		return dateB;
	}

	public void setDateB(Date dateB) {
		this.dateB = dateB;
	}

	public String getAdrress() {
		return adrress;
	}

	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}

	public String getNeigh() {
		return neigh;
	}

	public void setNeigh(String neigh) {
		this.neigh = neigh;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNameDad() {
		return nameDad;
	}

	public void setNameDad(String nameDad) {
		this.nameDad = nameDad;
	}

	public String getNameMother() {
		return nameMother;
	}

	public void setNameMother(String nameMother) {
		this.nameMother = nameMother;
	}

	public String getVoter() {
		return voter;
	}

	public void setVoter(String voter) {
		this.voter = voter;
	}

	public Date getDateRg() {
		return dateRg;
	}

	public void setDateRg(Date dateRg) {
		this.dateRg = dateRg;
	}

	public String getEmitterRg() {
		return emitterRg;
	}

	public void setEmitterRg(String emitterRg) {
		this.emitterRg = emitterRg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getParticipation() {
		return participation;
	}

	public void setParticipation(String participation) {
		this.participation = participation;
	}

	public String getNat() {
		return nat;
	}

	public void setNat(String nat) {
		this.nat = nat;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		String retorna = (this.id + ";" + this.namePartner + ";" + this.rg + ";" + this.cpf + ";" + this.cnh + ";"
				+ this.pis + ";" + this.dateB + ";" + this.adrress + ";" + this.neigh + ";" + this.cep + ";" + this.city
				+ ";" + this.nameDad + ";" + this.nameMother + ";" + this.voter + ";" + this.dateRg + ";"
				+ this.emitterRg + ";" + this.status + ";" + this.participation + ";" + this.nat + ";" + this.position
				+ ";" + "\n");
		return retorna;
	}
}
