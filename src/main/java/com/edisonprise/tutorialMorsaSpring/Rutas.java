package com.edisonprise.tutorialMorsaSpring;

import com.edisonprise.tutorialMorsaSpring.models.Libro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Rutas {

    private final Logger logger = LoggerFactory.getLogger(Rutas.class);

    @GetMapping("/hola")
    String miPrimeraRuta() {
        return "Hola mundo desde Spring Controller :)";
    }

    @GetMapping("/libro/{id}/editorial/{editorial}")
    String leerLibro(@PathVariable int id, @PathVariable String editorial) {
        return "Leyendo el libro id: " + id + ", editorial: " + editorial;
    }

    @GetMapping("/libro2/{id}")
    String leerLibro2(@PathVariable int id, @RequestParam String gato, @RequestParam String editorial) {
        return "Leyendo el libro id: " + id + ", params: " + gato + " editorial: " + editorial;
    }

    @PostMapping("/libro")
    String guardarLibro(@RequestBody Libro libro) {
        logger.debug("libro {}  editorial {}", libro.nombre, libro.editorial);

        return "libro guardado";
    }

    @GetMapping("/saludar")
    @ResponseStatus(value = HttpStatus.MOVED_PERMANENTLY, reason = "Fue movida a la version2 de la App")
    String miSegundaRutaconStatus() {
        return "Aprendiendo statuses http en Spring Boot";
    }

    @GetMapping("animales/{lugar}")
    public ResponseEntity<String> getAnimales(@PathVariable String lugar) {
        if(lugar.equals("granja")) {
            return ResponseEntity.status(HttpStatus.OK).body("caballo, vaca, oveja, gallina");
        } else if (lugar.equals(("selva"))) {
            return ResponseEntity.status(HttpStatus.OK).body("mono, gorilla, puma");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Lugar no valido");
        }
    }

    @GetMapping("/calcular/{numero}")
    public int getCalculo(@PathVariable int numero) {
        throw new NullPointerException("la clave del usuario es password123 y no deberia leerse en postman");
    }

    @GetMapping("userData")
    public ResponseEntity<String> getUserData() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-Type", "application/json")
                .body("{\"name\": \"mary\"}");
    }
}
