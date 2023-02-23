package com.KoreaIT.java.AM.controller;

import com.KoreaIT.java.AM.dto.Member;

public abstract class Controller {

	public static Member loginedMember = null;

	public boolean isLogined() {
		return loginedMember != null;
	}

	public abstract void doAction(String command, String actionMethodName);

	public abstract void makeTestData();
}
