package com.diego.examinit.domain.attempt;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import com.diego.examinit.domain.exam.Exam;
import com.diego.examinit.domain.user.User;

public class ExamAttempt {
    private UUID id;
    private Exam exam;
    private User student;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double score;
    private ExamAttemptStatus status;
    private ArrayList<StudentAnswer> answers;
}
