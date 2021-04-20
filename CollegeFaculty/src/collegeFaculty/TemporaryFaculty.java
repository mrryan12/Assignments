package collegeFaculty;

import java.util.ArrayList;

public class TemporaryFaculty extends Faculty {
	private String duration;
	 
	  private ArrayList<TemporaryFaculty> faculty = new ArrayList<>();
	  
	  public void add(TemporaryFaculty t)
	    {
	     faculty.add(t);
	    }

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	
	public void search(int id) {
		
		 for(Faculty f:faculty)
		  {
			  if(id == f.getId())
			  {
				  System.out.println("name = " +f.getName()+ ", course =" +f.getCourse()+", Age = " +f.getAge()
				  +", salary = " +f.getSal() + "Temporary Employee");
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
