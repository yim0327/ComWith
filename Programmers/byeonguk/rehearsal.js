function solution(answers) {
  const score = [0, 0, 0];
  const patterns =[
      [1, 2, 3, 4, 5],
      [2, 1, 2, 3, 2, 4, 2, 5],
      [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
  ];

  for (const [i, answer] of answers.entries()) {
      for (const [j, pattern] of patterns.entries()) {
         if(answer === pattern[i % pattern.length]) {
             score[j] += 1;
         }
      }
  }

  const maxScore = Math.max(...score);
  const highestScore = [];
  for (let i = 0; i < score.length; i++) {
      score[i] === maxScore ? highestScore.push(i + 1) : null;
  }
  return highestScore;
}