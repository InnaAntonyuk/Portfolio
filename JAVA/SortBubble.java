package week1lecture1;

public class SortBubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size;
        size = nums.length; // 10
//відображення масивуб який є
        System.out.println("Вихідний масив:");
        for (int i = 0; i < size; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();
//бульбашкове сортування, реалізація
        for (a = 1; a < size; a++){
            for (b = size - 1; b >= a; b--){
                if (nums[b-1] > nums[b]){
            t = nums[b-1];
            nums[b-1] = nums[b];
            nums[b] = t;
            }
          }
        }
//відображення відсортованого масиву
        System.out.println("Відсортований масив:");
        for (int i = 0; i < size; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println(); }
}

