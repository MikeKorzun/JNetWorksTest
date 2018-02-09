package by.controller;

import by.entity.Record;
import by.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/registrations", produces = "application/json")
public class RecordAddController {
    @Autowired
    private RecordService recordService;

    @PostMapping
    public ResponseEntity<Record> addRecord(@RequestBody Record record) {
        recordService.addRecord(record);
        return new ResponseEntity<>(record, HttpStatus.OK);
    }
}
