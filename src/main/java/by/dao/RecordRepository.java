package by.dao;

import by.entity.Record;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecordRepository extends CrudRepository<Record, Long>{
    List<Record> findAllByCarNumber(String carNumber);
}
