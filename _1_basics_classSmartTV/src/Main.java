public class Main {
    public static void main(String[] args) {
        SmartTV smarTV1 = new SmartTV();

        System.out.println(smarTV1.getOn());
        System.out.println(smarTV1.getChannel());
        System.out.println(smarTV1.getVolume());

        smarTV1.setOn(true);
        smarTV1.setChannel(3);
        smarTV1.setVolume(10);

        System.out.println(smarTV1.getOn());
        System.out.println(smarTV1.getChannel());
        System.out.println(smarTV1.getVolume());

        smarTV1.changeVolume(+1);
        System.out.println(smarTV1.getVolume());

        smarTV1.changeVolume(-1);
        System.out.println(smarTV1.getVolume());

    }
}