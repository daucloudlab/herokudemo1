package kz.kaznitu.lessons.controllers;

import kz.kaznitu.lessons.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @Autowired
    private BookRepository repository ;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("books", repository.findAll()) ;

        return "home" ;
    }
}
