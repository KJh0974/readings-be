package lv.proto.readingsbe.repository;

import lv.proto.readingsbe.entity.PeriodDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodRepository extends JpaRepository<PeriodDO, Long> {
}
