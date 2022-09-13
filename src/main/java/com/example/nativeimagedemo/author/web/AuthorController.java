package com.example.nativeimagedemo.author.web;

import com.example.nativeimagedemo.author.business.AuthorService;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Moritz Halbritter
 */
@RestController
@RequestMapping(path = "/author", produces = MediaType.APPLICATION_JSON_VALUE)
class AuthorController {
    private final AuthorService authorService;

    AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    List<AuthorDto> listAll() {
        return this.authorService.findAll()
            .stream().map(AuthorDto::from)
            .collect(Collectors.toList());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    AuthorDto create(@RequestBody @Validated CreateAuthorDto dto) {
        return AuthorDto.from(this.authorService.create(dto.name()));
    }
}
