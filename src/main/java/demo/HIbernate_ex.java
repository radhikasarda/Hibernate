package demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HIbernate_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		Student_name sname=new Student_name();
		
		sname.setFname("Prajjwal");
		sname.setMname("Kumar");
		sname.setLname("Singh");
		
		
		
		
		//Student s=new Student();
		Student student= new Student();
		student.setMarks(95);
		student.setRoll(1);
		student.setName(sname);
		
		//Student s1,s2;
		//s1=new Student(2,"Sajal",94);
		
		
	    	
	    	
	    	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
	    	
	    	SessionFactory sf=con.buildSessionFactory();
	    	Session session=sf.openSession();
	    	session.beginTransaction();
	    	
	    	//update
	    	// Student stuObj = (Student) session.get(Student.class, 2);
	         //   stuObj.setName("Radhika");
	         //   stuObj.setMarks(92);
	    	
	    	//remove
	    	//Student stu =  (Student) session.get(Student.class,5 );
	       // session.delete(stu);
	            
	            
	            
	            session.save(student);
	    	//s=(Student) session.get(Student.class,1);
	   // session.save(s1);
	    	// session.save(s);
	    	session.getTransaction().commit();
	    	System.out.println(student);
	    	
	}

}
