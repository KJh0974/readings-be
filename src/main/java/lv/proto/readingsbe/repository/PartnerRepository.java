package lv.proto.readingsbe.repository;

import lv.proto.readingsbe.entity.Partner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartnerRepository extends CrudRepository<Partner, Long> {

    List<Partner> findAll();
}
