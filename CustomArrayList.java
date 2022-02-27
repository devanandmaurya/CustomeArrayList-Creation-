package CustomArrayList.com;

import java.util.Arrays;

public class CustomArrayList {

	Object arr[];
	int index = 0;

	CustomArrayList(int size) {
		arr = new Object[size];

	}

	// add method we can make scynchronized our custom arraylist
	// synchronized void addtoInsert(Object obj) {
	void addtoInsert(Object obj) {

		// capacity check method call
		capacityCheck();

		arr[index] = obj;

		index = index + 1;

	}

	// for add method it requred so make
	void capacityCheck() {
		if (arr.length <= index) {
			int newSize = (int) ((int) arr.length + ((int) arr.length * 2.5));
			Object[] a = new Object[newSize];
			arr = Arrays.copyOf(arr, newSize);
			System.out.println(arr);
		}

	}

	// get method custome
	Object getMehod(int index) {
		rangCheck();
		return arr[index];

	}

	void rangCheck() {
		if (index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("No element found on this index");
		}
	}

	/// remove methods here
	Object removes(int index) {

		rangCheck();

		Object obj = arr[index];
		// Object a[] = new Object[arr.length - 1];
		// for (int i = 0; i < a.length; i++) {
		// if (i < index) {
		// a[i] = arr[i];
		//
		// } else {
		// a[i] = arr[i + 1]; }
		//
		// }
		// arr = a;
		// return obj;
		// }
		// }
		// The above can remove by using S System.arraycopy(arr, index + 1, arr, index,
		// i);
		int i = arr.length - index - 1;

		System.arraycopy(arr, index + 1, arr, index, i);
		return obj;

	}
}
