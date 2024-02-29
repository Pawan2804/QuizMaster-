package com.pawan.QuizMaster.service;

import com.pawan.QuizMaster.model.Question;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;
import java.util.Optional;

public interface IQuestionService {
    Question createQuestion(Question question);
    List<Question> getAllQuestion();
    Optional<Question> getQuestionById(Long id);
    List<String> getAllSubjects();
    Question updateQuestion(Long id, Question question) throws ChangeSetPersister.NotFoundException;
    void deleteQuestion(Long id);
    List<Question> getQuestionsForUser(Integer numOfQuestions, String subject);

}
