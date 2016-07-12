package edu.nju.web.controller;

import edu.nju.data.entity.MarkedText;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Dora on 2016/7/11.
 */

@Controller
@RequestMapping("/question")
public class QuestionController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    String showQuestion(@PathVariable Long id){return "test";}

    @RequestMapping(value = "/ask",method = RequestMethod.POST)
    void newQuestion(String title, MarkedText description, String tagNames, boolean watching,
                     List<Long> attachmentsIds){}

    @RequestMapping(value = "/ask",method = RequestMethod.GET)
    void newQuestion(){}

}
