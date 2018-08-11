package dz.biztrip.batch.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class ScheduleTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private SchduleTestDao schduleTestDao;

    @Scheduled(fixedDelay=1000)
    public void testSchedule(){
        logger.debug("testSchedule : " + schduleTestDao.getStockList());
    }

}
