# ListADT
- create a list
- retrieve (get) and element from the list at a certain index
- removing an item from the list at a certain index
- add an item to the list at a certain index
- find the number of elements on the list
- remove all items from the list
- checking if our list is empty or not

## +createList()
Creates an empty list.

## +size() : integer
Returns the number of items that are in the list.

## +isEmpty() : boolean
Returns true when the list is empty (no elements) and false otherwise.

## +removeAll()
Remove all the items in the list (or empty the list).

## +addd(index : integer, item : ListItemType) 
Insets an item at the given index if
0 <= index <= size().
if the inxex < size(), items after the inserted list item are shifted to the right
Throws an exception if the index is out of bounds.



## + get(index : integer) : ListItemType
Returns the item at the given index of a list, 
if 0 <= index < size()
The list is left unchanged.
Throw an Exception if the index is out of bounds.

## +remove(index : integer) 
Removes the item at the given index from the list,
if 0 <= index < size(). 
If index < size() - 1 (not the last item), then the items are renumbered as follows: index + 1 moves to index: index + 2 moves to index + 1, and so on.
Thow an exception if the index is out of bounds.




    