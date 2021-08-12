package controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.ManageStudent;

@Controller
@RequestMapping(produces = "application/json; charset = UTF-8")
public class StudentControl {
    ManageStudent manageStudent = new ManageStudent();
    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("listStudent", manageStudent.listStudent);
        return "show";
    }

    @GetMapping("/create")
    public String showCreate() {
        return "create";
    }

    @GetMapping("/edit")
    public String showEdit(Model model, @RequestParam("index") int eIndex) {
        model.addAttribute("student", manageStudent.listStudent.get(eIndex));
        return "edit";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("index") int dIndex) {
        manageStudent.delete(dIndex);
        return "redirect:/";
    }

    @GetMapping("/find")
    public String find(@RequestParam String fName, Model model) {
        model.addAttribute("listStudent", manageStudent.find(fName));
        return "show";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student) {
        manageStudent.save(student);
        return "redirect:/";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Student student, @RequestParam("index") int eIndex) {
        manageStudent.edit(eIndex, student);
        return "redirect:/";
    }


}
