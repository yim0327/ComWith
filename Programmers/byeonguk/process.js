function solution(priorities, location) {
  let count = 0;
  let max = Math.max(...priorities);
  
  while (priorities.length > 0) {
      const current = priorities.shift();
      if (current === max) {
          count++;
          if (location === 0) return count;
          max = Math.max(...priorities);
      } else {
          priorities.push(current);
      }
      location = (location === 0) ? priorities.length - 1 : location - 1; 
  }
}