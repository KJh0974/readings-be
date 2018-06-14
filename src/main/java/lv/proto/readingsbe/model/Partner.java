package lv.proto.readingsbe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Partner {

    private Long id;
    private String name;
    private Boolean company;
    private String code;
    private String email;
    private String phone;
}
