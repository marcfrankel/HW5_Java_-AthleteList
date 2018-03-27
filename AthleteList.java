/**
 * Class for Athlete List type.
 * @author mfrankel8
 * @version 1
 */

public class AthleteList<T extends Athlete> implements AthleteListInterface<T> {

    private int cur_elements = 0;
    private Athlete[] backingList;

    public AthleteList() {
        backingList = new Athlete[INITIAL_CAPACITY];

    }

    /**
     * Adds the specified element t to the BACK of the AthleteList.
     * If the AthleteList is full, it should be resized to twice its
     * current capacity. Note that if the AthleteList needs to be
     * resized, you should resize it and then carry on the add operation
     * as normal.
     * @throws IllegalArgumentException if the element to be added is null
     * @param t Element to be added to the AthleteList
     */
    @Override
    public void add(T t) throws IllegalArgumentException {
        if (t == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }

        if (cur_elements < INITIAL_CAPACITY ) {
            backingList[cur_elements] = t;
            cur_elements += 1;
        } else if (cur_elements > backingList.length) {
            Athlete newbacking[] = new Athlete[backingList.length * 2];
            for(int i=0; i<backingList.length; i++){
                backingList[i] = backingList[i];
            }
            this.backingList = backingList;
            backingList[cur_elements] = t;
        }
    }

    /**
     * Removes the element at the specified index, and returns it.
     * You should shift every element to the right of the removed
     * element one spot to the left, so that all the null elements are
     * in the back of the array. For example, suppose there's a list with
     * [1,2,3,4,5]. If we remove the element 2, we should have [1,3,4,5]
     * afterwards. If we then remove 4, the list should look like [1,3,5].
     * list.size() would now return 3. The lists capacity would not change
     * though.
     * @throws IndexOutOfBoundsException if the index is less than zero or is
     * @param index Index of the element to be removed.
     * @return The Athlete removed from the AthleteList.
     */
    @Override
    @SuppressWarnings("unchecked")
    public T remove(int index) throws IndexOutOfBoundsException {
        Athlete temp;
        if (index < 0 || index >= cur_elements) {
            throw new IndexOutOfBoundsException();
        } else {
            temp = backingList[index];

            for (int x=index; x<backingList.length - 1; x++) {
                backingList[x] = backingList[x+1];
            }
        }
        cur_elements--;
        return (T) temp;
    }

    /**
     * Returns the element at the specified index.
     * @throws IndexOutOfBoundsException if the index is less than zero or
     * greater than or equal to the number of elements in the AthleteList.
     * @param index Index of the element to be returned.
     * @return Athlete at the passed-in index
     */
    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= cur_elements) {
            throw new IndexOutOfBoundsException();
        } else {

            return (T) backingList[index];
        }

    }

    /**
     * Removes all elements from the AthleteList, and resets it back
     * to its original capacity. Size should be zero after this happens.
     */
    @Override
    public void clear() {
        backingList = new Athlete[INITIAL_CAPACITY];
        cur_elements = 0;
    }

    /**
     * Returns the number of elements currently in the AthleteList
     * @return The number of elements in the AthleteList
     */
    @Override
    public int size() {
        return cur_elements;
    }

    /**
     * Returns whether this AthleteList is empty or not.
     * @return true if this AthleteList is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        if (cur_elements == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Prescribes training for the Athlete at the given
     * index via their train() method.
     * @throws IndexOutOfBoundsException if index is less than zero or greater
     * than or equal to the number of elements in the AthleteList.
     * @param index Index of the Athlete to be trained.
     */
    @Override
    public void train(int index) {

    }

    /**
     * Prescribes rest for the Athlete at the given index via their rest()
     * method.
     * @throws IndexOutOfBoundsException if index is less than zero or greater
     * than or equal to the number of elements in the AthleteList.
     * @param index Index of the athlete to be rested.
     */
    @Override
    public void rest(int index) {

    }

    /**
     * Returns an array of Athletes with the same elements as your backing
     * array, but with only size() elements. There should be no null elements
     * in this array.
     * @return an array of Athletes as described above.
     */
    @Override
    public T[] asArray() {
        return null;
    }
}