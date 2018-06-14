package lv.proto.readingsbe.repository;

import lv.proto.readingsbe.entity.ReadingDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingRepository extends JpaRepository<ReadingDO, Long> {
}
