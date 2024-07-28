function solution(s) {
  const stack = [];

  for (const word of s) {
      if (stack.length > 0 && stack[stack.length - 1] === word) {
          stack.pop(); 
      } else {
          stack.push(word); 
      }
  }

  return stack.length === 0 ? 1 : 0;
}

/* 
function solution(s) {
    const arr = s.split("");
    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] !== arr[i+1]) {
            continue;
        } else {
            arr.splice(i, 2);
        }
    }
    return arr.length === 0 ? 1 : 0;
}
*/