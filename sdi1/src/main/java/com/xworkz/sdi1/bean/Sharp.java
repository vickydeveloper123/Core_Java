package com.xworkz.sdi1.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Sharp {

	public Sharp() {
		System.out.println("default const");
	}

	@RequestMapping("/click1.fish")
	public String method1() {
		System.out.println("Running method in sharp class");
		return "sharp.html";
	}

	@RequestMapping("/click2.fish")
	public String method2() {
		System.out.println("Running method in sharp2 class");
		return "sharp.html";
	}

	@RequestMapping("/click3.fish")
	public String method3() {
		System.out.println("Running method in sharp3 class");
		return "sharp.html";
	}

	@RequestMapping("/click4.fish")
	public String method4() {
		System.out.println("Running method in sharp4 class");
		return "sharp.html";
	}

	@RequestMapping("/click5.fish")
	public String method5() {
		System.out.println("Running method in sharp5 class");
		return "sharp.html";
	}
	

	@RequestMapping("/shape1.fish")
	public String method6() {
		System.out.println("Running shape method in sharp5 class");
		return "shape.html";
	}

	@RequestMapping("/shape2.fish")
	public String method7() {
		System.out.println("Running shape html method in sharp5 class");
		return "shape.html";
	}
	

	@RequestMapping("/bun1.fish")
	public String method8() {
		System.out.println("Running bun html method in sharp5 class");
		return "bun.html";
	}
	
	@RequestMapping("/bun2.fish")
	public String method9() {
		System.out.println("Running bun html method in sharp5 class");
		return "bun.html";
	}
	

	@RequestMapping("/cake1.fish")
	public String method10() {
		System.out.println("Running cake html method in sharp5 class");
		return "cake.html";
	}

}
