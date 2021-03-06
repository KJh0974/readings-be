package lv.proto.readingsbe.repository;

import lv.proto.readingsbe.entity.PartnerDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends JpaRepository<PartnerDO, Long> {
}
