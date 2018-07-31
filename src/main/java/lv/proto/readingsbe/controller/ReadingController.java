package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.model.Reading;
import lv.proto.readingsbe.service.ReadingService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/readings")
public class ReadingController {

    private ReadingService readingService;

    public ReadingController(ReadingService readingService) {
        this.readingService = readingService;
    }

    @GetMapping
    @CrossOrigin("http://localhost:4200")
    public List<Reading> getAllReadings() {
        return readingService.findAll();
    }
}
