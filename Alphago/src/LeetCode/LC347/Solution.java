package LeetCode.LC347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * Runtime: 18 ms, faster than 13.26% of Java online submissions for Top K Frequent Elements.
 * */
/*
 * Given a non-empty array of integers, return the k most frequent elements.
 * 
 * */



//getorDefault() = 찾는 키가 존재하면 해당 키의 값을 반환함
public class Solution {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int num: nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		int[] n = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			n[i] = 0;
		}
		
		List<Integer>[] temp = new List[nums.length+1];
		
		for(Integer key : map.keySet()) {
			int count = map.get(key);
//			System.out.println("count:"+count);
//			
//			for(int i=0; i<nums.length; i++) {
//				if(nums[i] == count) {
//					n[count] += 1;
//				}
//				
//				System.out.println("n("+ count+ "): " + n[count]);
//			}
			
			 if (temp[count] == null) {
	                temp[count] = new ArrayList<>();
	            }	
			 
			 System.out.println(temp[count].add(key));
			
		}
		
		List<Integer> list = new ArrayList<>();
        for (int i = temp.length - 1; i >= 0 && list.size() < k; i--) {
            if (temp[i] == null) continue;
            list.addAll(temp[i]);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
            
            System.out.println(res[i]);
        }

        return res;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		
	Solution s1 = new Solution();
		
		s1.topKFrequent(nums, 2);
		
//		String[] arr = {"a", "b", "c", "a"};
//		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		
//		for(String s : arr) {
//			map.put(s, map.getOrDefault(s, 0) +1);
//			
//			System.out.println(map);
//		}
//		
//		System.out.println(map.get(1));
	}
}
