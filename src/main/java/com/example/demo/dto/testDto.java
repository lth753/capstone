package com.example.demo.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;

import com.example.demo.enumType.check;

public class testDto {

	private Long longId;

	// 작성자
	private String name;

	// 계획 일정 기록하는 부분
	private String plan;

	// 언제로 설정할지
	// private Date setDate;

	private check checks;

	// 일정을 입력한 날짜
	private LocalDateTime inDate;

}
