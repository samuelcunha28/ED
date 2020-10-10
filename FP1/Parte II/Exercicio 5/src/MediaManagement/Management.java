package MediaManagement;

import AllMedia.Media;

import java.util.ArrayList;

public class Management<T extends Media> {

    // An array list with any type of medio (cd, book, music, etc)
    private ArrayList<T> myList = new ArrayList<>();

    public Management() {
    }

    public void addToList(T media) {
        myList.add(media);
    }

    public T getFromList(int position) {
        return myList.get(position);
    }

    public void getAllList() {
        for (T i: myList) {
            System.out.println(i.toString());
        }
    }
}
