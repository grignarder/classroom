package com.serviceImpl;

import org.springframework.stereotype.Service;

import com.service.ClassroomBl;

@Service
public class ClassroomBlImpl implements ClassroomBl {
	public int getNumber(int i) {
		return 2*i;
	}
	
	public int getTrippleNumber(int i) {
		return 3*i;
	}

}
