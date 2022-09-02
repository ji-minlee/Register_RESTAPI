//package kr.ac.kopo.ctc.spring.register.service;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.stereotype.Service;
//
//import kr.ac.kopo.ctc.spring.register.domain.RegisterItem;
//import kr.ac.kopo.ctc.spring.register.repository.RegisterItemRepository;
//
//
//public class RegisterItemServiceImpl implements RegisterItemService{
//	
//	RegisterItem registerItem;
//	
//	RegisterItemRepository registerItemRepository;
//	
//	
//	public void setRegisterItemRepository(RegisterItemRepository registerItemRepository) {
//		this.registerItemRepository = registerItemRepository;
//	}
//
//	@Override
//	public List<RegisterItem> showAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public RegisterItem showOne(String userId) {
//		return registerItemRepository.findByUserId(userId);
//		
//	}
//
////	@Override
////	public List<RegisterItem> update(RegisterItem registerItem) {
////		List<RegisterItem> updateRegisterItem = registerItemRepository.findByUserId(registerItem.getUserId());
////		
////		return registerItemRepository.saveAll(updateRegisterItem);
////	}
////
////
////	@Override
////	public List<RegisterItem> updatePassword(String userId) {
////		List<RegisterItem> updatePassword = registerItemRepository.findByUserId(userId);
////		((RegisterItem) updatePassword).setPassword("newpassword");
////		return updatePassword;
////	}
//	
//	@Override
//	public RegisterItem update(RegisterItem registerItem) {
//		
//		RegisterItem userNow = registerItemRepository.findByUserId(registerItem.getUserId());
//		
//		if(userNow == null) {
//			return null;
//		}
//		
//		userNow.setUserId(registerItem.getUserId());
//		userNow.setPassword(registerItem.getPassword());
//		userNow.setName(registerItem.getName());
//		userNow.setBirthday(registerItem.getBirthday());
//		userNow.setAddress(registerItem.getAddress());
//		userNow.setPhone(registerItem.getPhone());
//		
//		registerItemRepository.save(userNow);
//		
//		return userNow;
//	}
//	
//	@Override
//	public RegisterItem patch(RegisterItem registerItem) {
//		
//		RegisterItem patchedUser = registerItemRepository.findByUserId(registerItem.getUserId());
//		
//		if(patchedUser == null) {
//			return null;
//		}
//		
//		if(registerItem.getAddress() != null) {
//			patchedUser.setAddress(registerItem.getAddress());
//		}
//		
//		if(registerItem.getBirthday() != null) {
//			patchedUser.setBirthday(registerItem.getBirthday());
//		}
//		
//		if(registerItem.getName() != null) {
//			patchedUser.setName(registerItem.getName());
//		}
//		
//		if(registerItem.getPassword() != null) {
//			patchedUser.setPassword(registerItem.getPassword());
//		}
//		
//		if(registerItem.getPhone() != null) {
//			patchedUser.setPhone(registerItem.getPhone());
//		}
//				
//		registerItemRepository.save(patchedUser);
//		
//		return patchedUser;
//	}
//	
//	
//	@Transactional
//	@Override
//	public void delete(String userId) {
//		registerItemRepository.deleteByUserId(userId);
//	}
//
//	
//
//}
