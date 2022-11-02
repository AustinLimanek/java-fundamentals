/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void cogitoRestaurant(){
        Restaurant leCinq = new Restaurant("le Cinq", 4);
        assertNotNull(leCinq);
    }

    @Test void toStringRestaurant(){
        Restaurant leCinq = new Restaurant("le Cinq", 4);
        System.out.println(leCinq.toString());
        assertEquals("le Cinq is rated 3.0 stars and has an expense of 4", leCinq.toString());
    }

    @Test void cogitoReview(){
        Review good = new Review("Great food and atmosphere", 4, "austin");
        assertNotNull(good);
    }

    @Test void totalRatingOfRestaurant(){
        Restaurant leCinq = new Restaurant("le Cinq", 4);
        Review good = new Review("Great food and atmosphere", 5, "austin");
        Review okay = new Review("The wine could have been better", 4, "austin");
        Review bad = new Review("Too expensive", 2, "austin");
        leCinq.addReview(good);
        leCinq.addReview(okay);
        leCinq.addReview(bad);
        assertEquals((double) 11/3, leCinq.getRating());
        System.out.println(leCinq.toString());
    }

    @Test void toStringReview(){
        Review good = new Review("Great food and atmosphere", 5, "Austin");
        assertEquals("""
                User: Austin
                Review: Great food and atmosphere
                Number of stars: 5""", good.toString());
    }

    @Test void totalRatingOfShop(){
        Shop essenza = new Shop("Essenza", 4, "Obtain all of your favorite high-end jewelry and fragrances at a single location");
        Review good = new Review("Great collection of products", 5, "austin");
        Review okay = new Review("I didn't like the ring collection", 4, "austin");
        Review bad = new Review("Could use a larger selection of soaps", 2, "austin");
        essenza.addReview(good);
        essenza.addReview(okay);
        essenza.addReview(bad);
        assertEquals((double) 11/3, essenza.getRating());
        System.out.println(essenza.toString());
    }

    @Test void totalRatingOfTheater(){
        Theater amc = new Theater("AMC");
        Review good = new Review("Excellent story", 5, "austin", "Fight Club");
        Review okay = new Review("Thrilling but needed deleted scenes", 4, "austin", "Fellowship of the Ring");
        Review bad = new Review("Not to my liking", 2, "austin", "Clockwork Orange");
        amc.addReview(good);
        amc.addReview(okay);
        amc.addReview(bad);
        assertEquals((double) 11/3, amc.getRating());
        System.out.println(amc.toString());
    }

    @Test void addingMoviesToTheater(){
        Theater amc = new Theater("AMC");
        amc.addMovie("Land Before Time");
        amc.addMovie("Belfast");
        amc.addMovie("Pokemon 2000");
        amc.removeMovie("Belfast");
        assertEquals(2, amc.getMovies().size());
        System.out.println(amc.toString());
    }

    @Test void repeatMovies(){
        Theater amc = new Theater("AMC");
        amc.addMovie("Land Before Time");
        amc.addMovie("Belfast");
        amc.addMovie("Pokemon 2000");
        amc.addMovie("Belfast");
        assertEquals(3, amc.getMovies().size());
        System.out.println(amc.toString());
    }

    @Test void removingMovies(){
        Theater amc = new Theater("AMC");
        amc.addMovie("Land Before Time");
        amc.addMovie("Belfast");
        amc.addMovie("Pokemon 2000");
        amc.removeMovie("Belfast");
        assertEquals(2, amc.getMovies().size());
        System.out.println(amc.toString());
    }

    @Test void removingNonExistantMovies(){
        Theater amc = new Theater("AMC");
        amc.addMovie("Land Before Time");
        amc.addMovie("Belfast");
        amc.addMovie("Pokemon 2000");
        amc.removeMovie("Belfast 2");
        assertEquals(3, amc.getMovies().size());
        System.out.println(amc.toString());
    }

}
