package com.diego.examinit.domain.question;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import com.diego.examinit.domain.user.User;

public class Question {
    private UUID id;
    private String statement;
    private String topic;
    private LocalDateTime createdAt;
    private User creator;
    private ArrayList<AnswerOption> options;
}
