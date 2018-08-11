package dz.biztrip.batch.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class ScheduleTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Scheduled(fixedDelay=1000)
    public void testSchedule(){
        logger.debug("testSchedule : " + new Date());
    }

}
