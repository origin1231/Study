package com.web.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
@RequiredArgsConstructor
public class SampleHotel {

	@NonNull
	private Chef chef;

	private String name;
}
