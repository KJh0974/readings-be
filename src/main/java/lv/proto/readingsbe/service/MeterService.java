package lv.proto.readingsbe.service;

import lv.proto.readingsbe.model.Meter;
import lv.proto.readingsbe.repository.MeterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MeterService {

    private MeterRepository contractRepository;
    private ModelMapper modelMapper;

    public MeterService(MeterRepository contractRepository, ModelMapper modelMapper) {
        this.contractRepository = contractRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional(readOnly = true)
    public List<Meter> findAll() {
        return contractRepository.findAll().stream()
                .map(c -> modelMapper.map(c, Meter.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Meter findContract(Long id) {
        return contractRepository.findById(id)
                .map(c -> modelMapper.map(c, Meter.class))
                .orElse(null);
    }
}
