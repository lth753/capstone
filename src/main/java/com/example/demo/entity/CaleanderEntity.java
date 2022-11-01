package com.example.demo.entity;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.enumType.check;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table
@Entity
public class CaleanderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long longId;
	
	//작성자
	@Column(length = 30, nullable = false)
	private String name;
	
	//계획 일정 기록하는 부분
	@Column(nullable = false)
	private String plan;
	
	//언제로 설정할지
	//private Date setDate;
	
	@Column(nullable = false)
	private check checks;
	
	//일정을 입력한 날짜
	private LocalDateTime inDate;
	
	

}
