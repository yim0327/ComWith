function solution(number, limit, power) {
  let list = [];
  let result = 0;
  for (let i = 1; i <= number; i++) {
      list.push(divisor(i));
  }
  for (let i = 0; i < list.length; i++) {
      (list[i] <= limit) ? result += list[i] : result += power;
  }
  return result;
}

// 약수의 개수를 구하는 함수
function divisor(num) {
  let count = 0;
  let left_p = 1;
  while (left_p * left_p <= num) {
      if (num % left_p === 0) {
          // 약수 쌍을 찾아서 두 번 카운트
          if (left_p * left_p === num) {
              count++;
          } else {
              count += 2;
          }
      }
      left_p++;
  }
  return count;
}

/*
(첫 시도 : 시간 초과)
function solution(number, limit, power) {
    let list = [];
    let result = 0;
    for (let i = 1; i <= number; i++) {
        list.push(divisor(i));
    }
    for (let i = 0; i < list.length; i++) {
        (list[i] <= limit) ? result += list[i] : result += power;
    }
    return result;
}

//  약수의 개수를 구하는 함수
function divisor(num) {
    let count = 0;
    let left_p = 1;
    let right_p = num;

    while (left_p <= right_p) {
        if (num % left_p === 0) {
            count++;
        }
        left_p++;
    }
    
    return count;
}
*/