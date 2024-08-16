function solution(N, stages) {
  const counts = {};  //  각 스테이지에 남아 있는 스테이지-유저 수 객체 생성
  const fail_rate = [];  //  각 스테이지별 실패율 배열

  for (let i = 1; i <= N; i++) {
      counts[i] = 0;
  }

  stages.forEach(num => {  //  각 스테이지별 유저 수 파악
      if (num <= N) { 
          counts[num]++;
      }
  });

  let totalUsers = stages.length;  //  총 유저 수

  for (let i = 1; i <= N; i++) {
      const failRate = totalUsers === 0 ? 0 : counts[i] / totalUsers;
      fail_rate.push({ value: failRate, index: i });
      totalUsers -= counts[i];  //  계산된 스테이지의 유저 수 제외
  }

  fail_rate.sort((a, b) => b.value - a.value || a.index - b.index);
  return fail_rate.map(item => item.index);
}