package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.BookConfigClass;
import com.ustglobal.springcore.config.HelloConfigurationClass;
import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class BookApp {

	public static void main(String[] args) {
		
				
		ApplicationContext context = new AnnotationConfigApplicationContext(BookConfigClass.class);
		
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPetName());
		
		
		
		
		
		
		
	}

}
