package com.example.springboottutorial.web.issue;

import com.example.springboottutorial.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/issues")
@RequiredArgsConstructor
public class IssueController {

  private final IssueService issueService;

  @GetMapping
  public String showList(Model model) {
    model.addAttribute("issueList", issueService.findAll());
    return "issues/List";
  }

  @GetMapping("/createForm")
  public String showCreateForm(@ModelAttribute IssueForm form) {
    return "issues/createForm";
  }

  @PostMapping
  public String create(IssueForm form, Model model) {
    issueService.create(form.getSummary(), form.getDescription());
    return "redirect:/issues";
  }
}
