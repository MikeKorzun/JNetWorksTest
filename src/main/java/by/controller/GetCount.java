package by.controller;

import by.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/registrations/stats/count", produces = "application/json")
public class GetCount {
    @Autowired
    private RecordService recordService;

    @GetMapping
    public ResponseEntity<Long> getCount() {
        return new ResponseEntity<>(recordService.getCountOfRecords(), HttpStatus.OK);
    }
}
