package kr.ac.kopo.ctc.spring.register.web;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.ac.kopo.ctc.spring.register.domain.RegisterItem;
import kr.ac.kopo.ctc.spring.register.service.RegisterItemService;

@Api(tags = "register")
@RestController
@RequestMapping("/api")
public class RegisterItemController {	 
	   
	   @Autowired
	   private RegisterItemService registerItemService;
	  
	   
	   @ApiOperation(value = "회원 등록", notes = "회원 등록 API")
	   @PostMapping(value = "/create")
	   public RegisterItem create(Model model, @RequestBody RegisterItem registerItem) {
		
		   return registerItemService.save(registerItem);
	   }

	   
	   @ApiOperation(value = "readAll", notes = "전체 회원 정보")
	   @GetMapping(value = "/readAll")
	   public List<RegisterItem> selectAll() {
		   List<RegisterItem> registerItem = registerItemService.findAll();
		   return registerItem;
	   }
	   
	   
	   @ApiOperation(value = "회원 ID로 조회하기", notes = "특정ID 회원 정보")
	   @GetMapping(value = "/list/{userId}")
	   public Optional<RegisterItem> selectByUserId(@PathVariable String userId) {
		   return registerItemService.findOne(userId);
	   }
	   
	   @PutMapping(value="/update") // UpdateAll, PUT
		public ResponseEntity<RegisterItem> updateUser(Model model, @RequestBody RegisterItem registerItem) {
				

		   RegisterItem userUpdated = registerItemService.update(registerItem);

				return new ResponseEntity<RegisterItem>(userUpdated, HttpStatus.OK);
		}
		


		
		@DeleteMapping(value="/delete") //DELETE
		@Transactional
		public String delete(Model model, @RequestParam(value = "id") String userId) {
			registerItemService.delete(userId);
			return "삭제가 되었습니다.";
		}
	}
