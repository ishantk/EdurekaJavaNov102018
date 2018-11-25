package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

class Employee{
	
	int eid;
	String name;
	int salary;
	
	Employee(){
		
	}
	
	Employee(int eid, String name, int salary){
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	void showEmployee(){
		System.out.println(eid+" belongs to "+name+" and withdraws \u20b9"+salary);
	}
	
	// Override toString method if you do not want hashCodes
	public String toString(){
		return eid+","+name+","+salary+"\n";
	}
	
}

public class FileIODemo {

	void writeInFile(String data){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/","myemployees.csv");

			// write the data in the form of bytes in a File
			//FileOutputStream fos = new FileOutputStream(file);	// overwrite content of file
			FileOutputStream fos = new FileOutputStream(file,true); // append mode
			
			/*if(file.exists()){
				System.out.println(file.getName()+" exists");
			}else{
				System.out.println(file.getName()+" does not exists");
			}*/
			
			fos.write(data.getBytes());
			fos.close(); // release the memory resources
			System.out.println(">> Data Written in "+file.getName());
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
			e.printStackTrace();
		}
	}
	
	void writeInFileAgain(String data){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/","youremployees.csv");

			// write the data in the form of text in a File
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file,true); // append mode
			
			/*if(file.exists()){
				System.out.println(file.getName()+" exists");
			}else{
				System.out.println(file.getName()+" does not exists");
			}*/
			
			writer.write(data);
			writer.close();
			System.out.println(">> Data Written in "+file.getName());
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
			e.printStackTrace();
		}
	}
	
	void readFromFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/","youremployees.csv");
			
			// Read the data in the form of bytes
			FileInputStream fis = new FileInputStream(file);
			
			int i = 0;
			while((i = fis.read()) != -1){ // -1 is end of file
				char ch = (char)i; // Casting byte as char
				System.out.print(ch);
			}
			
			fis.close();
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
			e.printStackTrace();
		}
	}
	
	void readFromFileAgain(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/","youremployees.csv");
			
			// Read the data in the form of text
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader); // read the data line by line from file
			
			String line = "";
			while((line = buffer.readLine()) != null){
				System.out.println(line);
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		/*Employee emp1 = new Employee(101,"John",50000);
		Employee emp2 = new Employee(201,"Fionna",60000);
		
		emp1.showEmployee();
		emp2.showEmployee();
		
		System.out.println(emp1);
		System.out.println(emp2.toString());*/

		FileIODemo io = new FileIODemo();
		//io.writeInFile(emp1.toString());
		//io.writeInFileAgain(emp1.toString());
		//io.writeInFileAgain(emp2.toString());
		//io.readFromFile();
		io.readFromFileAgain();
	}

}
