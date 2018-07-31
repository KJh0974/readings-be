package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.model.Contract;
import lv.proto.readingsbe.service.ContractService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contracts")
public class ContractController {

    private ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping
    @CrossOrigin("http://localhost:4200")
    public List<Contract> getAll() {
        return contractService.findAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin("http://localhost:4200")
    public Contract getById(@PathVariable("id") Long id) {
        return contractService.findContract(id);
    }

}
