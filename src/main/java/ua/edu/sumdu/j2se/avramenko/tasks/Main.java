package ua.edu.sumdu.j2se.avramenko.tasks;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Task task = new Task("title", 0);
		task.getTitle();
		System.out.println("nazva- " + task.title);
		Task task2 = new Task("privet2", 3, 5, 1);

	}
}
