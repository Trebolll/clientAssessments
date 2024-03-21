package ru.msk.camundaelastic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "client_assessment")
public class ClientAssessment {
    private Long id;
    private String clientInfo;
    private Boolean assessmentResult;
    private String details;
    private LocalDateTime assessmentDate;
}
