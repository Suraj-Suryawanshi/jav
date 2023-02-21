package vesit.mca.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import vesit.mca.springboot.entity.course;

@Service
public class courseservices {
	
	List<course> list;
	
	public courseservices() {
	  list = new ArrayList<>();
	  list.add(new course(135,"AJAVA","It teaches Advance Java"));
	  list.add(new course(532,"ADBMS","It teaches Advance DBMS"));
	}

	public List<course> getcourses()
	{
		return list;
	}
	
	public course getcourse(int id)
	{
		return list.get(id);
	}

}
