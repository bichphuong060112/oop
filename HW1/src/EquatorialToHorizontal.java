public class EquatorialToHorizontal {
    public static void main(String[] args) {
        if (args.length != 3) {
            return;
        }
        double declinationDeg = Double.parseDouble(args[0]);
        double hourAngleDeg = Double.parseDouble(args[1]);
        double latitudeDeg = Double.parseDouble(args[2]);
        double declination = Math.toRadians(declinationDeg);
        double hourAngle = Math.toRadians(hourAngleDeg);
        double latitude = Math.toRadians(latitudeDeg);
        double altitude = Math.asin(Math.sin(declination) * Math.sin(latitude) + Math.cos(declination) * Math.cos(hourAngle) * Math.cos(latitude));
        double azimuth = Math.acos((Math.cos(latitude) * Math.sin(declination) - Math.cos(declination) * Math.cos(hourAngle) * Math.cos(latitude))  / Math.cos(altitude));
        System.out.println(Math.toDegrees(altitude) + " " + Math.toDegrees(azimuth));
    }
}
