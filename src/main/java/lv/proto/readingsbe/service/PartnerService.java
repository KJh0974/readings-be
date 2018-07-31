package lv.proto.readingsbe.service;

import lv.proto.readingsbe.model.Partner;
import lv.proto.readingsbe.repository.PartnerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartnerService {

    private PartnerRepository partnerRepository;
    private ModelMapper modelMapper;

    public PartnerService(PartnerRepository partnerRepository, ModelMapper modelMapper) {
        this.partnerRepository = partnerRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional(readOnly = true)
    public List<Partner> findAll() {
        return partnerRepository.findAll().stream()
                .map(p -> modelMapper.map(p, Partner.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Partner findById(Long id) {
        return partnerRepository.findById(id)
                .map(p -> modelMapper.map(p, Partner.class))
                .orElse(null);
    }
}
