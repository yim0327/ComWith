function solution(n) {
  let result = "";
  const arr = String(n).split('').sort((a, b) => b - a);
  for (let i = 0; i < arr.length; i++) {
      result += arr[i];
  }
  return Number(result);
}