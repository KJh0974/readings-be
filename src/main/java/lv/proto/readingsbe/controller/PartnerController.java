package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.entity.Partner;
import lv.proto.readingsbe.service.PartnerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
    @CrossOrigin("http://localhost:3000")
    public List<Partner> getAllPartners() {
        return partnerService.findAll();
    }

}
