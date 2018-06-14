package lv.proto.readingsbe.repository;

import lv.proto.readingsbe.entity.ObjectDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRepository extends JpaRepository<ObjectDO, Long> {
}
