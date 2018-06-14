package lv.proto.readingsbe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contract {

    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private Partner partner;
    private Object object;
}
