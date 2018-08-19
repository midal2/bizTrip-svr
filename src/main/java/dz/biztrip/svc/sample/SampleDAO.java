package dz.biztrip.svc.sample;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface SampleDAO {

    List<Map<String, Object>> getSampleInfo(SampleVO prm);
}
