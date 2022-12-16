package com.mysite.sbb.visual;

import java.security.Principal;

import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.sbb.user.SiteUser;
import com.mysite.sbb.user.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequestMapping("/visual")
@RequiredArgsConstructor
@Controller
public class VisualController {

    private final VisualService visualService;
    private final UserService userService;

    @RequestMapping("/list")
    public String list(Model model, @RequestParam(value = "page", defaultValue = "0") int page,
        @RequestParam(value = "kw", defaultValue = "") String kw) {
        Page<Visual> paging = this.visualService.getList(page, kw);
        model.addAttribute("paging",paging);
        model.addAttribute("kw", kw);
        return "visual_list";
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/create")
    public String questionCreate(VisualForm visualForm) {
        return "visual_form";
    }
    
    @PreAuthorize("isAuthenticated()")
    @PostMapping("/create")
    public String questionCreate(@Valid VisualForm visualForm, 
        BindingResult bindingResult, Principal principal) {
        if (bindingResult.hasErrors()){
            return "visual_form";
        }
        SiteUser siteUser = this.userService.getUser(principal.getName());
        this.visualService.create(visualForm.getSubject(), 
            visualForm.getContent(), siteUser);// 질문을 저장한다.
        return "redirect:/visual/list"; // 질문 저장후 질문 목록으로 이동한다.
    }
}
