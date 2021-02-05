/* Runtime: 308 ms, faster than 26.78% of JavaScript online submissions for Palindromic Substrings. */
/* 
LeetCode.647 Palindromic Substrings.

Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

*/


/**
 * @param {string} s
 * @return {number}
 */
var countSubstrings = function(s) {
    var ans=0;

    for(var start=0; start<s.length; start++){
        for(var end=start; end<s.length; end++){
            ans += palindrome(s,start, end) ? 1:0;  //맞으면 count 추가
        }
    }

    console.log(ans);
    return ans;
};

var palindrome = function(s, start, end){
    while(start<end){
        if(s.charAt(start) != s.charAt(end)){
            return false
        }
        
        start++;
        end--;

    }

    return true;
}

countSubstrings("abc");