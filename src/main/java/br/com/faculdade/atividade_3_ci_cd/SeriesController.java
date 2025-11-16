package br.com.faculdade.atividade_3_ci_cd;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")

public class SeriesController {
    @GetMapping("/home")
    public String home() {
        return "Olá, esta é a rota de home!";
    }

    @GetMapping("/series")
    public List<String> series() {
        return List.of("Gossip Girl", "Prison Break", "Stranger Things");
    }

    @GetMapping("/atores")
    public List<Map<String, Object>> atores() {
        return List.of(
            Map.of("id", 1, "nome", "Blake Lively"),
            Map.of("id", 2, "nome", "Wentworth Miller"),
            Map.of("id", 3, "nome", "Millie Bobby Brown")
        );
    }
}
