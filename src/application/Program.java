package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow tha's awesome!");
		
		String moment = "21/06/2018 13:05:44";		
		String title = "Traveling to New Zealand";
		String content = "I'm going to visit this wonderffol country!";
		int likes = 12;
		
		Post post1 = new Post(sdf.parse(moment), title, content, likes);
		post1.addComment(c1);
		post1.addComment(c2);
		
		System.out.println(post1);
		
		System.out.println();
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you!");
		
		String moment2 = "28/07/2018 23:14:19";		
		String title2 = "Good night guys";
		String content2 = "See you tomorrow";
		int likes2 = 5;
		
		Post post2 = new Post(sdf.parse(moment2), title2, content2, likes2);
		post2.addComment(c3);
		post2.addComment(c4);
		
		System.out.println(post2);
		

	}

}
