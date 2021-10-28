package com.douzone.container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.videosystem.Avengers;
import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {
	@Bean
	public Avengers avenger() {
		return new Avengers();
	}

	// 주입하기 (DI) 1:
	// Bean 생성 메소드 직접 호출
	// 생성자 주입
	 @Bean
	public DVDPlayer dvdPlayer01() {
		return new DVDPlayer(avenger());
	}

	// 주입하기 (DI) 2:
	// parameter로 Bean 전달하기
	// 생성자 주입
	// @Bean
	public DVDPlayer dvdPlayer02(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}

	// 주입하기 (DI) 3:
	// parameter로 Bean 전달하기
	// setter 주입
	@Bean
	public DVDPlayer dvdPlayer03(DigitalVideoDisc dvd) {
		DVDPlayer player = new DVDPlayer();
		player.setDvd(dvd);
		return player;
	}

	// 같은 타입의 빈을 생성할 경우
	@Bean(name="player04")
	public DVDPlayer dvdPlayer04(DigitalVideoDisc dvd) {
		DVDPlayer player = new DVDPlayer();
		player.setDvd(dvd);
		return player;
	}
}
