package lv.proto.readingsbe.service;

import lv.proto.readingsbe.model.Reading;
import lv.proto.readingsbe.repository.ReadingRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReadingService {

    private ReadingRepository readingRepository;
    private ModelMapper modelMapper;

    public ReadingService(ReadingRepository readingRepository, ModelMapper modelMapper) {
        this.readingRepository = readingRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional(readOnly = true)
    public List<Reading> findAll() {
        return readingRepository.findAll().stream()
                .map(r -> modelMapper.map(r, Reading.class))
                .collect(Collectors.toList());
    }
}
