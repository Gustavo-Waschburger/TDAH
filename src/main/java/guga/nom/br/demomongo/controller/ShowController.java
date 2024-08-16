package guga.nom.br.demomongo.controller;

import guga.nom.br.demomongo.model.Shows;
import guga.nom.br.demomongo.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/mongo")
public class ShowController {
    @Autowired
    private ShowRepository showRepository;

    @PostMapping("/insert")
    public ResponseEntity<Shows> createShow(@RequestBody Shows show) {
        Shows salveShow = showRepository.save(show);
        return ResponseEntity.ok(salveShow);
    }

    @GetMapping("/listar")
    public List<Shows> getAllShows() {
//        return showRepository.findAll();
        List<Shows> shows = showRepository.findAll();
        System.out.println("Number of shows found: " + shows.size());
        return shows;
    }

}
