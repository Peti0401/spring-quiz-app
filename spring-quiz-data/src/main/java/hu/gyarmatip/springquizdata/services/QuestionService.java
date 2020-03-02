package hu.gyarmatip.springquizdata.services;

import hu.gyarmatip.springquizdata.dto.QuestionDto;
import hu.gyarmatip.springquizdata.entities.Question;

import java.util.List;

public interface QuestionService {

    Question save(QuestionDto questionDto);
    List<Question> findAll();
    List<Question> findAllByTopic(String topic);
    void deleteById(Long id);

}
