package by.service;

import by.dao.RecordRepository;
import by.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordRepository recordRepository;

    @Override
    public void addRecord(Record record) {
        recordRepository.save(record);
    }

    @Override
    public List<Record> getAllRecords() {
        return (List<Record>) recordRepository.findAll();
    }

    @Override
    public List<Record> getAllRecordsByCarNumber(String carNumber) {
        return recordRepository.findAllByCarNumber(carNumber);
    }

    @Override
    public long getCountOfRecords() {
        return recordRepository.count();
    }
}
