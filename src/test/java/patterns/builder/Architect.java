package patterns.builder;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class Architect {

    public static void main(String[] args) {

//        Room room1 = new RoomBuilder().setFloorNumber(2).createRoom();
//        Room room2 = new RoomBuilder().setFloorNumber(1).createRoom();
//        
//        ArrayList<Room> rooms = new ArrayList<>();
//        rooms.add(room1);
//        rooms.add(room2);   
//
//         House house = new House(rooms);   


//        ArrayList<Room> rooms = new RoomListBuilder().addList()
//                .addRoom(room1)
//                .addRoom(room2)
//                .buildList();
//
//         House house = new House(rooms);     


        ArrayList<Room> rooms = new RoomListBuilder().addList()
                .addRoom().setFloorNumber(2).addRoomToList()
                .addRoom().setFloorNumber(1).addRoomToList()
                .buildList();

        House house = new House(rooms);

    }

}
