package com.example.fsdp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/result")
public class ResultController {

    @GetMapping("/status")
    public String getResult() {
        return "Result Published";
    }

    @PostMapping("/publish")
    public String publishResult(@RequestBody String name) {
        return "Result Published for: " + name;
    }

    @PutMapping("/update/{id}")
    public String updateResult(@PathVariable int id) {
        return "Result Updated: " + id;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteResult(@PathVariable int id) {
        return "Result Deleted: " + id;
    }

    @PatchMapping("/patch/{id}")
    public String patchResult(@PathVariable int id) {
        return "Result Partially Updated: " + id;
    }
}