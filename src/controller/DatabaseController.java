package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import model.Enterprise;
import model.Partner;

public class DatabaseController {
	
	/*----------------------------Partner-----------------------------------*/
	public PartnerController getPartnerDatas() throws IOException, ParseException {
		verifMainDir();
		PartnerController controller = new PartnerController();
		String path = "C:\\CRUD\\partners.csv";
		File dir = new File(path);
		if(!dir.exists()) {
			System.err.println("Table not exist!");
		}else {
			FileInputStream flow = new FileInputStream(dir);
			InputStreamReader stream = new InputStreamReader(flow);
			BufferedReader reader = new BufferedReader(stream);
			String aux = reader.readLine();
			aux = reader.readLine();
			while(aux!=null) {
				String [] vet = aux.split(";");
				int id = Integer.parseInt(vet[0]);
				DateFormat df = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy", Locale.ENGLISH);
				Date dateB = df.parse(vet[6]);
				Date dateRg = df.parse(vet[14]);
				Partner data = new Partner(id, vet[1], vet[2], vet[3], vet[4], vet[5], dateB,
						vet[7], vet[8], vet[9], vet[10], vet[11], vet[12], vet[13], dateRg, vet[15], vet[16],
						vet[17], vet[18], vet[19]);
				controller.add(data);
				aux = reader.readLine();
			}
			reader.close();
			stream.close();
			flow.close();
		}
		return controller;
	}
	
	public void savePartner(Partner data) throws IOException {
		verifMainDir();
		String path = "C:\\CRUD\\partners.csv";
		File dir = new File(path);
		if(dir.exists()) {
			String save = data.toString();
			FileWriter writer = new FileWriter(dir);
            PrintWriter printer = new PrintWriter(writer, true);
            printer.write(save);
            printer.flush();
            printer.close();
            writer.close();
		}else {
			String save = "id;namePartner;rg;cpf;cnh;pis;dateB;adrress;neigh;cep;"
					+ "city;nameDad;nameMother;voter;dateRg;emitterRg;status;participation;nat;position\n";
			save += data.toString();
			FileWriter writer = new FileWriter(dir);
            PrintWriter printer = new PrintWriter(writer);
            printer.write(save);
            printer.flush();
            printer.close();
            writer.close();
		}
	}
	
	public void editOrDeletePartner(PartnerController controller) throws IOException {
		verifMainDir();
		String dir = "C:\\CRUD\\enterprises.csv";
		String save = "id;idPartners;nameEnterprise;nameFantasy;tfe;cnpj;cnae;nire;ccm;"
				+ "estadualSubscribe;iss;juridicalNature;tributs;registry;neigh;street;"
				+ "houseNumber;complement;cep;city;county;tel;email\n";
		save += preparePartner(controller);
		FileWriter writer = new FileWriter(dir);
        PrintWriter printer = new PrintWriter(writer);
        printer.write(save);
        printer.flush();
        printer.close();
        writer.close();
	}
	
	/*--------------------------Enterprise-----------------------------------*/
	public EnterpriseController getEnterpriseDatas() throws IOException {
		verifMainDir();
		EnterpriseController controller = new EnterpriseController();
		String path = "C:\\CRUD\\enterprises.csv";
		File dir = new File(path);
		if(!dir.exists()) {
			System.err.println("Table not exist!");
		}else {
			FileInputStream flow = new FileInputStream(dir);
			InputStreamReader stream = new InputStreamReader(flow);
			BufferedReader reader = new BufferedReader(stream);
			String aux = reader.readLine();
			aux = reader.readLine();
			while(aux!=null) {
				String [] vet = aux.split(";");
				List<Integer> ids = new ArrayList<Integer>();
				String [] vetIds = vet[1].split(",");
				for(String id : vetIds) {
					int _id = Integer.parseInt(id);
					ids.add(_id);
				}
				int id = Integer.parseInt(vet[0]);
				Enterprise data = new Enterprise(id, ids, vet[2], vet[3], vet[4], vet[5], vet[6], vet[7],
						vet[8], vet[9], vet[10], vet[11], vet[12], vet[13], vet[14], vet[15], vet[16], vet[17],
						vet[18], vet[19], vet[20], vet[21], vet[22]);
				controller.add(data);
				aux = reader.readLine();
			}
			reader.close();
			stream.close();
			flow.close();
		}
		return controller;
	}
	
	public void saveEnterprise(Enterprise data) throws IOException {
		verifMainDir();
		String path = "C:\\CRUD\\enterprises.csv";
		File dir = new File(path);
		if(dir.exists()) {
			String save = data.toString();
			FileWriter writer = new FileWriter(dir);
            PrintWriter printer = new PrintWriter(writer, true);
            printer.write(save);
            printer.flush();
            printer.close();
            writer.close();
		}else {
			String save = "id;idPartners;nameEnterprise;nameFantasy;tfe;cnpj;cnae;nire;ccm;"
					+ "estadualSubscribe;iss;juridicalNature;tributs;registry;neigh;street;"
					+ "houseNumber;complement;cep;city;county;tel;email\n";
			save += data.toString();
			FileWriter writer = new FileWriter(dir);
            PrintWriter printer = new PrintWriter(writer);
            printer.write(save);
            printer.flush();
            printer.close();
            writer.close();
		}
	}
	
	public void editOrDeleteEnterprise(EnterpriseController controller) throws IOException {
		verifMainDir();
		String dir = "C:\\CRUD\\enterprises.csv";
		String save = "id;idPartners;nameEnterprise;nameFantasy;tfe;cnpj;cnae;nire;ccm;"
				+ "estadualSubscribe;iss;juridicalNature;tributs;registry;neigh;street;"
				+ "houseNumber;complement;cep;city;county;tel;email\n";
		save += prepareEnterprise(controller);
		FileWriter writer = new FileWriter(dir);
        PrintWriter printer = new PrintWriter(writer);
        printer.write(save);
        printer.flush();
        printer.close();
        writer.close();
	}
	
	/*--------------------------------privates--------------------------------------*/
	
	private void verifMainDir() {
		String path = "C:\\CRUD";
		File dir = new File(path);
		if(!dir.exists() || !dir.isDirectory()) {
			if(dir.mkdir()) {
				System.out.println("Dir create success!");
			}else {
				System.err.println("Error on dir create!");
			}
		}
	}
	
	private String prepareEnterprise(EnterpriseController controller) {
		String preparo = controller.toString();		
		return preparo;
	}
	
	private String preparePartner(PartnerController controller) {
		String preparo = controller.toString();		
		return preparo;
	}
}
