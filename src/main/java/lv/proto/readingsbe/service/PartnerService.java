package lv.proto.readingsbe.service;

import lv.proto.readingsbe.entity.Partner;
import lv.proto.readingsbe.repository.PartnerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PartnerService {

    private PartnerRepository partnerRepository;

    public PartnerService(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    @Transactional(readOnly = true)
    public List<Partner> findAll() {
        return partnerRepository.findAll();
    }
}
