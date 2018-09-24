package lv.proto.readingsbe.controller;

import lv.proto.readingsbe.res.Readings;
import lv.proto.readingsbe.service.ReadingService;
import org.springframework.stereotype.Component;

@Component
public class ReadingsResource implements Readings {

    private ReadingService readingService;

    public ReadingsResource(ReadingService readingService) {
        this.readingService = readingService;
    }

    @Override
    public GetReadingsResponse getReadings() {
        return GetReadingsResponse.respond200WithApplicationJson(readingService.findAll());
    }
}
