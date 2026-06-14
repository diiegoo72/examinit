package com.diego.examinit.domain.exam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import com.diego.examinit.domain.user.User;


public class Exam {
    private UUID id;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private boolean published;
    private User creator;
    private ArrayList<ExamQuestion> questions;
    private double penaltyFactor;
}
