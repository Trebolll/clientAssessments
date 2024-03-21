package ru.msk.camundaelastic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "client")
public class Client {
    private Long id;
    private String inn;
    private String companyName;
    private String region;
    private BigDecimal capital;
    private Boolean residentStatus;
}
