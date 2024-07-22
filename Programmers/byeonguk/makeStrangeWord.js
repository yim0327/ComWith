function solution(s) {
  let result = [];
  let arr = s.split(" ");
  for (let i = 0; i < arr.length; i++) {
      let answer = "";
      for (let j = 0; j < arr[i].length; j++) {
          if (j % 2 === 1) {
              answer += arr[i][j].toLowerCase();
          } else {
              answer += arr[i][j].toUpperCase();
          }
      }
      result.push(answer);
  }
  return result.join(" ");
}