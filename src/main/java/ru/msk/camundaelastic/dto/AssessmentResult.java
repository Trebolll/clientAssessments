package ru.msk.camundaelastic.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AssessmentResult {
    private String inn;
    private String region;
    private long capital;
}
