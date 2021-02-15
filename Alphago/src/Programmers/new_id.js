/*
1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

*/
/*
테스트 1 〉   통과 (0.29ms, 30.2MB)
테스트 2 〉   통과 (0.29ms, 30.2MB)
테스트 3 〉   통과 (0.32ms, 30.1MB)
테스트 4 〉   통과 (0.31ms, 30MB)
테스트 5 〉   통과 (3.52ms, 30.2MB)
테스트 6 〉   통과 (0.29ms, 29.8MB)
테스트 7 〉   통과 (0.30ms, 30.1MB)
테스트 8 〉   통과 (0.32ms, 30.3MB)
테스트 9 〉   통과 (2.93ms, 30.1MB)
테스트 10 〉   통과 (0.30ms, 30.3MB)
테스트 11 〉   통과 (0.29ms, 30.1MB)
테스트 12 〉   통과 (0.30ms, 30.2MB)
테스트 13 〉   통과 (0.32ms, 30.2MB)
테스트 14 〉   통과 (0.32ms, 30.1MB)
테스트 15 〉   통과 (0.30ms, 30.3MB)
테스트 16 〉   통과 (2.84ms, 30.2MB)
테스트 17 〉   통과 (0.34ms, 30.1MB)
테스트 18 〉   통과 (0.32ms, 30.2MB)
테스트 19 〉   통과 (2.73ms, 30.1MB)
테스트 20 〉   통과 (4.98ms, 30.3MB)
테스트 21 〉   통과 (5.77ms, 30.3MB)
테스트 22 〉   통과 (0.36ms, 30.4MB)
테스트 23 〉   통과 (8.19ms, 30.1MB)
테스트 24 〉   통과 (0.32ms, 30.1MB)
테스트 25 〉   통과 (0.32ms, 30.3MB)
테스트 26 〉   통과 (0.31ms, 30.1MB)
*/

function solution(new_id) {
    const rwChar = /[\{\}\[\]\/?,;:|\)*~`!^\+<>@\#$%&\\\=\(\'\"]/gi;

    new_id = new_id.toLowerCase();  //1
    new_id = new_id.replace(rwChar,''); //2
    new_id = new_id.replaceAll("[\\.]{2,}", ".") // 3번
    new_id = new_id.replaceAll("^\\.|\\.$", "");     //4
    new_id = new_id.replace(/^$/, 'a') ;//5
    new_id = new_id.slice(0, 15).replace(/\.$/, '');//6

    if (new_id.length < 3) {
        const len = 3 - new_id.length
        const char = new_id.charAt(new_id.length - 1)
        for (let i = 0; i < len; i++) {
            new_id = new_id.concat(char)
        }
    }


   
    return new_id;
}