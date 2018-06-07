package lv.proto.readingsbe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "object")
public class Object {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String type;
    @Column
    private String city;
    @Column
    private String region;
    @Column
    private String street;
    @Column
    private String houseNumber;
    @Column
    private String apartmentNumber;
    @Column
    private String postalCode;
    @OneToMany(mappedBy = "object")
    private Collection<Contract> contracts;
    @OneToMany(mappedBy = "object")
    private Collection<Meter> meters;
}
