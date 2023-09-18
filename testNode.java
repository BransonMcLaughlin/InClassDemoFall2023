public class testNode {
    
    public static void main(String [] args){
        Friend f1 = new Friend("Lezduit", false);
        Friend f2 = new Friend("cool", true);
        Friend f3 = new Friend("boy", true);

        // Creating nodes to put into array list
        Node<Friend> n1 = new Node<Friend>(f1);
        Node<Friend> n2 = new Node<Friend>(f2);
        Node<Friend> n3 = new Node<Friend>(f3);

        // The different nodes in the array list are not pointing to one another so 
        // we need to make then have something to point to after them
        n1.setNext(n2);
        n2.setNext(n3);

        System.out.println(n1.toString());
    }
    
}
