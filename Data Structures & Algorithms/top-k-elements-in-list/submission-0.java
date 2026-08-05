class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int num: nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length+1];

        for(int key: frequency.keySet()){
            int count = frequency.get(key);
            if(bucket[count] == null){
                bucket[count] = new ArrayList<>();
            }

            bucket[count].add(key);
        }

        int[] result = new int[k];
        int index = 0;
        for(int i = nums.length; i>=0 && index<k; i--){
            if(bucket[i] != null){
                for(int num: bucket[i]){
                    result[index++] = num;
                    if(index==k){
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
