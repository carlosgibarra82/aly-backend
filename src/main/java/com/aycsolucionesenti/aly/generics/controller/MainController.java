package com.aycsolucionesenti.aly.generics.controller;

import com.aycsolucionesenti.aly.generics.controller.dto.MessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MainController {

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('ROLE_WORKER')")
    public ResponseEntity<MessageDto> hello() {
        return ResponseEntity.ok(new MessageDto("hola desde ALY"));
    }
}
