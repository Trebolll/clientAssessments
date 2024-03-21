package ru.msk.camundaelastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import ru.msk.camundaelastic.model.Client;

@Repository
public interface ClientRepository extends ElasticsearchRepository<Client, Long> {
}
