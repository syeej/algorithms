function solution(numbers) {
    var sum = 0;
    for(let n of numbers){
        sum+=n;
    }
    var answer = sum/numbers.length;
    return answer;
}