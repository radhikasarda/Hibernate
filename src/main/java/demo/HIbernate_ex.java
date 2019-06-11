package demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HIbernate_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Student student=new Student();
	    	student.setMarks(80);
	    	student.setName("Raghav");
	    	student.setRoll(1);
	    	
	    	
	    	Configuration con=new Configuration().configure();
	    	
	    	SessionFactory sf=con.buildSessionFactory();
	    	Session session=sf.openSession();
	    	session.beginTransaction();
	    	
	    	
	    	session.save(student);
	    	session.getTransaction().commit();
	    	
	}

}
