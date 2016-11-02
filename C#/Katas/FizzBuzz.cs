public class Solution {
    public IList<string> FizzBuzz(int n) {
        List<string> fbList = new List<string>();
        
        for(var i=1; i<=n; i++){
            if(i%15==0) {
                fbList.Add("FizzBuzz");
            }
            else if(i%3==0){
                fbList.Add("Fizz");
            }
            else if(i%5==0){
                fbList.Add("Buzz");
            }
            else {
                fbList.Add(i.ToString());
            }
        }
        
        return fbList;
    }
}