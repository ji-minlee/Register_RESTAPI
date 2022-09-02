package kr.ac.kopo.ctc.spring.register.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.ctc.spring.register.domain.RegisterItem;
import kr.ac.kopo.ctc.spring.register.repository.RegisterItemRepository;


@Service
public class RegisterItemService {
	
	@Autowired
	private RegisterItemRepository registerItemRepository;
	
	public void setRegisterItemRepository(RegisterItemRepository registerItemRepository) {
		this.registerItemRepository = registerItemRepository;
	}
	
	//회원 등록
	public RegisterItem save(RegisterItem registerItem) {
		return registerItemRepository.save(registerItem);
	}
	
	//전체 보기
	public List<RegisterItem> findAll() {
		return registerItemRepository.findAll();
	}
	
	//특정 회원 정보 보기
	public Optional<RegisterItem> findOne(String userId) {
		return registerItemRepository.findByUserId(userId);
		
	}
	
	public RegisterItem update(RegisterItem registerItem) {
		
		RegisterItem userNow = registerItemRepository.findByUserId(registerItem.getUserId()).get();
		
		if(userNow == null) {
			return null;
		}
		
		userNow.setUserId(registerItem.getUserId());
		userNow.setPassword(registerItem.getPassword());
		userNow.setName(registerItem.getName());
		userNow.setBirthday(registerItem.getBirthday());
		userNow.setAddress(registerItem.getAddress());
		userNow.setPhone(registerItem.getPhone());
		
		save(userNow);
		
		return userNow;
	}
	
	
	
	//삭제
	public void delete(String userId) {
		registerItemRepository.deleteByUserId(userId);
	}

	
	
	
	
}
