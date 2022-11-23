package com.example.demo.controller;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class boardController {

    private final BoardRepository boardRepository;

    @Autowired
    protected boardController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @GetMapping("/board/list")
    public String list(Model model) {
        String name123 = "김준석";
        name123 += "교사";
        model.addAttribute("name", name123);
        return "/board/list";
    }

    @PostMapping("/board/insert")
    public String insert(Board board) {
        System.out.println("input_list");
        System.out.println(board.getName());
        boardRepository.save(board);
        //select : boardRepository.findAll();
        return "/board/list";
    }
}
