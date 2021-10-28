package com.douzone.container.config.videosystem.mixing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.videosystem.Avengers;
import com.douzone.container.videosystem.BlanckDisc;
import com.douzone.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDConfig {
	
	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}
	
	@Bean(name="avengersInfinityWar")
	public DigitalVideoDisc blanckDisc() {
		BlanckDisc blanckDisc = new BlanckDisc();
		blanckDisc.setTitle("Avengers Infinity War");
		blanckDisc.setStudio("MARVEL");
		return blanckDisc;
	}
}
