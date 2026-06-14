package com.diego.examinit.domain.attempt;

import java.time.LocalDateTime;
import java.util.UUID;
import com.diego.examinit.domain.exam.ExamQuestion;
import com.diego.examinit.domain.question.AnswerOption;

public class StudentAnswer {
    private UUID id;
    private ExamQuestion examQuestion;
    private AnswerOption selectedOption;
    private boolean correct;
    private LocalDateTime answeredAt;
}
