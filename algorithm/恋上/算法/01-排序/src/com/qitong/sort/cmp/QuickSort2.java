package com.qitong.sort.cmp;

import com.qitong.sort.Sort;

public class QuickSort2<T extends Comparable<T>> extends Sort<T> {


	@Override
	protected  void sort() {
		if (array == null || array.length < 2) {
			return;
		}
		sort(0, array.length - 1);
	}

	private void sort(int l, int r) {
		if (l < r) {
			swap(l + (int) (Math.random() * (r - l + 1)), r);
			int[] p = partition(l, r);
			sort(l, p[0] - 1);
			sort( p[1] + 1, r);
		}
	}

	private int[] partition(int l, int r) {
		int less = l - 1;
		int more = r;
		while (l < more) {
			if (cmp(array[l],array[r]) < 0) {
				swap(++less, l++);
			} else if (cmp(array[l],array[r]) > 0) {
				swap(--more, l);
			} else {
				l++;
			}
		}
		swap(more, r);
		return new int[] { less + 1, more };
	}

}
