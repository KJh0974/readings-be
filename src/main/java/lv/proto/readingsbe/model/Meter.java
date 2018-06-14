package lv.proto.readingsbe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meter {

    private Long id;
    private String type;
    private String serialNumber;
    private LocalDateTime installDate;
    private LocalDateTime verificationDate;
}
