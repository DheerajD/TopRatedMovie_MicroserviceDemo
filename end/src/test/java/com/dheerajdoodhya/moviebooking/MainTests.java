package com.dheerajdoodhya.moviebooking;

import com.dheerajdoodhya.moviebooking.controller.MovieController;
import com.dheerajdoodhya.moviebooking.entity.Movie;
import com.dheerajdoodhya.moviebooking.entity.MovieComparator;
import com.dheerajdoodhya.moviebooking.entity.MovieList;
import com.dheerajdoodhya.moviebooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

@SpringBootTest(classes = Main.class)
public class MainTests extends AbstractTestNGSpringContextTests {

	@Autowired
	private MovieController movieController;

	@Autowired
	private MovieService movieService;

	@Test
	public void testGetTopRatedMovie() throws Exception {
		MovieList movieList = new MovieList();
		List<Movie> list = movieList.getMovieList();
		MovieComparator mc = new MovieComparator();
		Collections.sort(list, mc);
		Assert.assertEquals(movieController.getTopRatedMovie().getMovieName(), list.get(0).getMovieName());
	}
}
