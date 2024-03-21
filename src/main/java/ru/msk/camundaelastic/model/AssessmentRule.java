package ru.msk.camundaelastic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "assessment_rule")
public class AssessmentRule {
    private Long id;
    private String ruleName;
    private String description;
    private String condition;
    private String outcome;
}
