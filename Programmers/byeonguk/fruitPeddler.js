const solution = (k, m, score) => {
  let result = 0;
  score.sort((a, b) => b - a);
  if (score.length < m) {
      return 0;
  } else {
      for (let i = m; i <= score.length; i += m) {
          result += score[i - 1] * m;
      }
  }
  return result;
}