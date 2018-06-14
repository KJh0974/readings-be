package lv.proto.readingsbe.service;

import lv.proto.readingsbe.model.Contract;
import lv.proto.readingsbe.repository.ContractRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContractService {

    private ContractRepository contractRepository;
    private ModelMapper modelMapper;

    public ContractService(ContractRepository contractRepository, ModelMapper modelMapper) {
        this.contractRepository = contractRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional(readOnly = true)
    public List<Contract> findAll() {
        return contractRepository.findAll().stream()
                .map(c -> modelMapper.map(c, Contract.class))
                .collect(Collectors.toList());
    }
}
