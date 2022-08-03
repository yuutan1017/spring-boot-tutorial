package com.example.springboottutorial.domain.issue;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class IssueEntity {
  public long id;
  public String summary;
  public String description;
}
