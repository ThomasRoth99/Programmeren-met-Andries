public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // instantiate components here
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer());
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
