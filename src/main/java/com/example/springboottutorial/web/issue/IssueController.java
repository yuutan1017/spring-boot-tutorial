package com.example.springboottutorial.web.issue;

import com.example.springboottutorial.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class IssueController {

  private final IssueService issueService;

  @GetMapping("/issues")

  public String showList(@NotNull Model model) {
    model.addAttribute("issueList", issueService.findAll());
    return "issues/List";
  }
}
