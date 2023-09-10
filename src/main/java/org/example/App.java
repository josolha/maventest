package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Hello world!
 *
 */

@Controller
public class App 
{
    @GetMapping ("/memberList.do")
    public String memberList(Model model) {
        return "memberList";
    }
}
