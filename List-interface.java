
import java.util.*;

interface List<E> extends Collection<E>{
    // returns True if parameter "e" is added to end of list
    boolean add(E e);
    // adds "element" parameter at index specified by the "index" parameter 
    void add(int index, E element);
    //returns True if elements of parameter "list" are added to end of list
    boolean addAll(ArrayList list);
    // returns True if elements of parameter "list" are added to list at index specified by "index" parameter
    boolean addAll(int index, ArrayList list);
    // makes list an empty list ([])
    void clear();
    //returns True if parameter "o" exists in list
    boolean contains(Object o);
    // returns True if list contains all elements in parameter "list"
    boolean containsAll(ArrayList list);
    // returns the element in list at the index specified by "index" parameter
    E get(int index);
    // returns the index of parameter "o". if Object o is not present in list, return 
    int indexOf(Object o);
    // returns True if list is empty list ([])
    boolean isEmpty();
    // iterates over each element in list
    Iterator<E> iterator();
    // returns True if element at index "index" was removed. Return false if index does not exist. Decreases length by 1.
    boolean remove(int index);
    // replaces element in "index" position with "element" parameter 
    E set(int index, E element);
    // returns the number of elements in list
    int size();

}