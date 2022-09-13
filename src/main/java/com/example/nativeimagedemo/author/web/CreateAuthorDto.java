package com.example.nativeimagedemo.author.web;

import jakarta.validation.constraints.NotBlank;

/**
 * @author Moritz Halbritter
 */
record CreateAuthorDto(@NotBlank String name) {
}
