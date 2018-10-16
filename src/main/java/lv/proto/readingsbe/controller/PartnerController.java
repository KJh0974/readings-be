package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.model.Partner;
import lv.proto.readingsbe.service.PartnerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/partners")
public class PartnerController {

    private PartnerService partnerService;

    public PartnerController(PartnerService partnerService) {
        this.partnerService = partnerService;
    }

    @GetMapping
    public List<Partner> getAll() {
        return partnerService.findAll();
    }

    @GetMapping("/{id}")
    public Partner getById(@PathVariable("id") Long id) {
        return partnerService.findById(id);
    }
}
