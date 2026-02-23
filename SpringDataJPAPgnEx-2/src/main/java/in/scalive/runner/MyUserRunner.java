package in.scalive.runner;

import java.util.List;
import java.util.Optional;

import javax.xml.transform.Source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.scalive.model.User;
import in.scalive.service.UsertService;
@Component
public class MyUserRunner implements CommandLineRunner {
	@Autowired
	private UsertService serv;

	@Override
	public void run(String... args) throws Exception {
	  int i=0;
		while(true) {
		  List <User>userList=serv.getUsersPaginated(i);
		  if(userList.size()==0)
			  break;
		  System.out.println("Page Number:"+i);
		  System.out.println("=================");
		  for(User user:userList) {
			  System.out.println(user);
		  }
		  i++;
		  System.out.println();
		  
	  }
	  
	}

}
