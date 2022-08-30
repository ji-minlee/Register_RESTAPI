package kr.ac.kopo.ctc.spring.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.ac.kopo.ctc.spring.register.domain.RegisterItem;

public interface RegisterItemRepository extends JpaRepository<RegisterItem, Long> {

}
