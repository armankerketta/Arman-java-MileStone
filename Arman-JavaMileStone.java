
class Solution {
    public void lengthOfLastWord(String s) {
        int i=s.length()-1;
    
        while((i>=0) &&(s.charAt(i)==' ')){
                i--;
            }
        int j=i;
        while((j>=0)&&(s.charAt(j)!=' ')){
                j--;
        }
        System.out.println(i-j);
    }
    
}

class TestSol {
	public static void main(String args[]){
	Solution sol=new Solution();
	sol.lengthOfLastWord("Hello i am");
	}
}