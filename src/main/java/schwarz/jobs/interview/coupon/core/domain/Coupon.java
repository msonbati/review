package schwarz.jobs.interview.coupon.core.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
public class Coupon {

    @Id
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "discount", precision = 10, scale = 2)
    private BigDecimal discount;

    @Column(name = "mindBasketValue", precision = 10, scale = 2)
    private BigDecimal minBasketValue;

}
