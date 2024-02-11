package com.gym.phoenixgym.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gym.phoenixgym.entity.Member;


public interface MemberDao extends JpaRepository<Member,String>{
	
public List<Member> findByEmailAndPassword(String email,String password);
	
	
	public List<Member> findByEmail(String email);
	public List<Member> findByPhone(String phone);
	
	public List<Member> findByEmailAndSecurityQuesAndSecurityAns(String email,String securityQues,String securityAns);
}
