package ru.msk.camundaelastic.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;
@Data
@RequiredArgsConstructor
public class AssessmentRequest {
    private boolean successfulScoring;
    private Map<String, Object> details;
}
