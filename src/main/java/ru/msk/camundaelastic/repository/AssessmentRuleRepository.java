package ru.msk.camundaelastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import ru.msk.camundaelastic.model.AssessmentRule;

@Repository
public interface AssessmentRuleRepository extends ElasticsearchRepository<AssessmentRule, Long> {
}
