package com.mms.kakfa_consumer;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Topic")
public class Topic {
    @Id
    private String id;
    private String uuid;
}
