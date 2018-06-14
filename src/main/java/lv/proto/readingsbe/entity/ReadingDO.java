package lv.proto.readingsbe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reading")
public class ReadingDO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private LocalDateTime date;
    @Column
    private Long value;
    @ManyToOne
    @JoinColumn(name = "meter_id")
    private MeterDO meter;
    @ManyToOne
    @JoinColumn(name = "period_id")
    private PeriodDO period;
}
