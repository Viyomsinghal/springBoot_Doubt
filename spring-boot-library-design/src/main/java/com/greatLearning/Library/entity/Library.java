package com.greatLearning.Library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
public class Library {
@Id
private long id;
private String name;
private String commaSeparatedBookName;
}
