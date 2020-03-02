package hu.gyarmatip.springquizdata.services;

import hu.gyarmatip.springquizdata.dto.QuestionDto;
import hu.gyarmatip.springquizdata.entities.Question;
import hu.gyarmatip.springquizdata.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    @Autowired
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question save(QuestionDto questionDto) {
        Question question = new Question();
        question.setBody(questionDto.getBody());
        question.setTopic(questionDto.getTopic());
        question.setOptions(questionDto.getOptions());
        return questionRepository.save(question);
    }

    @Override
    public List<Question> findAll() {
        return ((List<Question>) questionRepository.findAll());
    }

    @Override
    public List<Question> findAllByTopic(String topic) {
        return ((List<Question>) questionRepository.findAllByTopic(topic));
    }

    @Override
    public void deleteById(Long id) {
        questionRepository.deleteById(id);
    }
}
