package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.model.Partner;
import lv.proto.readingsbe.service.PartnerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partners")
public class PartnerController {

    private PartnerService partnerService;

    public PartnerController(PartnerService partnerService) {
        this.partnerService = partnerService;
    }

    @GetMapping
    @CrossOrigin("http://localhost:4200")
    public List<Partner> getAll() {
        return partnerService.findAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin("http://localhost:4200")
    public Partner getById(@PathVariable("id") Long id) {
        return partnerService.findById(id);
    }
}
