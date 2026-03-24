package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.AnimalDto;



@Controller
public class StartController {
	
	@GetMapping("start")
	public String animalStart(Model model) {
		
		List <AnimalDto> list = new ArrayList<>();
		
		list.add(new AnimalDto("buta","/img/animal/buta.png"));
		list.add(new AnimalDto("hitsuji","/img/animal/hitsuji.png"));
		list.add(new AnimalDto("inu","/img/animal/inu.png"));
		list.add(new AnimalDto("kaba","/img/animal/kaba.png"));
		list.add(new AnimalDto("koala","/img/animal/koala.png"));
		list.add(new AnimalDto("kuma","/img/animal/kuma.png"));
		list.add(new AnimalDto("lion","/img/animal/lion.png"));
		list.add(new AnimalDto("neko","/img/animal/neko.png"));
		list.add(new AnimalDto("panda","/img/animal/panda.png"));
		list.add(new AnimalDto("penguin","/img/animal/penguin.png"));
		list.add(new AnimalDto("risu","/img/animal/risu.png"));
		list.add(new AnimalDto("saru","/img/animal/saru.png"));
		list.add(new AnimalDto("tora","/img/animal/tora.png"));
		list.add(new AnimalDto("uma","/img/animal/uma.png"));
		list.add(new AnimalDto("usagi","/img/animal/usagi.png"));
		list.add(new AnimalDto("zou","/img/animal/zou.png"));
		
		Collections.shuffle(list);
		
		model.addAttribute("imagePath", list.get(0).getImagePath());
		model.addAttribute("imagePaths", list);
		
		return "animal_memory/start";
	}

}