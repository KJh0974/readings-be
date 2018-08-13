package lv.proto.readingsbe.service;

import lv.proto.readingsbe.entity.ObjectDO;
import lv.proto.readingsbe.model.Object;
import lv.proto.readingsbe.repository.ObjectRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ObjectService {

    private ObjectRepository objectRepository;
    private ModelMapper modelMapper;

    public ObjectService(ObjectRepository objectRepository, ModelMapper modelMapper) {
        this.objectRepository = objectRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional(readOnly = true)
    public List<Object> findAll() {
        return objectRepository.findAll().stream()
                .map(c -> modelMapper.map(c, Object.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Object findContract(Long id) {
        return objectRepository.findById(id)
                .map(c -> modelMapper.map(c, Object.class))
                .orElse(null);
    }

    public Object add(ObjectDO objectDO) {
        final ObjectDO object = objectRepository.save(objectDO);
        return modelMapper.map(object, Object.class);
    }
}
