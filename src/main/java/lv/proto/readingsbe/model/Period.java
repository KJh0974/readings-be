package lv.proto.readingsbe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Period {

    private Long id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
