package in.scalive.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.scalive.model.User;
import in.scalive.repository.UserRepository;

@Service
public class UsertService {

	private UserRepository repo;

	@Autowired
	public UsertService(UserRepository repo) {
		this.repo = repo;

	}
    public List<User> getUsersPaginated(int pageNumber){
    	Pageable pageable=PageRequest.of(pageNumber, 3,Sort.by("sal").descending());
    	Page page=repo.findAll(pageable);
    	if(page.hasContent()==true)
    		return page.getContent();
    	else
    		return null;
    	
    }
}
