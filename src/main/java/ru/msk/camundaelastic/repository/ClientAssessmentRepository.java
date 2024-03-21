package ru.msk.camundaelastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import ru.msk.camundaelastic.model.ClientAssessment;

@Repository
public interface ClientAssessmentRepository extends ElasticsearchRepository<ClientAssessment, Long> {

}
