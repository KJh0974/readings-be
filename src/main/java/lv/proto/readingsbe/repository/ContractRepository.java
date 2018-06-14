package lv.proto.readingsbe.repository;

import lv.proto.readingsbe.entity.ContractDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<ContractDO, Long> {
}
