package lv.proto.readingsbe.service;

import lv.proto.readingsbe.entity.ReadingDO;
import lv.proto.readingsbe.model.Reading;
import lv.proto.readingsbe.repository.MeterRepository;
import lv.proto.readingsbe.repository.PeriodRepository;
import lv.proto.readingsbe.repository.ReadingRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReadingService {

    private ReadingRepository readingRepository;
    private ModelMapper modelMapper;

    private MeterRepository meterRepository;
    private PeriodRepository periodRepository;

    public ReadingService(ReadingRepository readingRepository, ModelMapper modelMapper, MeterRepository meterRepository, PeriodRepository periodRepository) {
        this.readingRepository = readingRepository;
        this.modelMapper = modelMapper;
        this.meterRepository = meterRepository;
        this.periodRepository = periodRepository;
    }

    @Transactional(readOnly = true)
    public List<Reading> findAll() {
        return readingRepository.findAll().stream()
                .map(r -> modelMapper.map(r, Reading.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Reading findById(Long id) {
        return readingRepository.findById(id)
                .map(r -> modelMapper.map(r, Reading.class))
                .orElse(null);
    }

    @Transactional
    public Reading add(ReadingDO reading) {
        reading.setDate(LocalDateTime.now());

        meterRepository.findById(reading.getMeterId())
                .ifPresent(m -> {
                    reading.setMeter(m);
                    m.getReadings().add(reading);
                });

        periodRepository.findById(reading.getPeriodId())
                .ifPresent(p -> {
                    reading.setPeriod(p);
                    p.getReadings().add(reading);
                });

        final ReadingDO readingDO = readingRepository.save(reading);

        return modelMapper.map(readingDO, Reading.class);
    }
}
