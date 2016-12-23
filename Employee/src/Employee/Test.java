package Employee;
import java.io.Serializable;

public class Test implements Serializable {
	private int id,emi,exp;
	long salary,loan;
	int ms;
	private String name,location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public long getLoan()
	{
		return loan;
	}
	public void setLoan(long loan)
	{
	  this.loan=loan;
	}
	public long getSalary()
	{
		return salary;
	}
	public void setSalary(long salary)
	{
		this.salary=salary;
	}
	public int getEmi()
	{
		return emi;
	}
	public void setEmi(int emi)
	{
		this.emi=emi;
	}
	public int getExp()
	{
		return exp;
	}
	public void setExp(int exp)
	{
		this.exp=exp;
	}
	public int getMs()
	{
		return ms;
	}
	public void setMs(int ms)
	{
		this.ms=ms;
	}

}
