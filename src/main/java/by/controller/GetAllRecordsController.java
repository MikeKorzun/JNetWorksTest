package by.controller;

import by.entity.Record;
import by.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/registrations", produces = "application/json")
public class GetAllRecordsController {
    @Autowired
    private RecordService recordService;

    @GetMapping
    public ResponseEntity<List<Record>> getAllRecordsByCarNumber() {
        return new ResponseEntity<>(recordService.getAllRecords(), HttpStatus.OK);
    }
}
