package DataStructures;

import Interface_form.List;	// List 인터페이스가 있는 패키지다.
import java.util.Arrays;

/**
 *
 * @author ST_ (st-lab.tistory.com)
 *
 * @param <E> the type of elements in this list
 *
 */

public class ArrayList<E> implements List<E>, Cloneable {


    private static final int DEFAULT_CAPACITY = 10;	// 최소(기본) 용적 크기
    private static final Object[] EMPTY_ARRAY = {};	// 빈 배열

    private int size;	// 요소 개수

    Object[] array;	// 요소를 담을 배열

    // 생성자1 (초기 공간 할당 X)
    public ArrayList() {
        this.array = EMPTY_ARRAY;
        this.size = 0;

    }

    // 생성자2 (초기 공간 할당 O)
    public ArrayList(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }


    private void resize() {
        int array_capacity = array.length;

        // if array's capacity is 0
        if (Arrays.equals(array, EMPTY_ARRAY)) {
            array = new Object[DEFAULT_CAPACITY];
            return;
        }

        // 용량이 꽉 찰 경우
        if (size == array_capacity) {
            int new_capacity = array_capacity * 2;

            // copy
            array = Arrays.copyOf(array, new_capacity);
            return;
        }
        // 용적의 절반 미만으로 요소가 차지하고 있을 경우
        if (size < (array_capacity / 2)) {
            int new_capacity = array_capacity / 2;

            // copy
            array = Arrays.copyOf(array, Math.max(new_capacity, DEFAULT_CAPACITY));
            return;
        }
    }

    @Override
    public boolean add(E value) {
        addLast(value);
        return true;
    }

    public void addLast(E value) {

        // 꽉차있는 상태라면 용적 재할당
        if (size == array.length) {
            resize();
        }
        array[size] = value;	// 마지막 위치에 요소 추가
        size++;	// 사이즈 1 증가
    }


    @Override
    public void add(int index, E value) {

        if (index > size || index < 0) {	// 영역을 벗어날 경우 예외 발생
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {	// index가 마지막 위치라면 addLast 메소드로 요소추가
            addLast(value);
        }
        else {

            if(size == array.length) {	// 꽉차있다면 용적 재할당
                resize();
            }

            // index 기준 후자에 있는 모든 요소들 한 칸씩 뒤로 밀기
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = value;	// index 위치에 요소 할당
            size++;
        }
    }

    public void addFirst(E value) {
        add(0, value);
    }


    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        if(index >= size || index < 0) {	// 범위 벗어나면 예외 발생
            throw new IndexOutOfBoundsException();
        }
        // Object 타입에서 E타입으로 캐스팅 후 반환
        return (E) array[index];
    }


    @Override
    public void set(int index, E value) {
        if (index >= size || index < 0) {	// 범위를 벗어날 경우 예외 발생
            throw new IndexOutOfBoundsException();
        }
        else {
            // 해당 위치의 요소를 교체
            array[index] = value;
        }
    }


    @Override
    public int indexOf(Object value) {
        int i = 0;

        // value와 같은 객체(요소 값)일 경우 i(위치) 반환
        for (i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        // 일치하는 것이 없을경우 -1을 반환
        return -1;
    }


    public int lastIndexOf(Object value) {
        for(int i = size - 1; i >= 0; i--) {
            if(array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public boolean contains(Object value) {

        // 0 이상이면 요소가 존재한다는 뜻
        if(indexOf(value) >= 0) {
            return true;
        }
        else {
            return false;
        }
    }



    @SuppressWarnings("unchecked")
    @Override
    public E remove(int index) {

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        E element = (E) array[index];	// 삭제될 요소를 반환하기 위해 임시로 담아둠
        array[index] = null;

        // 삭제한 요소의 뒤에 있는 모든 요소들을 한 칸씩 당겨옴
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = null;
        }
        size--;
        resize();
        return element;
    }

    @Override
    public boolean remove(Object value) {

        // 삭제하고자 하는 요소의 인덱스 찾기
        int index = indexOf(value);

        // -1이라면 array에 요소가 없다는 의미이므로 false 반환
        if (index == -1) {
            return false;
        }

        // index 위치에 있는 요소를 삭제
        remove(index);
        return true;
    }


    @Override
    public int size() {
        return size;	// 요소 개수 반환
    }

    @Override
    public boolean isEmpty() {
        return size == 0;	// 요소가 0개일 경우 비어있다는 의미이므로 true반환
    }

    @Override
    public void clear() {
        // 모든 공간을 null 처리 해준다.
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
        resize();
    }


    // 부록 메소드
    @Override
    public Object clone() throws CloneNotSupportedException {

        // 새로운 객체 생성
        ArrayList<?> cloneList = (ArrayList<?>)super.clone();

        // 새로운 객체의 배열도 생성해주어야 함 (객체는 얕은복사가 되기 때문)
        cloneList.array = new Object[size];

        // 배열의 값을 복사함
        System.arraycopy(array, 0, cloneList.array, 0, size);

        return cloneList;
    }

    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }


    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            // copyOf(원본 배열, 복사할 길이, Class<? extends T[]> 타입)
            return (T[]) Arrays.copyOf(array, size, a.getClass());
        }
        // 원본배열, 원본배열 시작위치, 복사할 배열, 복사할배열 시작위치, 복사할 요소 수
        System.arraycopy(array, 0, a, 0, size);
        return a;
    }

}