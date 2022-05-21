import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public static void main(String[] args) {
        Date date=new Date();
        String f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime());
        System.out.println(f);
    }
    public static int  titleToNumber(String columnTitle) {
        char[] c=new char[26];
        for (int i=0;i<26;i++){
            c[i]=(char) (65+i);
        }
        int x=0;
        for (int i=0;i<columnTitle.length();i++){
            x+=findVal(columnTitle.charAt(i),c)*(int) Math.pow(26,columnTitle.length()-1-i);
        }
        return x;
    }
    public static int findVal(char c,char[] chars){
        int val=0;
        for (int x=0;x<chars.length;x++){
            if (c==chars[x]){
                val=x;
            }
        }
        return val+1;
    }
    public static int[] getConcatenation(int[] nums) {
        int[] array=new int[nums.length*2];
        System.arraycopy(nums,0,array,0,nums.length);
        System.arraycopy(nums,0,array,nums.length,nums.length);


        return array;
    }
    public static int searchInsert(int[] nums, int target) {
        int top=0;
        int bottom=nums.length;
        if (nums[0]==target) return 0;
        if (nums[nums.length-1]==target) return nums.length-1;
        while (top<bottom){
            int tem=(top+bottom)/2;
            if (target==nums[tem])
                return tem;
            if (target>nums[tem])
                top=tem+1;
            if (target<nums[tem])
                bottom=bottom-1;
        }
        return top;
    }
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            int temp=s.charAt(i);
            if (stack.isEmpty()){
                if (temp=='}') return false;
                if (temp==')')return false;
                if (temp==']')return false;
            }else{
                if ((stack.peek()=='{'&&temp=='}')){
                    stack.pop();
                    continue;
                }
                if ((stack.peek()=='['&&temp==']')) {
                    stack.pop();
                    continue;
                }
                if ((stack.peek()=='('&&temp==')')) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> integerList=new ArrayList<>();
        for (;left<=right;left++){
            if (isDevideNum(left))
                integerList.add(left);
        }
        return integerList;
    }
    public static boolean isDevideNum(int val){
        int count=0;
        int temp=val;
        while (temp>0){
            temp=temp/10;
            count++;
        }
        for (int i=0;i<count;i++){
            int t= (int) ((val% Math.pow(10,i+1))/Math.pow(10,i));
            if (t==0)
                return false;
            if (val%t==0)
                continue;
            else return false;
        }
        return true;
    }
    public static int countValidWords(String sentence) {
        String pattern = "\\w+";
        boolean m=Pattern.matches(sentence,pattern);
        System.out.println("{{{}{}{}{}"+m);
        return 0;
    }
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)==str.charAt(str.length()-1-i))
                continue;
        }
        return false;
    }
    public static int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=0;
        char c=' ';
        for (int i=0;i<s.length();i++){
            c=s.charAt(i);
            if (c=='I'&&(i+1<s.length())&&((s.charAt(i+1)=='V')|(s.charAt(i+1)=='X'))) {
                if (s.charAt(i+1)=='V') {
                    sum += map.get('V') - map.get('I');
                }else {
                    sum+=map.get('X')-map.get('I');
                }
                i++;
                continue;
            }
            if (c=='X'&&i+1<s.length()&&((s.charAt(i+1)=='L')|(s.charAt(i+1)=='C'))) {
                if (s.charAt(i+1)=='L') {
                    sum += map.get('L') - map.get('X');
                }else {
                    sum+=map.get('C')-map.get('X');
                }
                i++;
                continue;
            }
            if (c=='C'&&i+1<s.length()&&((s.charAt(i+1)=='D')|(s.charAt(i+1)=='M'))) {
                if (s.charAt(i+1)=='D') {
                    sum += map.get('D') - map.get('C');
                }else {
                    sum+=map.get('M')-map.get('C');
                }
                i++;
                continue;
            }
            sum+=map.get(s.charAt(i));
        }
        return sum;
    }
    public static int reverse(int x) {
        int resultVal;
        int i=0;
        Stack<Integer> s=new Stack<>();
        resultVal=x;
        resultVal=Math.abs(resultVal);
        while (resultVal>0){
            resultVal=resultVal/10;
            int t=(int) (x%Math.pow(10,i+1)/Math.pow(10,i));
            if (t!=0||(t==0&i>0))
                s.push(t);
            i++;
        }
        i=0;
        resultVal=0;
        while (!s.isEmpty()){
            resultVal+=s.pop()*Math.pow(10,i++);
        }
        if((resultVal==2147483647)|(resultVal==-2147483648))
            return 0;
        else
            return resultVal;

    }
    public static void moveZeroes(int[] nums) {
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        while (j<nums.length){
            nums[j]=0;
            j++;
        }
//        System.out.println(Arrays.toString(nums));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        Map<Character,Integer> map=new HashMap<>();
        int i=0;
        while (i<26){
            map.put((char)((i++)+97) ,i+1);
        }
        i=0;
        for (;i<letters.length;i++){
            if (map.get(target)<map.get(letters[i]))
                return letters[i];
        }
        return letters[0];
    }
    public static String longestPalindrome(String s) {
        int top=0;
        int bottom=s.length()-1;
        int count=0;
        while (bottom>=top){
            if (s.charAt(top)==s.charAt(bottom)){
                count++;
            }else {
                count=0;
            }
            top++;
            bottom--;
        }
        if (s.length()%2==0) {

            String s1=s.substring(s.length()/2-count+1,count+1);
            System.out.println(s1);
            return s1;
        }else{
            System.out.println(count);
            String str=s.substring(s.length()/2-1,s.length()/2+2);
            System.out.println(str);
            return str;
        }
    }
    public static void pos(){
        System.out.println((double)(4>>1));
    }
    public static int fib(int n) {
        if (n==1)
            return 1;
        if (n==0)
            return 0;
        if (n>1)
            return fib(n-1)+fib(n-2);
        else return -1;
    }
//    public static String intToRoman(int num) {
//        Map<Integer,String> map=new HashMap<>();
//        {
//            map.put(1,"I");
//            map.put(4,"IV");
//            map.put(5,"V");
//            map.put(9,"IX");
//            map.put(10,"X");
//            map.put(40,"XL");
//            map.put(50,"L");
//            map.put(90,"XC");
//            map.put(100,"C");
//            map.put(400,"CD");
//            map.put(500,"D");
//            map.put(900,"CM");
//            map.put(1000,"M");
//        }
//        StringBuffer stringBuffer=new StringBuffer();
//        while (num>map.){
//        }
//        stringBuffer.append("c");
//        System.out.println(stringBuffer);
//        return "s";
//    }
    public static int findRepeatNumber(int[] nums) {
        int[] count=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for (int i=0;i<count.length;i++){
            if (count[i]>=2)
                return i;
        }
        return 1;
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0;i<nums2.length;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
    public static boolean canJump(int[] nums) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0)
                continue;
            else
                return false;
        }
        if (nums.length<2&&nums[0]==0)
            return true;
        return true;
    }
//    基数排序
    public static void radixSort(int[] nums) {
        int max=nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i]>max)
                max=nums[i];
        }
        int count=0;
        while (max!=0){
            max=max/10;
            count++;
        }
        int[] count1=new int[10];
        for (int i=0;i<nums.length;i++){
            count1[nums[i]%10]++;
        }
        for (int i=1;i<count1.length;i++){
            count1[i]+=count1[i-1];
        }
        int[] nums1=new int[nums.length];
        for (int i=nums.length-1;i>=0;i--){
            nums1[count1[nums[i]%10]-1]=nums[i];
            count1[nums[i]%10]--;
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=nums1[i];
        }
    }
    public static int lengthOfLastWord(String s) {
        String[] strings=s.split(" ");
        String val=strings[strings.length-1];
        return val.length();
    }
    public static double myPow(double x, int n) {
        if(n==1){
            return x;
        }
        if(n>1){
            x*=myPow(x,n-1);
        }
        if(n<0){
            return 1/rtval(x,-n);
        }
        return x ;
    }
    public static double rtval(double val,int num){
        String ss="ssss";

        double t=val;
        while(num>1){
            val*=t;
            num--;
        }
        return val;
    }
//  定义一个二叉树
    public static class TreeNode {



        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
//    treeNode root;


}
