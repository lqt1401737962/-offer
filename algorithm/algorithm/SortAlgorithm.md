# 十大排序算法(Java代码实现)
### 下面动图来自网上摘取
常见的可分为俩大类:

**基于比较:** 通过比较来决定元素间的相对次序，由于其时间复杂度不能突破O(nlogn)，因此也称为非线性时间比较类排序
**非比较:** 不通过比较来决定元素间的相对次序，它可以突破基于比较排序的时间下界，以线性时间运行，因此也称为线性时间非比较类排序

![算法](structure.png)
1. 冒泡排序
**基本思想是**:1.比较相邻的元素。大的向后冒,和气泡一样浮起来..直至数组元素都有序
![动图演示](bubbleSort.gif)
```java
public static void bubbleSort(int[] arr){
        if (arr==null||arr.length<2)return;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1])
                    swap(arr,j,j+1);

            }
        }
    }
    public static void swap(int [] arr,int i ,int j){
        arr[i]=arr[i]^ arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i] = arr[i]^ arr[j];
    }
```

2. 直接插入排序
**基本思想:**将数组看成两部分,已经排好序的和没有排好序的,和前面比较,比前面的小了,前面的后移,直到比前面的大了,插入,结束.
![动图演示](insertSort.gif)
```java
public static void insertionSort(int[] arr) {
    if (arr == null || arr.length < 2) {
        return;
    }
    for (int i = 1; i < arr.length; i++) {
        for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
            swap(arr, j, j + 1);
        }
    }
}

public static void swap(int[] arr, int i, int j) {
    arr[i] = arr[i] ^ arr[j];
    arr[j] = arr[i] ^ arr[j];
    arr[i] = arr[i] ^ arr[j];
}
```


3. 简单选择排序
**核心思想:** 也可以看成两部分,有序和无序的..每次找到无序数组里最小的与有序数组后一个进行交换..直至全部有序.
![动图演示](selectSort.gif)

```java
public static void selectionSort(int[] arr) {
    if (arr == null || arr.length < 2) {
        return;
    }
    for (int i = 0; i < arr.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            minIndex = arr[j] < arr[minIndex] ? j : minIndex;
        }
        swap(arr, i, minIndex);
    }
}

public static void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}
```

4. 堆排序(很重要!)
**核心思想:** heapInsert过程(构建大根堆), heapify过程(每次拿大根堆的堆顶元素与最后一个元素交换,数量减一,然后重新构成大根堆,依次顺序重复直至全部有序.)
![动图演示](heapSort.gif)
```java
public static void heapSort(int[] arr) {
    if (arr == null || arr.length < 2) {
        return;
    }
    for (int i = 0; i < arr.length; i++) {
        heapInsert(arr, i);
    }
    int size = arr.length;
    swap(arr, 0, --size);
    while (size > 0) {
        heapify(arr, 0, size);
        swap(arr, 0, --size);
    }
}

public static void heapInsert(int[] arr, int index) {
    while (arr[index] > arr[(index - 1) / 2]) {
        swap(arr, index, (index - 1) / 2);
        index = (index - 1) / 2;
    }
}

public static void heapify(int[] arr, int index, int size) {
    int left = index * 2 + 1;
    while (left < size) {
        int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
        largest = arr[largest] > arr[index] ? largest : index;
        if (largest == index) {
            break;
        }
        swap(arr, largest, index);
        index = largest;
        left = index * 2 + 1;
    }
}

public static void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}
```

5. 快速排序(改进随机快排)
**核心思想:** 重要!partition过程, 就是将数组中的元素进行分类 ,小于划分值的放在左边 ,等于划分值的放在中间,大于划分值的放在右边..调用递归过程直至整个数组有序.
![动图演示](quickSort.gif)
```java
public static void quickSort(int[] arr) {
    if (arr == null || arr.length < 2) {
        return;
    }
    quickSort(arr, 0, arr.length - 1);
}

public static void quickSort(int[] arr, int l, int r) {
    if (l < r) {
        swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
        int[] p = partition(arr, l, r);
        quickSort(arr, l, p[0] - 1);
        quickSort(arr, p[1] + 1, r);
    }
}

public static int[] partition(int[] arr, int l, int r) {
    int less = l - 1;
    int more = r;
    while (l < more) {
        if (arr[l] < arr[r]) {
            swap(arr, ++less, l++);
        } else if (arr[l] > arr[r]) {
            swap(arr, --more, l);
        } else {
            l++;
        }
    }
    swap(arr, more, r);
    return new int[] { less + 1, more };
}

public static void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}
```


6. 归并排序
**核心思想:** 将两部分有序的数组变成一个完全有序的数组..也是递归小合成大的有序.
merge过程 ,需要申请一个数组,排完序,拷贝回原数组..
![动图演示](mergeSort.gif)
```java
public static void mergeSort(int[] arr) {
    if (arr == null || arr.length < 2) {
        return;
    }
    mergeSort(arr, 0, arr.length - 1);
}

public static void mergeSort(int[] arr, int l, int r) {
    if (l == r) {
        return;
    }
    int mid = l + ((r - l) >> 1);
    mergeSort(arr, l, mid);
    mergeSort(arr, mid + 1, r);
    merge(arr, l, mid, r);
}

public static void merge(int[] arr, int l, int m, int r) {
    int[] help = new int[r - l + 1];
    int i = 0;
    int p1 = l;
    int p2 = m + 1;
    while (p1 <= m && p2 <= r) {
        help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
    }
    while (p1 <= m) {
        help[i++] = arr[p1++];
    }
    while (p2 <= r) {
        help[i++] = arr[p2++];
    }
    for (i = 0; i < help.length; i++) {
        arr[l + i] = help[i];
    }
}
```

7. 桶排序是个大的概念 计数排序和基数排序都是具体实现
**核心思想:** 最大的数是多少准备多少个桶+1,遍历到那个数往里面放,然后依次倒出,成为有序数组,不基于排序,有很多的限制,缺点(不常用)更适用于200以内.
![图片演示](bucketSort.png)

8. 计数排序
**核心思想:** 也是准备桶,是桶排序的升级,每进去一个数,那个数统计数量而不是真的放进去.
![动图演示](countSort.gif)
```java
public static void bucketSort(int[] arr) {
    if (arr == null || arr.length < 2) {
        return;
    }
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        max = Math.max(max, arr[i]);
    }
    int[] bucket = new int[max + 1];
    for (int i = 0; i < arr.length; i++) {
        bucket[arr[i]]++;
    }
    int i = 0;
    for (int j = 0; j < bucket.length; j++) {
        while (bucket[j]-- > 0) {
            arr[i++] = j;
        }
    }
}
```

9. 基数排序
**核心思想:** 是桶排序的升级,先个位进行桶归位,然后倒出,再依次进行十位数进行桶归位,再倒出进行百位数归位,,,直至有序
![动图演示](radixSort.gif)
```java
public static void radixSort(int[] arr) {
    if (arr == null || arr.length < 2) {
        return;
    }
    radixSort(arr, 0, arr.length - 1, maxbits(arr));
}

public static int maxbits(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        max = Math.max(max, arr[i]);
    }
    int res = 0;
    while (max != 0) {
        res++;
        max /= 10;
    }
    return res;
}

public static void radixSort(int[] arr, int begin, int end, int digit) {
    final int radix = 10;
    int i = 0, j = 0;
    int[] count = new int[radix];
    int[] bucket = new int[end - begin + 1];
    for (int d = 1; d <= digit; d++) {
        for (i = 0; i < radix; i++) {
            count[i] = 0;
        }
        for (i = begin; i <= end; i++) {
            j = getDigit(arr[i], d);
            count[j]++;
        }
        for (i = 1; i < radix; i++) {
            count[i] = count[i] + count[i - 1];
        }
        for (i = end; i >= begin; i--) {
            j = getDigit(arr[i], d);
            bucket[count[j] - 1] = arr[i];
            count[j]--;
        }
        for (i = begin, j = 0; i <= end; i++, j++) {
            arr[i] = bucket[j];
        }
    }
}
```

10. 希尔排序
**核心思想:** 改变增量,依次排序,是简单插入排序的升级,一开始为大增量最后必须增量是1..排序至完全有序.
这个算法既不稳定也不是很好,用的少,我也没怎么看过..就不做过多的笔记了.

![动图演示](shellSort.gif)


#### 算法的稳定性及时间复杂度
时间复杂度: 是最高次项去掉常数项所得到的
稳定性:   不是我们平时理解的有时算法排的快有时候排的慢,而是 相同数据原来的位置,排序后还是没改变的.
![图片](timeTable.png)