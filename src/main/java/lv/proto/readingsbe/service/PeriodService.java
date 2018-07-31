package lv.proto.readingsbe.service;

import lv.proto.readingsbe.model.Period;
import lv.proto.readingsbe.repository.PeriodRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PeriodService {

    private PeriodRepository periodRepository;
    private ModelMapper modelMapper;

    public PeriodService(PeriodRepository periodRepository, ModelMapper modelMapper) {
        this.periodRepository = periodRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional(readOnly = true)
    public List<Period> findAll() {
        return periodRepository.findAll().stream()
                .map(r -> modelMapper.map(r, Period.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Period findPeriod(Long id) {
        return periodRepository.findById(id)
                .map(r -> modelMapper.map(r, Period.class))
                .orElse(null);
    }
}
