public class TestFriendsList {

    public static void main(String [] args){
        FriendsList friendsList = new FriendsList();
        System.out.println("Testing adding");
        friendsList.add(0, new Friend("sktls", false));
        friendsList.add(0, new Friend("boy", false));
        friendsList.add(0, new Friend("GothBarbie", true));
        System.out.println(friendsList.toString());

        System.out.println();
        System.out.println("Testing Remove");
        friendsList.remove(2);
        System.out.println(friendsList.toString());

        System.out.println();
        System.out.println("Testing get");
        System.out.println(friendsList.get(1));

        System.out.println();
        System.out.println("Testing Remove All");
        friendsList.removeAll();

        System.out.println(friendsList);
        System.out.println(friendsList.isEmpty());

    }
    
}
