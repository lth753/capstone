package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.example.demo.entity.CaleanderEntity;
import com.example.demo.enumType.check;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
class ItemRepositoryTest {
	
	@Autowired
	ItemRepository itemRepository;
	
	@Test
	@DisplayName("테스트")
	public void createEntityTest() {
		CaleanderEntity caleanderEntity = new CaleanderEntity();
		caleanderEntity.setName("태현");
		caleanderEntity.setPlan("공부하기");
		caleanderEntity.setChecks(check.check);
		caleanderEntity.setInDate(LocalDateTime.now());
		CaleanderEntity save = itemRepository.save(caleanderEntity);
		System.out.println(save);
	}

	

}
