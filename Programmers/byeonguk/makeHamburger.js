function solution(ingredient) {
  let result = 0;
  const stack = [];
  const target = "1231";

  for (let i = 0; i < ingredient.length; i++) {
      stack.push(ingredient[i]);
      if (stack.length >= 4) {
          if (stack.slice(-4).join('') === target) {
              stack.splice(-4, 4);
              result++;
          }
      }
  }
  return result;
}

/*
function solution(ingredient) {
    let result = 0;
    const target = [1, 2, 3, 1];
    let i = 0;
    
    while (i <= ingredient.length - 4) {
        if (ingredient.slice(i, i + 4).join('') === target.join('')) {
            result++;
            ingredient.splice(i, 4);
            // 배열을 수정했으므로 다시 처음부터 검사
            i = 0;
        } else {
            i++;
        }
    }
    
    return result;
}
*/