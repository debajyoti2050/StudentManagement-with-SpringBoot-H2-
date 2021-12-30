package a;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="debajyoti")
class Student {
	@Id
	@Column(name="myid")
	private int id;
	@Column(name="myname")
	private String name;
	@Column(name="myaddress")
	private String address;
	
	
}
