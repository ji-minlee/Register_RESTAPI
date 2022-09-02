package kr.ac.kopo.ctc.spring.register.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.spring.register.domain.RegisterItem;


@Repository
public interface RegisterItemRepository extends JpaRepository<RegisterItem, Long> , JpaSpecificationExecutor<RegisterItem> {
	

	
	//회원id 기준으로 특정 회원 정보 보기
	Optional<RegisterItem> findByUserId(String userId);

	void deleteByUserId(String userId);

	
}
