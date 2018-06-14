package lv.proto.readingsbe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reading {

    private Long id;
    private LocalDateTime date;
    private Long value;

    private Period period;
    private Meter meter;
}
