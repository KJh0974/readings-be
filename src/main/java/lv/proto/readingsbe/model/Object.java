package lv.proto.readingsbe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Object {

    private Long id;
    private String type;
    private String city;
    private String region;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String postalCode;

    private Collection<Meter> meters;
}
