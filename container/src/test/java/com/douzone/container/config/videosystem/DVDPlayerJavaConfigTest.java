package com.douzone.container.config.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= DVDPlayerConfig.class)
//@ContextConfiguration(locations = {"/com/douzone/container/config/user/applicationContext02.xml"})
public class DVDPlayerJavaConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRul = new SystemOutRule().enableLog();
	
	@Autowired
	private DigitalVideoDisc dvd;
	
	
	// 같은 타입의 빈이 2개 이상 존재하는 경우 1:
	// 설정 클래스의 빈 생성 메소드 이름 
	// @Qualifier("dvdPlayer03")
	
	// 같은 타입의 빈이 2개 이상 존재하는 경우 2:
	// 설정 클래스의 빈 생성 메소드의 @Bean name 속성 
	@Autowired
	@Qualifier("player04")
	private DVDPlayer dvdPlayer;
	
	@Test
	public void testDVDNotNull() {
		assertNotNull(dvd);
	}
	
	@Test
	public void testDVDPlayerNotNull() {
		assertNotNull(dvdPlayer);
	}
	
	@Test
	public void testPlay() {
		dvdPlayer.play();
		assertEquals("Playing Movie MARVEL's Avengers", systemOutRul.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	
	
	
}
