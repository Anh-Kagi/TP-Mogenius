package fr.polytech.tpmogenius.app.controller;

import fr.polytech.tpmogenius.app.model.Heart;
import fr.polytech.tpmogenius.app.repository.HeartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hearts/")
public class HeartController {
    private HeartRepository hearts;

    @Autowired
    public HeartController(HeartRepository hearts) {
        this.hearts = hearts;
    }

    @GetMapping("/")
    public List<Heart> list() {
        return hearts.findAll();
    }

    @PostMapping("/")
    public Heart create(@RequestParam(required=true) String color, byte rate) {
        Heart heart = new Heart(color, (byte) Byte.toUnsignedInt(rate));
        return hearts.save(heart);
    }
}
