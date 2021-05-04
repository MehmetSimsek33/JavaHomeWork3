
public class Instructor extends User 
{
	private String unit;
	private String personelNumber;
	
	
	public Instructor(int id, String firsName, String lastName, String email, String unit, String personelNumber) {
		super(id, firsName, lastName, email);
		this.unit = unit;
		this.personelNumber = personelNumber;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPersonelNumber() {
		return personelNumber;
	}
	public void setPersonelNumber(String personelNumber) {
		this.personelNumber = personelNumber;
	}
}
