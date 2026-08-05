class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i< str.length()){
            int delimiterIdx = str.indexOf("#", i);

            int length = Integer.parseInt(str.substring(i, delimiterIdx));

            i = delimiterIdx+1;
            String s = str.substring(i, i+length);
            result.add(s);

            i+=length;
        }
        
        return result;
    }
}
