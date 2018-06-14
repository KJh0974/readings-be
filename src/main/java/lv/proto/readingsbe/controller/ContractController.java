package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.model.Contract;
import lv.proto.readingsbe.service.ContractService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contracts")
public class ContractController {

    private ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping
    @CrossOrigin("http://localhost:3000")
    public List<Contract> getAllContracts() {
        return contractService.findAll();
    }

}
