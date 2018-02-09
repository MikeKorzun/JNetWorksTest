package by.dao;

import by.entity.Record;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class RecordRepositoryTest {
    @Autowired
    private RecordRepository recordRepository;

    @Test
    public void imageSave() {
        Record original = new Record();
        original.setCarNumber("1111 AO-6");
        recordRepository.save(original);

        Record test = recordRepository.findOne(1L);

        assertNotNull(test);
        assertEquals(original.getId(), test.getId());
        assertEquals(original.getCarNumber(), original.getCarNumber());
        assertEquals(original.getDateOfCreation(), original.getDateOfCreation());
    }
}