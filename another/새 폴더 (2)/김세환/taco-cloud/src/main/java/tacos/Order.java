package tacos;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.Data;
import java.util.Date;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="Taco_Order")
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Date placedAt;
	
	@NotBlank(message="이름을 입력해주세요")
	private String deliveryName;
	
	@NotBlank(message="주소를 입력해주세요")
	private String deliveryAddress;
		
	@NotBlank(message="우편번호를 입력해주세요")
	private String deliveryZip;
	
	@CreditCardNumber(message="유효한 카드번호가 아닙니다")
	private String ccNumber;
	
	@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
			message="월월/년년")
	private String ccExpiration;
	
	@Digits(integer=3, fraction=0, message="유효하지 않은 CVV")
	private String ccCVV;
	
	@ManyToMany(targetEntity=Taco.class)
	private List<Taco> tacos = new ArrayList<>();
	
	public void addDesign(Taco design) {
		this.tacos.add(design);
	}
	
	@PrePersist
	void placedAt() {
		this.placedAt = new Date();
	}
}