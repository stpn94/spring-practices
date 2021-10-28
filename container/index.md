```

	*src/main/java   
		|---com.douzone.container.user
		|			|--User.java
		|			|--Friend.java
		|
		|---com.douzone.container.soundsystem
		|			|--CDPlayer
		|			|--CompactDisc
		|			|--HighSchoolRapper2Final
		|			|--HighSchoolRapper3Final
		|
		|---com.douzone.container.videosystem
		|
		|
		|---com.douzone.container.config.user.test
		|			|--AppConfigTest.java(JUnit으로 옮기기)
		|			|--XmlConfigTest.java(JUnit으로 옮기기)
		|
		|
		|---com.douzone.container.config.soundsystem
		|			|--CDPlayerConfig.java
		|
		|---com.douzone.container.config.videosystem
		|			|--DVDPlayerConfig.xml
		|				
		|
		|---com.douzone.container.config.videosystem.mixing
		|			|--DVDConfig.java
		|			|--DVDPlayerConfig.java
		|			|--VideoSystemConfig.java
		
	*src/main/resources
		|---com.douzone.container.config.user
		|			|--applicationContext.xml
		|
		|---com.douzone.container.config.soundsystem
		|			|--CDPlayerConfig.xml
		|			
		|---com.douzone.container.config.videosystem
		|			|--DVDPlayerConfig.xml
		|
		
		
		
	*src/test/java
		|---com.douzone.container.user
		|			|--AppConfigTest.java
		|			|--XmlConfigTest.java
		|
		|---com.douzone.container.config.soundsystem
		|			|--CDPlayerJavaConfigTest.java
		|			|--CDPlayerXmlConfigTest.java
		|
		|---com.douzone.container.config.videosystem
		|			|--DVDPlayerJavaConfigTest
		|			|--DVDPlayerXmlConfigTest
		|

			

AvengersInfinityWar
AvengersEndGame
AvengersAgeOfUltron

BlanckDisc
CaptinAmerica
------------------------------------------------------------------------------------		
		
directory가 다르지만, 
jar로 compile될 때, 패키지 경로로 따라서 합쳐짐. 
(java는 compile, resources는 copied)
directory의 구분은 관리를 위해서이며, 컴파일 시에는 패키지 기준으로 관리되게 된다. 
예를 들어 resources의 applicationContext.xml은 
jar로 컴파일시 
com.douzone.container.config.user.applicationContext.xml로 간다. 

>> 그렇기에, 같은 자리에 xml을 미리 두어도 되지만, build를 할 수 없다. 
resources 자리에 있어야 resource plug-in이 copy해서 가져올 수 있기 때문이다. 
java plug-in은 compile을 하는 역할이기에 각자의 역할을 가진 plug-in이 있는 곳에 넣어주어야한다. 

``````
TDD, 테스트 주도 개발, 테스트하는 부분부터 먼저 제작   
에러를 고쳐나가는 과정을 거치며 만들어가기 