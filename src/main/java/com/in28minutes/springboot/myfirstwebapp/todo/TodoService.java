package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.tools.Tool;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;


@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>(); 
	
	private static int todosCount = 0; 
	
	static {
		todos.add(new Todo(++todosCount, "in28minutes","Get to achieve AWS", 
							LocalDate.now().plusYears(1), false ));
		todos.add(new Todo(++todosCount, "in28minutes","Learn DevOps", 
				LocalDate.now().plusYears(2), false ));
		todos.add(new Todo(++todosCount, "in28minutes","Learn Full Stack Development", 
				LocalDate.now().plusYears(3), false ));
	}

	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}
	
	
	void deleteById(int id) {
		//numbers.removeIf(e -> (e % 2) == 0);;
		todos.removeIf(todos -> (todos.getId() == id)); 
		
	}

	Todo findById(int id) {
		for(Todo todo : todos) {
			if(todo.getId() == id) return todo; 
		}
		return null;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
		
	}
}
