import java.util.ArrayList;

public class Player1 {
private String name;
private String Country;
private String Skill;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public String getSkill() {
	return Skill;
}
public void setSkill(String skill) {
	Skill = skill;
}
public Player1(String name, String Country, String Skill) {
	super();
	this.name = name;
	this.Country = Country;
	this.Skill = Skill;
}
 public String toString() { 
	return String.format("%-15s %-15s %-15s", name, Country, Skill);
 }
 }