public class Trainiee {
    int eid;
    String ename;
 private static final String COHORT_CODE = "CHNAJI9004"; 
  public Trainiee (int eid, String ename)
  {
	  super();
	  this.eid=eid;
	  this.ename=ename;
  }
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
 void display()
 {
	 System.out.println(getEid()+ COHORT_CODE+"\n");
 }
 }