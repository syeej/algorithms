function solution(myString, pat) {
    var answer = myString.toUpperCase().includes(pat.toUpperCase())?1:0;
    return answer;
}