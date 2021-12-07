package com.example.demo.layer3;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Admin;
import com.example.demo.layer2.Flight;

@Repository
public class AdminRepositoryImpl extends BaseRepository implements AdminRepository {

	@Transactional
	public void insertAdmin(Admin aobj) {
		super.persist(aobj);
		
	}

	@Transactional
	public void addFlight(Flight FlightId) {
		super.persist(FlightId);
		
	}

	@Override
	public void updateFlight(Flight fobj) {
	super.merge(fobj);
	}

	
	
	
//	
//	
//
//import com.example.demo.layer2.User;
//@Repository
//public class UserRepoImpl extends BaseRepository implements UserRepo {
//
//@Transactional
//public void insertUser(User uobj) {
//super.persist(uobj);
//
//}
//
//@Override
//public User selectUser(int uno) {
//User user = super.find(User.class, uno);
//return user;
//}
//
//@Override
//public List<User> selectUsers() {
//List<User>  userList = new ArrayList<>();
//return super.findAll("User");
//}
//
//@Transactional
//public void updateUser(User uobj) {
//super.merge(uobj);
//}
//
//
//@Transactional
//public void deleteUser(int uno) {
//super.remove(User.class, uno);
//
//}
//
//}


	
	
	
	
	
	
}
