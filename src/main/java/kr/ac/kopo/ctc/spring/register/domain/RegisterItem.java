package kr.ac.kopo.ctc.spring.register.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;


@Entity
public class RegisterItem {
	//Column : column으로 1대1 매칭
		//id :  hibernate가 구분자로 사용
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		@ApiModelProperty(value = "id")
		private Long id;
		
		@Column
		@ApiModelProperty(value = "사용자 id")
		private String userId;
		
		@Column
		@ApiModelProperty(value = "비밀번호")
		private String password;
		
		@Column
		@ApiModelProperty(value = "이름")
		private String name;
		
		@Column 
		@ApiModelProperty(value = "생년월일")
		private String birthday;
		
		@Column 
		@ApiModelProperty(value = "주소")
		private String address;
		
		@Column
		@ApiModelProperty(value = "전화번호")
		private String phone;

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

		public String getBirthday() {
			return birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "RegisterItem [id=" + id + ", userId=" + userId + ", password=" + password + ", name=" + name
					+ ", birthday=" + birthday + ", address=" + address + ", phone=" + phone + "]";
		}


		
		
}
