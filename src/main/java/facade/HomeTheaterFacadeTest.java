package main.java.facade;

/**
 * Created by muthu on 9/5/16.
 */
public class HomeTheaterFacadeTest {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvdPlayer, cdPlayer, projector, theaterLights,
                                        screen, popcornPopper);

        homeTheater.watchMovie("E.T.");
        homeTheater.endMovie();
    }
}
