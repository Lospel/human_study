package com.mysite.sbb.visual;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mysite.sbb.user.SiteUser;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class VisualService {
    private final VisualRepository visualRepository;

    public void create(String subject, String content, SiteUser user) {
        Visual q = new Visual();
        q.setSubject(subject);
        q.setContent(content);
        q.setCreateDate(LocalDateTime.now());
        q.setAuthor(user);
        this.visualRepository.save(q);
    }

    public Page<Visual> getList(int page, String kw){
        List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(Sort.Order.desc("createDate"));
        Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));
        return this.visualRepository.findAllByKeyword(kw, pageable);
    }

    public void modify (Visual visual, String subject, String content) {
        visual.setSubject(subject);
        visual.setContent(content);
        visual.setModifyDate(LocalDateTime.now());
        this.visualRepository.save(visual);
    }

    public void delete(Visual visual) {
        this.visualRepository.delete(visual);
    }

    public void vote(Visual visual, SiteUser siteUser) {
        visual.getVoter().add(siteUser);
        this.visualRepository.save(visual);
    }
}
