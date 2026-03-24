package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalDto {
	
	/** 動物名 **/
	String animalName;
	
	/** 画像パス **/
	String imagePath;

}
