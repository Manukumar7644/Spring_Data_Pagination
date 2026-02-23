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
	  List<User>userList=serv.getUsersPaginated();
	  for(User u:userList) {
		  System.out.println(u);
	  }
	
	}

}
