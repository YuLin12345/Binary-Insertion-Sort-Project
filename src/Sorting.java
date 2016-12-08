/*	@author Yu Lin
 * 	CSCI 335
 * 	Binary Insertion Sort Project
 */

public class Sorting {
	// Binary Insertion algorithm.
	public void binaryInsertion(int[] IDs) {
		int insert, temp;

		for (int x = 1; x < IDs.length; x++) {
			insert = binarySearch(IDs, 0, x, IDs[x]);

			if (insert < x) {
				temp = IDs[x];

				for (int y = x - 1; y >= insert; y--)
					IDs[y + 1] = IDs[y];
				IDs[insert] = temp;
			}
		}
	}

	// Binary Search algorithm.
	public int binarySearch(int IDs[], int bottom, int top, int key) {
		int mid;

		if (bottom == top) {
			return bottom;
		}

		mid = bottom + ((top - bottom) / 2);

		if (key > IDs[mid]) {
			return binarySearch(IDs, mid + 1, top, key);
		} else if (key < IDs[mid]) {
			return binarySearch(IDs, bottom, mid, key);
		}
		return mid;
	}
}