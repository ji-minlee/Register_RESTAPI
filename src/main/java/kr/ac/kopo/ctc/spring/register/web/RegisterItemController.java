package kr.ac.kopo.ctc.spring.register.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.ctc.spring.register.domain.RegisterItem;
import kr.ac.kopo.ctc.spring.register.repository.RegisterItemRepository;

@RestController
@RequestMapping("/api")
public class RegisterItemController {
	@GetMapping("welcome")
	   public String apiWelcome() {
	      System.out.println("RegisterItemController Welcome");
	      return "RegisterItemController Welcome";
	   }
	   
	   @GetMapping("test")
	   public String test() {
	      return "RegisterItemController Test";
	   }
	   @Autowired
	   private RegisterItemRepository registerItemRepository;

	   public List<RegisterItem> list(Model model) {
	      return registerItemRepository.findAll();
	   }
	}
