public class Main {

    public static void main(String[] args) {
        RoomType[] roomTypes = RoomType.values();

        for (RoomType r : roomTypes) {
            System.out.println(r.name());
        }

        String roomTypeFromAPIRequest = "DOUBLE";
        RoomType doubleRoomType = RoomType.valueOf(roomTypeFromAPIRequest);
        // This won't work
        // RoomType doubleRoomType2 = RoomType.valueOf("Double");
    }
}
