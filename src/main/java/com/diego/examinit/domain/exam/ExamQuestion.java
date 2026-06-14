package com.diego.examinit.domain.exam;

import java.util.UUID;
import com.diego.examinit.domain.question.Question;


public class ExamQuestion {
    private UUID id;
    private Question question;
    private int position;
    private double points;
}
