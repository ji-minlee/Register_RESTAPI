package kr.ac.kopo.ctc.spring.register.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegisterItem {
	//Column : column으로 1대1 매칭
		//id :  hibernate가 구분자로 사용
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		private Long id;
		
		@Column
		private String userId;
		
		@Column
		private String password;
		
		@Column
		private String name;
		
		@Column 
		private Date birthday;
		
		@Column 
		private String address;
		
		@Column
		private Long phone;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		
		
		
		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getPassword() {
			return password;
		}

		

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getBirthday() {
			return birthday;
		}

		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Long getPhone() {
			return phone;
		}

		public void setPhone(Long phone) {
			this.phone = phone;
		}

}
