package collegeFaculty;

import java.util.ArrayList;

public class PermanentFaculty extends Faculty {
 
    private double bonus;
    private double hra ;
 
    private ArrayList<PermanentFaculty> faculty = new ArrayList<>();
    
    public void add(PermanentFaculty p)
    {
     faculty.add(p);
    }
    
	public ArrayList<PermanentFaculty> getFaculty() {
		return faculty;
	}

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	
	public void search(int id) {
		
	  for(Faculty f:faculty)
	  {
		  if(id == f.getId())
		  {
			  System.out.println("name = " +f.getName()+ ", course =" +f.getCourse()+", Age = " +f.getAge()
			  +", salary = " +f.getSal() + "Permanent Employee");
			  break;
		  }else
		  {
			  System.out.println("not found");
		  }
	  }
	}

	
	public int getTotalCountOfFaculty() {
		int size =faculty.size();
		return size;
	}

}
