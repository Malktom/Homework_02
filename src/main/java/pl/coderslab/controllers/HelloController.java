package pl.coderslab.controllers;

import ch.qos.logback.core.db.DBAppenderBase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

@Controller
public class HelloController {

    @GetMapping("workers")
    public String workersAction(Model model) {

        int random = new Random().nextInt(20);
        File file = new File("/home/tomasz/coderslab/Homework_02/src/main/webapp/WEB-INF/Workers.txt");
        StringBuilder reading = new StringBuilder();
        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String worker = scan.nextLine();
                int id = Integer.parseInt(worker.replaceAll("\\D", ""));
                if (id == random) {
                    model.addAttribute("worker", worker);
                    return "workers";
                }


            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }

        System.out.println(reading.toString());


        return "workers";

    }

}
