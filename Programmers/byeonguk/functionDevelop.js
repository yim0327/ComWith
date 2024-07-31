function solution(progresses, speeds) {
  const days = (progress, speed) => Math.ceil((100 - progress) / speed);  
  const completeDay = progresses.map((progress, index) => days(progress, speeds[index]));  
  const result = [];

  let deployProgress = completeDay[0]; 
  let count = 1;

  for (let i = 1; i < completeDay.length; i++) {
      if (completeDay[i] <= deployProgress) {
          count++;
      } else {
          result.push(count);
          deployProgress = completeDay[i];
          count = 1;
      }
  }
  result.push(count);
  return result;
}