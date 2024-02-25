public class Arrays {
    public static void update(int marks[], int notChangeable) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        notChangeable = 10;
    }

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;// after return further statements are not executed
                // System.out.println("Found It !");
            }
        }

        return -1;
    }

    public static int linearSearchForStr(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;// after return further statements are not executed

                // System.out.println("Found It !");
            }
        }
        // System.out.println("No Found It !");
        return -1;
    }

    public static int findLargest(int numbers[], int Largest) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > Largest) {
                Largest = numbers[i];
            }
        }
        return Largest;
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                System.out.println("Found at position " + mid);
                return mid;
            } else if (numbers[mid] > key) {// key mid
                end = mid - 1;
                // start=0;
            } else if (numbers[mid] < key) {// mid key
                start = mid + 1;
                // end=numbers.length-1;
            }
        }
        return -1;
    }

    public static void reverseArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        int temp = 0;
        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void pairArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // System.out.print("Pair for "+arr[i]+" is ");
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println("");
        }
    }

    public static void subArrays(int arr[]) {

        int largest = -1;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                // int sum=0;
                for (int k = start; k <= end; k++) {
                    System.out.println(arr[k]);
                    // sum=sum+arr[k];
                }
                // if (largest<sum) {
                // largest=sum;
                // }
                // System.out.println(sum);
                System.out.println("");
            }
            System.out.println("");
        }
        // System.out.println("The max sum is"+largest);
    }

    public static void sumofMaxsubArray(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                sum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    sum += numbers[k];
                    if (max < sum) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println("Max Sum of Subarray is :" + max);
    }

    public static void prefixsumMaxsubArray(int numbers[]) {
        int prefix[] = new int[numbers.length];
        int max = -1;
        int sum = 0;
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < prefix.length; i++) {
            int start = i;
            for (int j = i; j < prefix.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // sum is not on rhs to cal sum like prev and agai we are changing sum
                max = Math.max(max, sum);

            }
        }
        System.out.println("The max sum of array is :" + max);

    }

    public static void kadanesAlgo(int arr[]) {
        int cursum = 0;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            cursum = arr[i] + cursum;
            if (cursum < 0) {
                cursum = 0;
            }
            max = Math.max(cursum, max);
        }
        System.out.println("The max sum is:" + max);
    }

    public static void trappingRainWater(int arr[]) {
        int leftmax = Integer.MIN_VALUE;
        int rightmax = Integer.MIN_VALUE;
        int leftmaxarr[] = new int[arr.length];
        int rightmaxarr[] = new int[arr.length];
        // left
        for (int i = 0; i < arr.length; i++) {
            leftmax = Math.max(leftmax, arr[i]);
            leftmaxarr[i] = leftmax;
        }
        // right
        for (int i = arr.length - 1; i >= 0; i--) {
            rightmax = Math.max(rightmax, arr[i]);
            rightmaxarr[i] = rightmax;
        }
        int waterlevel = 0;
        // int watertrap=0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            waterlevel = Math.min(leftmaxarr[i], rightmaxarr[i]);
            // watertrap=waterlevel[i]-arr[i];
            sum = sum + waterlevel - arr[i];
            // System.out.println("The height of water level at index "+i+" is "+watertrap);
        }
        System.out.println("The Sum is " + sum);

    }

    public static int buySellstocks(int prices[]) {
        int maxprofit = 0;
        int bp = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (bp < prices[i]) {
                profit = prices[i] - bp;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                bp = prices[i];
            }
        }
        return maxprofit;

    }

    public static boolean appeartwice(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int findindex(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static int maxprofit(int prices[]){
        int profit=0;
        int buyprice=prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buyprice<prices[i]) {
                profit=Math.max(prices[i]-buyprice,profit);
            }else{
                buyprice=prices[i];
            }
        }
        return profit;
    }

    public static void main(String args[]) {

        // // Creation
        // int marks[]=new int[10];
        // marks[0]=10;
        // marks[1]=10;
        // marks[2]=10;
        // marks[3]=10;
        // marks[4]=10;
        // marks[5]=10;
        // marks[6]=10;
        // marks[7]=10;
        // marks[8]=10;
        // //Updation
        // marks[0]=50;
        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }
        // // another Creation
        // int Numbers[]={10,20,30,40,45};
        // for (int i = 0; i < Numbers.length; i++) {
        // System.out.println(Numbers[i]);
        // }
        // //Operations
        // int Numb[]={10,20,30,40,55};
        // for (int i = 0; i < Numb.length; i++) {
        // System.out.println(Numb[i]+1);
        // }

        // int marks[]={10,20,30,40,50};
        // int notChangeable=100;
        // update(marks,notChangeable);
        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }
        // System.out.println(notChangeable);

        // int numbers[]={2,4,6,8,10,12,14,16};
        // int key=10;
        // int index=linearSearch(numbers,key);
        // for (int i = 0; i < numbers.length; i++) {
        // if (numbers[i]==key) {
        // System.out.println("Found It ! at index "+ i +" and at position "+ (i+1) );
        // }
        // }

        // Linear search
        // int numbers[]={2,4,6,8,10,12,14,16};
        // int key=10;
        // int index=linearSearch(numbers,key);
        // if (index==-1) {
        // System.out.println("Not Found !");
        // } else {
        // System.out.println("Found It ! at index "+index+" and at position
        // "+(index+1));
        // }
        // Linear search Home Work
        // time complexity O(n) at worst case because suppose key to be mutton then the
        // loop checks whole array for n times and still not found
        // String menu[]={"Dosa","Idly","Vada","Samosa","Chicken"};
        // String key="Idly";
        // int index=linearSearchForStr(menu,key);
        // if (index==-1) {
        // System.out.println("Not Found ");
        // } else {
        // System.out.println("Found At "+index);
        // }

        // int numbers[]={1,2,6,3,5};
        // int Largest=-1;
        // int result=findLargest(numbers,Largest);
        // System.out.println(result);

        // int numbers[]={10,20,30,40,50,60};
        // int key=50;
        // binarySearch(numbers,key);

        // Reverse an array
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // reverseArray(arr);

        // Pairs in Array
        // int numbers[]={2,4,6,8,10};
        // pairArray(numbers);

        // SubArrays
        // int numbers[]={2,4,6,8,10};
        // subArrays(numbers);
        // int numbers[]={2,4,6,8,10};
        // sumofMaxsubArray(numbers);
        // int numbers[] = {1,-2,6,-1,3};
        // prefixsumMaxsubArray(numbers);
        // int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        // kadanesAlgo(numbers);
        // int height[]={4,2,0,6,3,2,5};
        // trappingRainWater(height);

        // int prices[]={7,1,5,3,6,4};
        // System.out.println(buySellstocks(prices));
        
        // Assignment 1 duplicate in arr
        // int nums[] = {1,2,2,4};
        // System.out.println(appeartwice(nums));
        
        // Assignment 2 reverse arr bin search
        // int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        // // int nums[]={0,1,2,4,5,6,7};
        // int pivot = 4;
        // int target = 6;
        // int retuval = findindex(nums, target);
        // // System.out.println();
        // System.out.println(retuval + pivot + 1 + 1);
        
        // Assignment 3 buy stock max
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println("the max is "+maxprofit(prices));
        
        
        
        // Assignment 4

    }
}