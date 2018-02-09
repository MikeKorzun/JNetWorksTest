package by.service;

import by.entity.Record;

import java.util.List;

public interface RecordService {
    void addRecord(Record record);
    List<Record> getAllRecords();
    List<Record> getAllRecordsByCarNumber(String carNumber);
    long getCountOfRecords();
}