package lv.proto.readingsbe.repository;

import lv.proto.readingsbe.entity.MeterDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterRepository extends JpaRepository<MeterDO, Long> {
}
