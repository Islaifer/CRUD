package model;

public class Enterprise {
	private String nameEnterprise;
	private String nameFantasy;
	private String tfe;
	private String cnpj;
	private String cnae;
	private String nire;
	private String ccm;
	private String estadualSubscribe;
	private String iss;
	private String juridicalNature;
	private String tributs;
	private String registry;
	private String neigh;
	private String street;
	private String houseNumber;
	private String complement;
	private String cep;
	private String city;
	private String county;
	private String tel;
	private String email;
	
	//constructor with parameters
	public Enterprise(String nameEnterprise, String nameFantasy, String tfe, String cnpj,
			 String cnae, String nire, String ccm, String estadualSubscribe, String iss,
			 String juridicalNature, String tributs, String registry, String neigh,
			 String street, String houseNumber, String complement, String cep,
			 String city, String county, String tel, String email) {
		this.nameEnterprise = nameEnterprise;
		this.nameFantasy = nameFantasy;
		this.tfe = tfe;
		this.cnpj = cnpj;
		this.cnae = cnae;
		this.nire = nire;
		this.ccm = ccm;
		this.estadualSubscribe = estadualSubscribe;
		this.iss = iss;
		this.juridicalNature = juridicalNature;
		this.tributs = tributs;
		this.registry = registry;
		this.neigh = neigh;
		this.street = street;
		this.houseNumber = houseNumber;
		this.complement = complement;
		this.cep = cep;
		this.city = city;
		this.county = county;
		this.tel = tel;
		this.email = email;
	}
	
	//constructor no parameters
	public Enterprise() {
		super();
	}

	//getters and setters methods 
	public String getNameEnterprise() {
		return nameEnterprise;
	}

	public void setNameEnterprise(String nameEnterprise) {
		this.nameEnterprise = nameEnterprise;
	}

	public String getNameFantasy() {
		return nameFantasy;
	}

	public void setNameFantasy(String nameFantasy) {
		this.nameFantasy = nameFantasy;
	}

	public String getTfe() {
		return tfe;
	}

	public void setTfe(String tfe) {
		this.tfe = tfe;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnae() {
		return cnae;
	}

	public void setCnae(String cnae) {
		this.cnae = cnae;
	}

	public String getNire() {
		return nire;
	}

	public void setNire(String nire) {
		this.nire = nire;
	}

	public String getCcm() {
		return ccm;
	}

	public void setCcm(String ccm) {
		this.ccm = ccm;
	}

	public String getEstadualSubscribe() {
		return estadualSubscribe;
	}

	public void setEstadualSubscribe(String estadualSubscribe) {
		this.estadualSubscribe = estadualSubscribe;
	}

	public String getIss() {
		return iss;
	}

	public void setIss(String iss) {
		this.iss = iss;
	}

	public String getJuridicalNature() {
		return juridicalNature;
	}

	public void setJuridicalNature(String juridicalNature) {
		this.juridicalNature = juridicalNature;
	}

	public String getTributs() {
		return tributs;
	}

	public void setTributs(String tributs) {
		this.tributs = tributs;
	}

	public String getRegistry() {
		return registry;
	}

	public void setRegistry(String registry) {
		this.registry = registry;
	}

	public String getNeigh() {
		return neigh;
	}

	public void setNeigh(String neigh) {
		this.neigh = neigh;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
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

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
