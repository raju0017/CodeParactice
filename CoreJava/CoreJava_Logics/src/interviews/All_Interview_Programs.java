package interviews;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class All_Interview_Programs {
	
	// BEL
	public static int[] mergGivenArrays(int[]arr1, int[]arr2){
		
		int[] a = new int[]{1,4,7,9,1,36, 67};
		int[] b = new int[]{2,3,5,9,1,77, 67};
		
		int[] c = new int[a.length+b.length];
		
		//With out using existing library methods
		int position=0;
		for (int i : a) {
			c[position]=i;
			position++;
		}
		for (int i : b) {
			c[position]=i;
			position++;
		}
		System.out.println("With out Using library methods :");
		for(int i : c){
			System.out.print(i+" ");
		}
		
		// with using array copy
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		System.out.println("\nWith out Using library methods :");
		for(int i : c){
			System.out.print(i+" ");
		}
		
		// with using Collections
		
		List<int[]> list = new ArrayList<>();
		list = Arrays.asList(a);
		list.addAll(Arrays.asList(b));
		
		Object[] arrObj = list.toArray();
		
		System.out.println(Arrays.toString(arrObj));
		
		return new int[5];
	}
	
	//Print all pairs with given sum
	// MTX
	public static void pairsWithGivenSum(int[] arr, int sum){
		
/*	Given an array of integers, and a number ‘sum’, print all pairs in the array whose sum is equal to ‘sum’.

		Examples :
		Input  :  arr[] = {1, 5, 7, -1, 5}, 
		          sum = 6
		Output : (1, 5) (7, -1) (1, 5)

		Input  :  arr[] = {2, 5, 17, -1}, 
		          sum = 7
		Output :  (2, 5)*/
		
		// Approach 1: A simple solution is to traverse each element and check if there’s another number in 
						//the array which can be added to it to give sum.
		System.out.println("Approach 1:");
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==sum){
					System.out.println("(" + arr[i] + ", " + arr[j] + ")");
				}
			}
		}
		
		// Approach 2 : Use hashing
		/*We create an empty hash table. Now we traverse through the array and check for pairs in the hash table. 
		 * If a matching element is found, we print the pair number of times equal to the number of occurrences of the 
		 * matching element. 
		Note that the worst case of time complexity of this solution is O(c + n) where c is the count of pairs with a 
		given sum.*/
		
			System.out.println("Approach 2 : Use hashing");
			Map<Integer, Integer> hm = new HashMap<>();
			//{1, 5, 7, -1, 5};
			for(int i=0;i<arr.length; i++){
			     // Search if a pair can be formed with arr[i].
				int rem = sum-arr[i];
				if(hm.containsKey(rem)){
					int count = hm.get(rem);
					for(int j=0; j<count; j++)
						System.out.print("(" + rem + ", " + arr[i] +")" + "\n");
				}
				if(hm.containsKey(arr[i])){
					hm.put(arr[i], hm.get(arr[i]+1));
				}
				else{
					hm.put(arr[i], 1);
				}
			}
		
			
			// Approach 3:  Using Sorting
			int low = 0;
	        int high = arr.length - 1;
	 
	        Arrays.sort(arr);
	        System.out.println("Approach 3:");
	        while (low < high) {
	            if (arr[low] + arr[high] == sum) {
	                System.out.println("The pair is : ("+ arr[low] + ", " + arr[high] + ")");
	            }
	            if (arr[low] + arr[high] > sum) {
	                high--;
	            }
	            else {
	                low++;
	            }
	        }
	}
	
	// Accolite
	public static void orderArrayBasedOnDuplicates(int[] arr){
		
		// input [9, 2, 7, 9, 3, 1, 9, 7]
		// out put : 99977231
		Map<Integer, Integer> hm = new LinkedHashMap<>();
		List<Integer> list = new LinkedList<>();
		
		for(int i : arr){
			if(hm.containsKey(i)){
				hm.put(i, hm.get(i)+1);
			}
			else{
				hm.put(i, 1);
			}
		}
			
			for(int key : hm.keySet()){
				if(hm.get(key)>1){
					for(int j=0;j<hm.get(key); j++){
						list.add(key);
					}
				}
			}
			for(int key : hm.keySet()){
				if(hm.get(key)<2){
					list.add(key);
				}
			}
			
			System.out.println(list);
		
	}

	// Accolite
	public static void sawapStringWithoutTemp(String a, String b){
		 // Declare two strings 
      /*  String a = "Hello"; 
        String b = "World"; */
          
        // Print String before swapping 
        System.out.println("Strings before swap: a = " +   a + " and b = "+b); 
          
        // append 2nd string to 1st 
        a = a + b; 
          
        // store initial string a in string b 
        b = a.substring(0,a.length()-b.length()); 
          
        // store initial string b in string a 
        a = a.substring(b.length()); 
          
        // print String after swapping 
        System.out.println("Strings after swap: a = " +  a + " and b = " + b);
		
	}
	
	// from Giddiah
	public static boolean checkGivenNumIsPrimeandFibo(int number) {

		if (number == 0 || number == 1) {
			return false;
		}

		boolean isPrime = true;
		// Checking Given number is prime or Not
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				System.out.println("The given number " + number + " is not prime");
				break;
			}
		}
		// Checking the Number is present in Fibonacci series
		if (isPrime) {
			int first = 0;
			int second = 1;
			int fibo;
			List<Integer> fiboList = new ArrayList<>();
			for (int i = 2; i <= number; i++) {
				fibo = first + second;
				first = second;
				second = fibo;
				fiboList.add(fibo);
				if (number == fibo) {
					return true;
				} else if (fibo > number) {
					System.out.println("Fibo List : " + fiboList);
					System.out.println("The given number is not in Fibonacci series");
					return false;
				}

			}

		}

		return false;

	}

	// Wells Fargo
	public static void countRepeatedChars(String str) {
		str.toUpperCase();
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (!hm.containsKey(ch[i])) {
				hm.put(ch[i], 1);
			} else
				hm.put(ch[i], (hm.get(ch[i])) + 1);

		}

		Set<Entry<Character, Integer>> entrySet = hm.entrySet();

		Iterator<Entry<Character, Integer>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry<Character, Integer> entry = itr.next();
			int i = (int) entry.getValue();
			if ((i) > 1) {
				System.out.println(entry.getKey() + "  " + entry.getValue());
			}
		}

	}
	
	// from Giddiah
	public static void largestFiboOfRange(){
		System.out.println("Enter two number to print Largest Number Between range");

		Scanner scn = new Scanner(System.in);
		
		int startNum = scn.nextInt();
		int endNum = scn.nextInt();
		
		int f=0, s=1, fib=0;
		
		while(s<=endNum){
			fib = f+s;
			f=s;
			s=fib;
			System.out.print(fib+" ");
		}
		System.out.println("\n"+fib);
	}
	
	
	// Tavant
	public static String checkBalance(String str) {
		// String[] strArra = {"{([])}","{([[)[])}","{([[)[])[[]" };
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '[' || ch == '(' || ch == '{') {
				stack.push(ch);
			} else if ((ch == ']' || ch == '}' || ch == ')') && (!stack.isEmpty())) {
				if (((char) stack.peek() == '(' && ch == ')') || ((char) stack.peek() == '{' && ch == '}')
						|| ((char) stack.peek() == '[' && ch == ']')) {
					stack.pop();
				} else {
					return "Not Balanced";
				}
			} else {
				if ((ch == ']' || ch == '}' || ch == ')')) {
					return "Not Balanced";
				}
			}
		}
		if (stack.isEmpty())
			return "Balanced Parenthisis";
		else
			return "Not Balanced";
	}
	
	// from Giddiah
	public static void checkConditionAndPrint(){
		System.out.println("Enter two number to print range between numbers : ");
		
		Scanner scn = new Scanner(System.in);
		
		int startNum = scn.nextInt();
		int endNum = scn.nextInt();
		
		//System.out.println(startNum+"  "+endNum);
		
		for(int i = startNum; i<=endNum; i++){
			
			if(i%3==0 && i%7 ==0){
				System.out.println("CLOUDNIX");
			}
			else if(i%3==0){
				System.out.println("CLOUD");
			}
			else if(i%7 ==0){
				System.out.println("NIX");
			}
			else System.out.println(i);
		}
	}
	
	// Starmark
	public static int recursionWithoutLoop_Findfactorial(int number) {
		if (number <= 1) {
			return 1;
		} else
			return number * recursionWithoutLoop_Findfactorial(number - 1);
	}
	
	// DXC
	public static void stringReverseByCount() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String for revers");

		String inputString = scan.next();

		System.out.println("Enter number of Charecters to shift");
		int charNumber = scan.nextInt();

		String result = inputString.substring(charNumber);
		String result1 = inputString.substring(0, charNumber);

		System.out.println(result);
		System.out.println(result1);
		String finalResult = result + result1;
		System.out.println(finalResult);

	}
	
	// CenturyLink
	public static void top2MaxNumFromArray(int[] arr) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int i : arr) {

			if (i > max1) {
				max2 = max1;
				max1 = i;
			}
		}
		System.out.println("Max1 = "+max1+" Max2= "+max2);
		
		// input :int[] arr = {5,7,10,2,1,20};
		// output : Max1 = 20 Max2= 10
	}
	
	// IBS
	public static void vowels_count(){
		try{	File f = new File("F:\\JavaWorkSpace\\Interview\\RealTime_Programs\\src\\company_IBS\\vowels.txt");
			    Scanner input = new Scanner(f);
			    String fileContent = "";
			    while (input.hasNext()){
			        fileContent += input.next() + " ";
			    }
			    input.close();
			    char[] charArr = fileContent.toCharArray();
			    
			    int a = 0; int e = 0; int i = 0; int o = 0; int u = 0;
			    Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
			    for (char c : charArr){
			    	switch (c){
			    	case 'a': case 'A':
			    	a++; break;
			    	case 'e': case 'E':
			    	e++; break;
			    	case 'i': case 'I':
			    	i++; break;
			    	case 'o': case 'O':
			    	o++; break;
			    	case 'u': case 'U':
			    	u++; break;
			        }
			    }
			    map.put('a', a);
			    map.put('e', e);
			    map.put('i', i);
			    map.put('o', o);
			    map.put('u', u);
			    System.out.println("The file has AEIOU values " + map + " times");
			}catch(Exception e){
				System.out.println(e);
			}
		}
	
	// i Admin
	public static void stringToDate() throws ParseException{
		String dateInString = "12022017";
		
		SimpleDateFormat formatter	= new SimpleDateFormat("ddMMyyy");
		Date date = formatter.parse(dateInString);
		
		System.out.println("Date is : "+date);
		
		System.out.println("entered String is : "+formatter.format(date));
	}
	
	// I Ween Software Solutions
	public static char firstNonRepChar(String str) {
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");

	}
	
	// I Ween Software Solutions
	public static void findPairClosestToZero(int[] arr){
		// Method :1
		if(arr.length<2)
	        return;
	    // Suppose 1st two element has minimum sum
	    int minimumSum=arr[0]+arr[1];
	    int pair1stIndex=0;
	    int pair2ndIndex=1;
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i+1; j < arr.length; j++) {
	            int tempSum=arr[i]+arr[j];
	            if(Math.abs(tempSum) < Math.abs(minimumSum))
	            {
	                pair1stIndex=i;
	                pair2ndIndex=j;
	                minimumSum=tempSum;
	            }
	        }
	    }
	    System.out.println(" The pair whose sum is closest to zero : "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
	
	    // method 2:
	    
	    // Sort the array, you can use any sorting algorithm to sort it
        Arrays.sort(arr);
        int sum=0; 
        int minimumSum1 = Integer.MAX_VALUE;
        int n=arr.length;
        if(n<0)
            return;
        // left and right index variables
        int l = 0, r = n-1;
 
        // variables to keep track of the left and right index pair for minimumSum
        int minLeft = l, minRight = n-1;
 
        while(l < r)
        {
            sum = arr[l] + arr[r];
 
            /*If abs(sum) is less than min sum, we need to update sum and pair */
            if(Math.abs(sum) < Math.abs(minimumSum1))
            {
                minimumSum1 = sum;
                minLeft = l;
                minRight = r;
            }
            if(sum < 0)
                l++;
            else
                r--;
        }
 
        System.out.println(" The pair whose sum is minimun : "+arr[minLeft]+" "+ arr[minRight]);
	}
	
	// I ween Software Solutions
	public static long sumOfMax2NoFrom_Array(int[] arr){
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>max1)
			{
				max2 = max1;
				max1 = arr[i];
				
			}
			
			
		}
		return max1+max2;
	}
	
	// Manhattan Associates
	public static void removeDuplicates(int[] arr){
		Arrays.sort(arr);
		// Return, if array is empty
        // or contains a single element
		int n = arr.length;
		if (n == 0 || n == 1)
            System.out.println("not valid array");
       
        // To store index of next unique element
        int j = 0;
       
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                //arr[j++] = arr[i];
                System.out.print(" "+arr[i]);
            }
        }
        System.out.println(" "+arr[arr.length-1]);
       
       /* arr[j++] = arr[n-1];
        int[] temp = new int[j];
		
		for(int i=0;i<j; i++){
			temp[i] = arr[i];
		}*/
		//System.out.println(Arrays.toString(temp));
	}
	
	// Manhattan Associates
	public static List<String> stringSplit(String str, char delimiter) {
		
		/*	String s = "Manhattan_Associates_Development_Pvt_Ltd";
			//System.out.println(stringSplit(s, '_'));
			Split_String_withOut_split_method.stringSplit(s, '_');
		 */
		        List<String> list = new ArrayList<String>(); // list is used to store the words
		        int i, start = 0, end = 0;
		        for (i = str.indexOf(delimiter); i != -1; i = str.indexOf(delimiter, i+1)) {
		            end = i;
		            list.add(str.substring(start, end)); // by using substring we can get the one word
		            start = i+1;
		        }
		    
		        list.add(str.substring(end+1)); // this is used to add the last word
		        System.out.println(list); // print the list
		        
		        // Converting list to array of strings
		        String words[] = (String[]) list.toArray(new String[list.size()]);
		        for (String word : words) {
		            System.out.println(word.trim());
		        }
			return list;
		}
	
		// Morlabs
		public static boolean reverseStringCheckPalindrom(String original){
	
			String revers ="";
			for (int i = original.length()-1; i >= 0; i--) {
				revers += original.charAt(i);
			}
			if(original.equals(revers))
			{
				System.out.println("given String is PALINDROM");
				return true;
			}
			else {
				System.out.println("given String is not PALINDROM");
				return false;
			}
		}
		
		// MicroGenesis
		public static String getOccurencesOfChars(String s){
			char[] cs = s.toCharArray();
			Map<Character, Integer> hm = new HashMap<>();
			String result = "";
			for(char c : cs){
				if(hm.containsKey(c)){
					hm.put(c, hm.get(c)+1);
				}
				else{
					hm.put(c, 1);
				}
				
			}
			for(char c : hm.keySet()){
				result += c+""+hm.get(c);
			}
			System.out.println(result);
			return result;
		}
		
		// MicroGenesis
		public static void reverseArray(int[] arr){
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]<arr[j]){
						max = arr[i];
						arr[i] =arr[j];
						arr[j]=max;
					}
				}
			}
			
			for(int i: arr){
				System.out.print(i+" ");
			}
		}
	
		
		// Novelsynth
		public static void textFileReading(){
			String str;
			try{
				
				File f = new File("D:\\JavaWorkSpace/Interview/RealTime_Programs/src/novelsynth/file.txt");
				
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
				while(( str = br.readLine())!=null)
				{
					System.out.println(str);
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	
		// Novelsynth
		public static void textFileWriter(){
			BufferedWriter bw = null;
			FileWriter fw = null;
			String FILENAME = "D:\\JavaWorkSpace/Interview/RealTime_Programs/src/novelsynth/write.txt";
			try {

				String content = "This is the content to write into file\n";

				fw = new FileWriter(FILENAME);
				bw = new BufferedWriter(fw);
				bw.write(content);
				bw.write("Nagaraju");

				System.out.println("Done");

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					if (bw != null)
						bw.close();

					if (fw != null)
						fw.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}

			}
		}
	
	
		// Novelsynth
		/*package interview.company.novelsynth;

		import java.io.File;
		import java.io.FileInputStream;

		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.ss.usermodel.WorkbookFactory;

		public class ExcelFileReading {

			public static <Cell> void main(String[] args) throws Exception {

				File f = new File("D:\\JavaWorkSpace/Interview/RealTime_Programs/src/novelsynth/file.xlsx");
				FileInputStream fis = new FileInputStream(f);
				Workbook wb = new WorkbookFactory().create(fis);
				Sheet s = wb.getSheet("Sheet1");

				int rno = s.getLastRowNum();
				for (int i = 0; i <= rno; i++) {
					Row row = s.getRow(i);
					int cno = row.getLastCellNum();
					for (int j = 0; j < cno; j++) {
						Cell cell = row.getCell(j);
						System.out.print(cell.getStringCellValue() + "    \t");
					}
					System.out.println();
				}
				System.out.println();

			}

		}
		*/
		
		// Novelsynth
		/*package interview.company.novelsynth;

		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileOutputStream;

		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.ss.usermodel.WorkbookFactory;

		public class ExcelFileWriting {

			public static void main(String[] args) throws Exception {
				File f = new File("D:\\JavaWorkSpace/Interview/RealTime_Programs/src/novelsynth/file.xlsx");
				
				FileInputStream fis = new FileInputStream(f);
				
				Workbook wb = WorkbookFactory.create(fis);
				Sheet st = wb.getSheet("Sheet2");
				Row r = st.getRow(0);
				Cell c = r.getCell(0);
				c.setCellValue("Nagaraju");
				FileOutputStream fos = new FileOutputStream(f);
				wb.write(fos);
				System.out.println("success");
			}
		}
		*/
	
		// OnMobile
		public static String merge(String s1, String s2) {
			// Function for alternatively merging two strings

			// To store the final string
			StringBuilder result = new StringBuilder();

			// For every index in the strings
			for (int i = 0; i < s1.length() || i < s2.length(); i++) {

				// First choose the ith character of the
				// first string if it exists
				if (i < s1.length())
					result.append(s1.charAt(i));

				// Then choose the ith character of the
				// second string if it exists
				if (i < s2.length())
					result.append(s2.charAt(i));
			}

			return result.toString();

		}
	
		// paladian
		public static long sumofNumerics(String str) {
			char[] ch = str.toCharArray();
			long total = 0;

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= '0' && ch[i] <= '9') {
					total += Long.parseLong(ch[i]+""); // char wont convert to Long so converting char to string and then Long
				}
			}
			return total;
		}
		
		// Radient
		public static String palinddrom(String str){
			
			String temp ="";
			for(int i =str.length()-1; i>=0;i--){
				temp += str.charAt(i);
			}
			if(temp.equals(str))
			{
				return "String "+str+" is Palindrom :"+temp;			
			}
			else {
				return "String "+str+" is not Palindrom :"+temp;
			}
			
		}
		
		
		// Sapience
		// Java is Strictly Pass by Value!
		public static int passByvVal_PassByRef(Integer i){
			 System.out.println("Entered method (value = " + i + ")");
			    i = 50;
			    System.out.println("Changed value within method (value = " + i + ")");
			    System.out.println("Leaving method (value = " + i + ")");
			//i= 20;
			return i;
		}
		
		// Starmark
		static int recursionWithoutLoop_factorial(int n) {
			if (n == 1)
				return 1;
			else
				return (n * recursionWithoutLoop_factorial(n - 1));
		}
		
		
		// Tongoe
		public static TreeMap<String, Integer> duplicateWordsCount(String fileName) {

			FileInputStream fis = null;
			//DataInputStream dis = null;
			BufferedReader br = null;
			TreeMap<String, Integer> wordMap = new TreeMap<String, Integer>();
			try {
				fis = new FileInputStream(fileName);
				//dis = new DataInputStream(fis);
				br = new BufferedReader(new InputStreamReader(fis));
				String line = null;

				while ((line = br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(line, " ");

					while (st.hasMoreTokens()) {
						String tmp = st.nextToken().toLowerCase();
						if (wordMap.containsKey(tmp)) {
							wordMap.put(tmp, wordMap.get(tmp) + 1);
						} else {
							wordMap.put(tmp, 1);
						}
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)
						br.close();
				} catch (Exception ex) {
				}
			}
			return wordMap;
		}
		
		
		public static void duplicatesCount(){
			List<String> list = new LinkedList<>();
			list.add("naga");
			list.add("naga");
			list.add("naga");
			list.add("king");
			list.add("king");
			list.add("nagaraju");
			list.add("king");
			Integer count = 0;

			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			
			for (String lsitStr : list)
			{
				count = hm.get(lsitStr);
				if (count == null) 
				{
					hm.put(lsitStr, 1);

				} else {
					hm.put(lsitStr, count + 1);

				}
			}
			System.out.println(hm);
		}
	
	public static void main(String[] args) {
		int[] arr = {9, 2, 7, 9, 3, 1, 9, 7};
		orderArrayBasedOnDuplicates(arr);
		
	}
	
	
}
