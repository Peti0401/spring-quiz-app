package hu.gyarmatip.springquizdata.repository;

import hu.gyarmatip.springquizdata.entities.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
    Iterable<Question> findAllByTopic(String topic);
}
