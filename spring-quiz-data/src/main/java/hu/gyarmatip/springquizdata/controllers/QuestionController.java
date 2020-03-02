package hu.gyarmatip.springquizdata.controllers;

import hu.gyarmatip.springquizdata.dto.QuestionDto;
import hu.gyarmatip.springquizdata.entities.Question;
import hu.gyarmatip.springquizdata.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/question-service")
public class QuestionController {

    private QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/save")
    public ResponseEntity<Question> save(@RequestBody QuestionDto questionDto) {
        Question savedQuestion = questionService.save(questionDto);
        return new ResponseEntity<>(savedQuestion, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        questionService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/questions")
    public ResponseEntity<List<Question>> findAllQuestions() {
        return new ResponseEntity<>(questionService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/questions/{topic}")
    public ResponseEntity<List<Question>> findAllQuestionsByTopic(@PathVariable String topic) {
        return new ResponseEntity<>(questionService.findAllByTopic(topic), HttpStatus.OK);
    }

}
